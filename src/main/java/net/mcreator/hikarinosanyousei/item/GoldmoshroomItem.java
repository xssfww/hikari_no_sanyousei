
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.hikarinosanyousei.procedures.GoldmoshroomWanJiaWanChengShiYongWuPinShiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class GoldmoshroomItem extends Item {
	public GoldmoshroomItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_POTION).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(5f)

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GoldmoshroomWanJiaWanChengShiYongWuPinShiProcedure.execute(entity);
		return retval;
	}
}
