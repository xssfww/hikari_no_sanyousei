
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class MushroombigItem extends Item {
	public MushroombigItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(3f).alwaysEat()

				.build()));
	}
}
