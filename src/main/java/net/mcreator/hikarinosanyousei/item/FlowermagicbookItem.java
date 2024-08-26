
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FlowermagicbookItem extends Item {
	public FlowermagicbookItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u66FE\u7ECF\u662F\u7528\u6765\u4F7F\u6A31\u82B1\u5F00\u653E\u7684\u9B54\u6CD5\u4E66\uFF0C\u5982\u4ECA\u8BB0\u8F7D\u7740\u65E0\u540D\u5996\u7CBE\u4EEC\u7684\u751F\u6D3B\u3002"));
	}
}
