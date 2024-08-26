
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.RoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.procedures.RoukankenDangShiTiHuiDongWuPinShiProcedure;
import net.mcreator.hikarinosanyousei.procedures.RoukankenDangShiTiBeiGongJuJiZhongShiProcedure;
import net.mcreator.hikarinosanyousei.procedures.RoukankenDangGongJuChuXianZaiShouZhongShiProcedure;

import java.util.List;

public class RoukankenItem extends SwordItem {
	public RoukankenItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().tab(null));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RoukankenDangShiTiBeiGongJuJiZhongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		RoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, entity);
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u8FD9\u628A\u697C\u89C2\u5251\u65A9\u4E0D\u65AD\u7684\u4E1C\u897F\uFF0C\u51E0\u4E4E\u4E0D\u5B58\u5728\uFF01\u2014\u2014\u5996\u68A6"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(context.getLevel(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		RoukankenDangShiTiHuiDongWuPinShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			RoukankenDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity, itemstack);
	}
}
