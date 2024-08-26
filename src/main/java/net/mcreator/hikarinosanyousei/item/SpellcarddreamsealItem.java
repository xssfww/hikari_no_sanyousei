
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class SpellcarddreamsealItem extends Item {
	public SpellcarddreamsealItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u68A6\u60F3\u7CFB\u7B26\u5361\u7684\u6700\u7EC8\u4F53\uFF0C\u62E5\u6709\u7740\u65E0\u4E0E\u4F26\u6BD4\u7684\u5C01\u5370\u529B\u3002"));
		list.add(new TextComponent("\u521B\u9020\u6A21\u5F0F\u4E13\u7528"));
	}
}
