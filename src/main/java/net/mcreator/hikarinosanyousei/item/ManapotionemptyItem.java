
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

public class ManapotionemptyItem extends Item {
	public ManapotionemptyItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_POTION).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4E00\u79CD\u7528\u6765\u65B9\u4FBF\u50A8\u5B58\u5404\u79CD\u836F\u6C34\u7684\u74F6\u5B50\u3002\u2014\u2014\u9B54\u7406\u6C99"));
	}
}
