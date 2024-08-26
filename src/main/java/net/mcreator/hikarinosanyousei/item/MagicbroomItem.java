
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.MagicbroomdangshitibeigongjujizhongshiProcedure;
import net.mcreator.hikarinosanyousei.procedures.MagicbroomDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.procedures.MagicbroomDangGongJuChuXianZaiShouZhongShiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class MagicbroomItem extends SwordItem {
	public MagicbroomItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_OTHER));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MagicbroomdangshitibeigongjujizhongshiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MagicbroomDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u867D\u8BF4\u4E0D\u9700\u8981\u626B\u5E1A\u5C31\u80FD\u98DE\uFF0C\u4F46\u6211\u8FD8\u662F\u559C\u6B22\u7528\u8FD9\u628A\u626B\u5E1A\u554A\u3002\u4E0D\u4EC5\u5750\u7740\u98DE\u5F88\u8212\u670D\uFF0C\u6700\u91CD\u8981\u7684\u662F\u80FD\u51F8\u663E\u6211\u662F\u4EBA\u7C7B\u3002\u2014\u2014\u9B54\u7406\u6C99"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MagicbroomDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity);
	}
}
