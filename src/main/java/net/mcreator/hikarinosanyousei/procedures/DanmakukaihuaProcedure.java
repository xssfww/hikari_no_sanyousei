package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

public class DanmakukaihuaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
			}
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 0, 1, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 1, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-1), 0, 1, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 0, 0, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 0, (-1), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, 0, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 0, (-1), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-1), 0, 0, 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 1, 0);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
