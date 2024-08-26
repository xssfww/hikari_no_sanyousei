
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.SkillFinalSparkuseProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class SkillMarisaFinalsparkItem extends Item {
	public SkillMarisaFinalsparkItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4E3A\u00A7e\u8FF7\u4F60\u516B\u5366\u7089\u00A7f\u88C5\u5907\u540E"));
		list.add(new TextComponent("\u80CC\u5305\u4E2D\u6301\u6709 \u00A7eMasterSpark\u7B26\u5361\u00A7f \u4E0E \u00A79\u706B\u529B\u836F\u6C34\u00A7f \u65F6\uFF0C"));
		list.add(new TextComponent("\u6309\u4E0B\u53F3\u952E\u53D1\u5C04\u5C06\u4E00\u5207\u5316\u4E3A\u4E4C\u6709\u7684\u00A74\u7EC8\u7109\u706B\u82B1\u00A7f\u3002"));
		list.add(new TextComponent("\u00A76\u201D\u662F\u65F6\u5019\u7ED3\u675F\u4E86\uFF0C\u6765\u63A5\u4F4F\u6211\u8FD9\u4E00\u62DB\u5427\uFF01\u201C"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SkillFinalSparkuseProcedure.execute(entity);
	}
}
