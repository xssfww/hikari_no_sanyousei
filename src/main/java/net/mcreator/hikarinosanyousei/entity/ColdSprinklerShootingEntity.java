
package net.mcreator.hikarinosanyousei.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.hikarinosanyousei.procedures.ColdSprinklerShootingTouZhiWuFeiXingTickProcedure;
import net.mcreator.hikarinosanyousei.procedures.ColdSprinklerShootingDangTouZhiWuJiZhongShiTiShiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ColdSprinklerShootingEntity extends AbstractArrow implements ItemSupplier {
	public ColdSprinklerShootingEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(HikariNoSanyouseiModEntities.COLD_SPRINKLER_SHOOTING.get(), world);
	}

	public ColdSprinklerShootingEntity(EntityType<? extends ColdSprinklerShootingEntity> type, Level world) {
		super(type, world);
	}

	public ColdSprinklerShootingEntity(EntityType<? extends ColdSprinklerShootingEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ColdSprinklerShootingEntity(EntityType<? extends ColdSprinklerShootingEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(HikariNoSanyouseiModItems.CIRNO_ICE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		ColdSprinklerShootingDangTouZhiWuJiZhongShiTiShiProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		ColdSprinklerShootingTouZhiWuFeiXingTickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this.getOwner(), this);
		if (this.inGround)
			this.discard();
	}

	public static ColdSprinklerShootingEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ColdSprinklerShootingEntity entityarrow = new ColdSprinklerShootingEntity(HikariNoSanyouseiModEntities.COLD_SPRINKLER_SHOOTING.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_2")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ColdSprinklerShootingEntity shoot(LivingEntity entity, LivingEntity target) {
		ColdSprinklerShootingEntity entityarrow = new ColdSprinklerShootingEntity(HikariNoSanyouseiModEntities.COLD_SPRINKLER_SHOOTING.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 7f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_2")), SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
