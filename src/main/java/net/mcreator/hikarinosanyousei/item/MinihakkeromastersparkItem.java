
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.MinihakkeromastersparkDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.MinihakkeromastersparkDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class MinihakkeromastersparkItem extends Item {
	public MinihakkeromastersparkItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u88C5\u8F7D\u7740\u6781\u9650\u706B\u82B1\u84C4\u80FD\u7684\u8FF7\u4F60\u516B\u5366\u7089"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MinihakkeromastersparkDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		MinihakkeromastersparkDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
	}
}
