
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class PropertychangesreagentsItem extends Item {
	public PropertychangesreagentsItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_POTION).stacksTo(64).rarity(Rarity.COMMON));
	}
}
