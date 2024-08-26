
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

public class SkillMarisastardustreverieItem extends Item {
	public SkillMarisastardustreverieItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u4E3A\u00A70\u8FF7\u4F60\u00A7f\u516B\u5366\u00A7e\u7089\u00A7f\u88C5\u5907\u540E\uFF0C\u6BCF\u6B21\u6309\u4E0B\u53F3\u952E\u90FD\u80FD\u53D1\u5C04\u6570\u679A\u00A79\u661F\u00A7b\u661F\u00A7a\u5F39\u00A7e\u5E55\u00A7f\u3002"));
		list.add(new TextComponent("\u00A79\u636E\u8BF4\uFF0C\u8FD9\u4E9B\u661F\u661F\u5F39\u5E55\u90FD\u662F\u53EF\u4EE5\u98DF\u7528\u7684\u91D1\u5E73\u7CD6\u3002"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SkillMarisastardustreverieDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
	}
}
