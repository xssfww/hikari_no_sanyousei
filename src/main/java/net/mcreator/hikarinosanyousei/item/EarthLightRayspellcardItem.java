
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

public class EarthLightRayspellcardItem extends Item {
	public EarthLightRayspellcardItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u629B\u51FA\u6570\u4E2A\u6539\u7248\u91CD\u751F\u6001\u70B8\u5F39\u4EE5\u751F\u6210\u5411\u4E0A\u53D1\u5C04\u7684\u5149\u675F"));
		list.add(new TextComponent("\u5E38\u7528\u4E8E\u5C01\u9501\u654C\u4EBA\u7684\u8D70\u5411"));
	}
}
