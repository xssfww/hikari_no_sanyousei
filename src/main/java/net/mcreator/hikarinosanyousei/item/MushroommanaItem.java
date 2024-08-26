
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.MushroommanaWanJiaWanChengShiYongWuPinShiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class MushroommanaItem extends Item {
	public MushroommanaItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_OTHER).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(3f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5145\u65A5\u7740\u6DF7\u4E71\u9B54\u529B\u7684\u8611\u83C7...\u770B\u8D77\u6765\u4E0D\u80FD\u76F4\u63A5\u5403\uFF0C\u4EA4\u7ED9\u4E13\u4E1A\u4EBA\u58EB\u5904\u7406\u5427\u3002\u2014\u2014\u65AF\u5854"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MushroommanaWanJiaWanChengShiYongWuPinShiProcedure.execute(entity);
		return retval;
	}
}
