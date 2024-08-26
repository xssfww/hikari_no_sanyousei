
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;
import net.mcreator.hikarinosanyousei.entity.ShootsapphireEntity;

import java.util.List;

public class ShootsapphireItem extends Item {
	public ShootsapphireItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).durability(100));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u53F3\u952E\u4EE5\u8FDE\u7EED\u55B7\u5C04\u661F\u661F\u5F39\u5E55\uFF0C\u5F39\u5E55\u4F1A\u5728\u78B0\u5230\u65B9\u5757\u6216\u5B9E\u4F53\u65F6\u4EA7\u751F\u7206\u70B8\u3002"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
		Level world = entityLiving.level;
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				ShootsapphireEntity entityarrow = ShootsapphireEntity.shoot(world, entity, world.getRandom(), 3f, 1, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				entity.releaseUsingItem();
			}
		}
	}
}
