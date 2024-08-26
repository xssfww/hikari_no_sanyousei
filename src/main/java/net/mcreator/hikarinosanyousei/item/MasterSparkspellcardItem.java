
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

public class MasterSparkspellcardItem extends Item {
	public MasterSparkspellcardItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u88C5\u5907\u5728\u526F\u624B\uFF0C\u4E3B\u624B\u6301\u516B\u5366\u7089\u53F3\u952E\u5373\u53EF\u5C06\u8FF7\u4F60\u516B\u5366\u7089\u5207\u6362\u4E3AMasterSpark\u6A21\u5F0F\u5E76\u5BA3\u8A00MasterSpark\u3002"));
		list.add(new TextComponent("\uFF08\u8BF7\u5BF9\u7740\u5730\u9762\u53D1\u5C04\uFF0C\u82E5\u671D\u7740\u6CA1\u6709\u969C\u788D\u7269\u7684\u65B9\u5411\u53D1\u5C04\u6709\u5D29\u6E83\u7684\u98CE\u9669\uFF09"));
	}
}
