
package net.mcreator.hikarinosanyousei.item;

import software.bernie.geckolib3.util.GeckoLibUtil;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.builder.ILoopType.EDefaultLoopTypes;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.IAnimatable;

import net.minecraftforge.client.IItemRenderProperties;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;

import net.mcreator.hikarinosanyousei.procedures.LoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.procedures.LoukankenDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure;
import net.mcreator.hikarinosanyousei.item.renderer.LoukankenItemRenderer;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.function.Consumer;
import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class LoukankenItem extends Item implements IAnimatable {
	public AnimationFactory factory = GeckoLibUtil.createFactory(this);
	public String animationprocedure = "empty";
	public static ItemTransforms.TransformType transformType;

	public LoukankenItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void initializeClient(Consumer<IItemRenderProperties> consumer) {
		super.initializeClient(consumer);
		consumer.accept(new IItemRenderProperties() {
			private final BlockEntityWithoutLevelRenderer renderer = new LoukankenItemRenderer();

			@Override
			public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
				return renderer;
			}
		});
	}

	public void getTransformType(ItemTransforms.TransformType type) {
		this.transformType = type;
	}

	protected void interpretFirstPersonInstructions(List<String> tokens, LoukankenItemRenderer renderer) {
		String firstTok = tokens.get(0);
		if (tokens.size() < 2)
			return;
		String boneName = tokens.get(1);
		if (firstTok.equals("set_hidden")) {
			boolean hidden = Boolean.valueOf(tokens.get(2));
			renderer.hideBone(boneName, hidden);
		} else if (firstTok.equals("move")) {
			float x = Float.valueOf(tokens.get(2));
			float y = Float.valueOf(tokens.get(3));
			float z = Float.valueOf(tokens.get(4));
			renderer.setBonePosition(boneName, x, y, z);
		} else if (firstTok.equals("rotate")) {
			float x = Float.valueOf(tokens.get(2));
			float y = Float.valueOf(tokens.get(3));
			float z = Float.valueOf(tokens.get(4));
			renderer.setBoneRotation(boneName, x, y, z);
		} else if (firstTok.equals("suppress_mod")) {
			renderer.suppressModification(boneName);
		} else if (firstTok.equals("allow_mod")) {
			renderer.allowModification(boneName);
		}
	}

	private <P extends Item & IAnimatable> PlayState idlePredicate(AnimationEvent<P> event) {
		if (this.transformType != null ? true : false) {
			if (this.animationprocedure.equals("empty")) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("loukanken", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			}
		}
		return PlayState.STOP;
	}

	private <P extends Item & IAnimatable> PlayState procedurePredicate(AnimationEvent<P> event) {
		if (this.transformType != null ? true : false) {
			if (!(this.animationprocedure.equals("empty")) && event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation(this.animationprocedure, EDefaultLoopTypes.PLAY_ONCE));
				if (event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
					this.animationprocedure = "empty";
					event.getController().markNeedsReload();
				}
			}
		}
		return PlayState.CONTINUE;
	}

	public void setupAnimationState(LoukankenItemRenderer renderer, ItemStack stack, PoseStack matrixStack, float aimProgress) {
	}

	@Override
	public void registerControllers(AnimationData data) {
		AnimationController procedureController = new AnimationController(this, "procedureController", 0, this::procedurePredicate);
		data.addAnimationController(procedureController);
		AnimationController idleController = new AnimationController(this, "idleController", 0, this::idlePredicate);
		data.addAnimationController(idleController);
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 1.4F;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 2d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u8FD9\u628A\u697C\u89C2\u5251\u65A9\u4E0D\u65AD\u7684\u4E1C\u897F\uFF0C\u51E0\u4E4E\u4E0D\u5B58\u5728\uFF01\u2014\u2014\u5996\u68A6"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		LoukankenDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure.execute(entity);
		return retval;
	}
}
