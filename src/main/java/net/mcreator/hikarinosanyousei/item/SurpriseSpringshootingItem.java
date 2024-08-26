
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.hikarinosanyousei.procedures.SurpriseSpringshootingDangYuanChengWuPinShiYongShiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;
import net.mcreator.hikarinosanyousei.entity.SurpriseSpringshootingEntity;

public class SurpriseSpringshootingItem extends Item {
	public SurpriseSpringshootingItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEITEST).durability(100));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				SurpriseSpringshootingEntity entityarrow = SurpriseSpringshootingEntity.shoot(world, entity, world.getRandom(), 4f, 1, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;

				SurpriseSpringshootingDangYuanChengWuPinShiYongShiProcedure.execute(entity);
			}
		}
	}
}
