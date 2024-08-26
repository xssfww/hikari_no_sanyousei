
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ToumingItem extends Item {
	public ToumingItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
