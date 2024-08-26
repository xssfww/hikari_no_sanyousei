
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class MushroomsoybeanItem extends Item {
	public MushroomsoybeanItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(1f).alwaysEat()

				.build()));
	}
}
