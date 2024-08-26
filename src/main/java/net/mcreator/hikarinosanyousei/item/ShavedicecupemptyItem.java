
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

public class ShavedicecupemptyItem extends Item {
	public ShavedicecupemptyItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u653E\u8FDB\u5228\u51B0\u673A\u91CC\u6363\u788E\u51B0\u5757\u5C31\u80FD\u83B7\u5F97\u53C8\u51C9\u53C8\u751C\u7684\u5228\u51B0\u4E86\uFF0C\u5728\u590F\u5929\u7684\u65F6\u5019\u5F88\u597D\u5403\u54E6\u3002\u2014\u2014\u65AF\u5854"));
	}
}
