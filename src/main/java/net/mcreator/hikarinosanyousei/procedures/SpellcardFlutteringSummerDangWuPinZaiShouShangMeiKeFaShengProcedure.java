package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class SpellcardFlutteringSummerDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double run_time = 0;
		double run_y = 0;
		double run_x = 0;
		double run_z = 0;
		double run_xlx = 0;
		double run_xlz = 0;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("flutteringsummer_use", entity) == 1) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).spellcard == true) {
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("flutteringsummer_run_time", entity) >= 10) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.PLAYERS, 1, 6);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.PLAYERS, 1, 6, false);
						}
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("flutteringsummer_run_time");
						if (_so == null)
							_so = _sc.addObjective("flutteringsummer_run_time", ObjectiveCriteria.DUMMY, new TextComponent("flutteringsummer_run_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					run_time = 1;
					run_x = entity.getLookAngle().x + entity.getX();
					run_y = entity.getY();
					run_z = entity.getLookAngle().z + entity.getZ();
					if (entity.getLookAngle().y <= 0.8) {
						if (entity.getLookAngle().y >= -0.8) {
							run_xlx = entity.getLookAngle().x * 2;
							run_xlz = entity.getLookAngle().z * 2;
						}
					}
					for (int index0 = 0; index0 < (int) (96); index0++) {
						run_time = run_time + 1;
						world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), (run_xlz + run_x + entity.getLookAngle().x * run_time), (run_y + entity.getLookAngle().y * run_time + 1),
								(run_xlx + run_z + entity.getLookAngle().z * run_time), 0, 0, 0);
						world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), (0 - run_xlz + run_x + entity.getLookAngle().x * run_time), (run_y + entity.getLookAngle().y * run_time + 1),
								(0 - run_xlx + run_z + entity.getLookAngle().z * run_time), 0, 0, 0);
						for (int index1 = 0; index1 < (int) (36); index1++) {
							world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), (run_xlz + run_x + entity.getLookAngle().x * run_time + Mth.nextDouble(new Random(), -0.5, 0.5)),
									(run_y + entity.getLookAngle().y * run_time + 1 + Mth.nextDouble(new Random(), -0.5, 0.5)), (run_xlx + run_z + entity.getLookAngle().z * run_time + Mth.nextDouble(new Random(), -0.5, 0.5)), 0, 0, 0);
						}
						for (int index2 = 0; index2 < (int) (36); index2++) {
							world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), (0 - run_xlz + run_x + entity.getLookAngle().x * run_time + Mth.nextDouble(new Random(), -0.5, 0.5)),
									(run_y + entity.getLookAngle().y * run_time + 1 + Mth.nextDouble(new Random(), -0.5, 0.5)), (0 - run_xlx + run_z + entity.getLookAngle().z * run_time + Mth.nextDouble(new Random(), -0.5, 0.5)), 0, 0, 0);
						}
						{
							final Vec3 _center = new Vec3((run_xlz + run_x + entity.getLookAngle().x * run_time), (run_y + entity.getLookAngle().y * run_time + 1), (run_xlx + run_z + entity.getLookAngle().z * run_time));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								entityiterator.hurt(DamageSource.GENERIC, 2);
							}
						}
						{
							final Vec3 _center = new Vec3((0 - run_xlz + run_x + entity.getLookAngle().x * run_time), (run_y + entity.getLookAngle().y * run_time + 1), (0 - run_xlx + run_z + entity.getLookAngle().z * run_time));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								entityiterator.hurt(DamageSource.GENERIC, 2);
							}
						}
					}
				} else {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("flutteringsummer_run_time");
						if (_so == null)
							_so = _sc.addObjective("flutteringsummer_run_time", ObjectiveCriteria.DUMMY, new TextComponent("flutteringsummer_run_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("flutteringsummer_run_time", entity) + 1));
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("flutteringsummer_danmaku_run_time", entity) >= 9) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("flutteringsummer_danmaku_run_time");
						if (_so == null)
							_so = _sc.addObjective("flutteringsummer_danmaku_run_time", ObjectiveCriteria.DUMMY, new TextComponent("flutteringsummer_danmaku_run_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
				} else {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("flutteringsummer_danmaku_run_time");
						if (_so == null)
							_so = _sc.addObjective("flutteringsummer_danmaku_run_time", ObjectiveCriteria.DUMMY, new TextComponent("flutteringsummer_danmaku_run_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("flutteringsummer_danmaku_run_time", entity) + 1));
					}
				}
			}
		}
	}
}
