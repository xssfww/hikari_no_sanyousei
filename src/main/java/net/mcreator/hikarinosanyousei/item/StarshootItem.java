
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class StarshootItem extends Item {
	public StarshootItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).stacksTo(64).rarity(Rarity.COMMON));
	}
}
