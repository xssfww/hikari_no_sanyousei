
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.InsertaSunnymilkbottleintoacherryblossombranchDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class InsertaSunnymilkbottleintoacherryblossombranchItem extends Item {
	public InsertaSunnymilkbottleintoacherryblossombranchItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).durability(9601).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u6A31\u82B1\u679D\u6761\u63D2\u8FDB\u53BB\uFF0C\u597D\u5E0C\u671B\u80FD\u770B\u5230\u76DB\u5F00\u54E6\u3002\u2014\u2014\u65AF\u5854"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		InsertaSunnymilkbottleintoacherryblossombranchDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity, itemstack);
	}
}
