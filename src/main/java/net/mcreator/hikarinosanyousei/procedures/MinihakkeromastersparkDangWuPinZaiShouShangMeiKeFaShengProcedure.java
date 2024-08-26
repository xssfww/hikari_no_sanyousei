package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class MinihakkeromastersparkDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double run_time = 0;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).spellcard == true) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("masterspark_use", entity) == 1) {
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("time", entity) >= 3) {
					run_time = 1;
					for (int index0 = 0; index0 < (int) (7); index0++) {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 2, 0);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(new Random(), -0.3, 0.3)), (entity.getLookAngle().y + Mth.nextDouble(new Random(), -0.3, 0.3)),
									(entity.getLookAngle().z + Mth.nextDouble(new Random(), -0.3, 0.3)), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					for (int index1 = 0; index1 < (int) (96); index1++) {
						run_time = run_time + 1;
						world.addParticle(ParticleTypes.ELECTRIC_SPARK, (entity.getX() + entity.getLookAngle().x * run_time), (entity.getY() + entity.getLookAngle().y * run_time + 1), (entity.getZ() + entity.getLookAngle().z * run_time), 0, 0, 0);
						for (int index2 = 0; index2 < (int) (36); index2++) {
							world.addParticle(ParticleTypes.ELECTRIC_SPARK, (entity.getX() + entity.getLookAngle().x * run_time + Mth.nextDouble(new Random(), -0.7, 0.7)),
									(entity.getY() + entity.getLookAngle().y * run_time + 1 + Mth.nextDouble(new Random(), -0.7, 0.7)), (entity.getZ() + entity.getLookAngle().z * run_time + Mth.nextDouble(new Random(), -0.7, 0.7)), 0, 0, 0);
						}
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * run_time + Mth.nextDouble(new Random(), -0.7, 0.7)),
									(entity.getY() + entity.getLookAngle().y * run_time + 1 + Mth.nextDouble(new Random(), -0.7, 0.7)), (entity.getZ() + entity.getLookAngle().z * run_time + Mth.nextDouble(new Random(), -0.7, 0.7)));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								entityiterator.hurt(DamageSource.GENERIC, 4);
							}
						}
					}
				} else {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("time");
						if (_so == null)
							_so = _sc.addObjective("time", ObjectiveCriteria.DUMMY, new TextComponent("time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("time", entity) + 1));
					}
				}
			}
		}
		entity.setDeltaMovement(new Vec3(0, 0, 0));
	}
}
