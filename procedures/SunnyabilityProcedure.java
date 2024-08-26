package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class SunnyabilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode == false) {
			if (entity.isShiftKeyDown() == false) {
				if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
					if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode) {
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if (Mth.nextInt(new Random(), 1, 4) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("OK\uFF01\u53EA\u8981\u6709\u6211\u5728\uFF0C\u6CA1\u4EBA\u80FD\u770B\u89C1\u6211\u4EEC\uFF01"), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u6D88\u9664\u8EAB\u5F71\u5F00\u542F\uFF0C\u6211\u4EEC\u5FEB\u8D70\u5427\u3002"), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u6D88\u9664\u8EAB\u5F71\u5DF2\u7ECF\u5F00\u59CB\u4E86\uFF0C\u5FEB\u8D70\u5427\uFF0C\u4E0D\u7136\u4F1A\u88AB\u53D1\u73B0\u7684\u3002"), (false));
									}
								}
							} else {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u6D88\u9664\u8EAB\u5F71\u5F00\u542F\u4E86\uFF0C\u8DDF\u5728\u6211\u8EAB\u8FB9\uFF0C\u4E0D\u7136\u4F1A\u88AB\u53D1\u73B0\u7684\u3002"), (false));
									}
								}
							}
						}
						{
							boolean _setval = true;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.niyousei_nengli = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglimode = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									new TextComponent("\u5728\u4E0E\u9732\u5A1C\u7684\u914D\u5408\u4E4B\u4E0B\uFF0C\u4F60\u4EEC\u4E24\u4E2A\u521B\u9020\u51FA\u4E86\u4E00\u5757\u80FD\u6D88\u9664\u8EAB\u5F71\u7684\u533A\u57DF\u3002"), (false));
					} else {
						{
							boolean _setval = true;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglimode = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u56E0\u4E3A\u9732\u5A1C\u6CA1\u6709\u5F00\u542F\u6D88\u97F3\uFF0C\u6240\u4EE5\u53EA\u6709\u4F60\u8FDB\u5165\u4E86\u6D88\u9664\u8EAB\u5F71\u7684\u72B6\u6001\u3002"),
									(false));
					}
				} else {
					{
						boolean _setval = true;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.nenglimode = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u56E0\u4E3A\u9732\u5A1C\u4E0D\u5728\u9644\u8FD1\uFF0C\u6240\u4EE5\u53EA\u6709\u4F60\u8FDB\u5165\u4E86\u6D88\u9664\u8EAB\u5F71\u7684\u72B6\u6001\u3002"), (false));
				}
			} else {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower >= 400) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 3, (false), (false)));
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), x, y, z, 109, 2, 2, 2, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKRED.get()), x, y, z, 109, 2, 2, 2, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKBLUE.get()), x, y, z, 109, 2, 2, 2, 0);
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0, (false), (false)));
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u901A\u8FC7\u6298\u5C04\u5149\u7EBF\u4F7F\u81EA\u5DF1\u53D1\u51FA\u5149\u8000\u6765\u3002"), (false));
							{
								double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower - 400;
								entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.nenglipower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				}
			}
		} else {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
				if (Mth.nextInt(new Random(), 1, 4) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u6D88\u9664\u8EAB\u5F71\uFF0C\u89E3\u9664\u3002"), (false));
						}
					}
				} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u5514\u59C6\uFF0C\u770B\u8D77\u6765\u8FD9\u6B21\u884C\u52A8\u76F8\u5F53\u8FC5\u901F\u5462\u3002"), (false));
						}
					}
				} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u5230\u5B89\u5168\u5730\u70B9\u4E86\uFF0C\u6D88\u9664\u8EAB\u5F71\uFF0C\u89E3\u9664\u3002"), (false));
						}
					}
				} else {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u8DD1\u51FA\u6765\u4E86\uFF0C\u6D88\u9664\u8EAB\u5F71\u89E3\u9664\u3002"), (false));
						}
					}
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nenglimode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5173\u95ED\u4E86\u6D88\u9664\u8EAB\u5F71\u3002"), (false));
		}
	}
}
