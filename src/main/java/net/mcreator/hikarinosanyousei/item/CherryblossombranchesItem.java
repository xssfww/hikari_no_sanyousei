
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class CherryblossombranchesItem extends Item {
	public CherryblossombranchesItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(1).rarity(Rarity.COMMON));
	}
}
