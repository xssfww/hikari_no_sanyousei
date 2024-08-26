
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class SpellcardFlashandStripeItem extends Item {
	public SpellcardFlashandStripeItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).durability(3).rarity(Rarity.EPIC));
	}
}
