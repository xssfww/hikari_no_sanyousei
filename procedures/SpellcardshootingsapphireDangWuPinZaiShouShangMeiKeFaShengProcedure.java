package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.ShootsapphireEntity;

import java.util.Random;

public class SpellcardshootingsapphireDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("twinklesapphire_use", entity) == 1) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).spellcard == true) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new ShootsapphireEntity(HikariNoSanyouseiModEntities.SHOOTSAPPHIRE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 3, 0);
					_entityToSpawn.setPos((x + Mth.nextDouble(new Random(), -8, 8)), (y + Mth.nextDouble(new Random(), 4, 9)), (z + Mth.nextDouble(new Random(), -8, 8)));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y != 0 && entity.getLookAngle().y != 1 ? entity.getLookAngle().y - Mth.nextDouble(new Random(), 0, 0.4) : entity.getLookAngle().y), (entity.getLookAngle().z),
							1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new ShootsapphireEntity(HikariNoSanyouseiModEntities.SHOOTSAPPHIRE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 3, 0);
					_entityToSpawn.setPos((x + Mth.nextDouble(new Random(), -8, 8)), (y + Mth.nextDouble(new Random(), 4, 9)), (z + Mth.nextDouble(new Random(), -8, 8)));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y != 0 && entity.getLookAngle().y != 1 ? entity.getLookAngle().y - Mth.nextDouble(new Random(), 0, 0.4) : entity.getLookAngle().y), (entity.getLookAngle().z),
							1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new ShootsapphireEntity(HikariNoSanyouseiModEntities.SHOOTSAPPHIRE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 3, 0);
					_entityToSpawn.setPos((x + Mth.nextDouble(new Random(), -8, 8)), (y + Mth.nextDouble(new Random(), 4, 9)), (z + Mth.nextDouble(new Random(), -8, 8)));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y != 0 && entity.getLookAngle().y != 1 ? entity.getLookAngle().y - Mth.nextDouble(new Random(), 0, 0.4) : entity.getLookAngle().y), (entity.getLookAngle().z),
							1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, 6);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, 6, false);
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			}
		}
	}
}
