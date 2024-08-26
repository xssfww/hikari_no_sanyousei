
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

public class PoetryRaftEmptyItem extends Item {
	public PoetryRaftEmptyItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4E03\u5915\u65F6\u7528\u6765\u88C5\u9970\u6811\u7684\u3002\u8BD7\u7B3A\u8FD8\u662F\u653E\u5728\u6700\u8DDD\u79BB\u661F\u7A7A\u7684\u5730\u65B9\u6700\u597D\u5566\u3002\u2014\u2014\u65AF\u5854"));
	}
}
