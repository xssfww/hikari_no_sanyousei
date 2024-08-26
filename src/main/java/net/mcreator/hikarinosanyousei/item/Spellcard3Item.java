
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

public class Spellcard3Item extends Item {
	public Spellcard3Item() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u7A7A\u7684\u7B26\u5361\uFF0C\u80FD\u5C01\u5165\u56FA\u5B9A\u5F62\u5F0F\u7684\u7565\u4E3A\u5F3A\u529B\u7684\u5F39\u5E55\u5E76\u91CD\u73B0\u51FA\u6765\u3002"));
	}
}
