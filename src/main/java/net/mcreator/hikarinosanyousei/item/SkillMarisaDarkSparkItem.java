
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.SkillMarisastardustreverieDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class SkillMarisaDarkSparkItem extends Item {
	public SkillMarisaDarkSparkItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4E3A\u00A76\u8FF7\u4F60\u516B\u5366\u7089\u00A7f\u88C5\u5907"));
		list.add(new TextComponent("\u4F7F\u7528 \u00A76 MasterSpark \u00A7f\u65F6\uFF0C\u5C06\u4F1A\u653E\u5C04\u51FA\u5F3A\u5927\u81F3\u8DB3\u4EE5\u7834\u574F\u65B9\u5757\u7684\u956D\u5C04\u3002"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SkillMarisastardustreverieDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
	}
}
