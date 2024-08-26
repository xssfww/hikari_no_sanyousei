package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class StarabilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode == false) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
				if (Mth.nextInt(new Random(), 1, 4) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u55EF\uFF0C\u8BA9\u6211\u770B\u770B\u9644\u8FD1\u6709\u6CA1\u6709\u4EC0\u4E48\u52A8\u9759\u3002"), (false));
						}
					}
				} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(
										new TextComponent("\u8BF6\uFF1F\u6211\u7684\u80FD\u529B\u4EC0\u4E48\u65F6\u5019\u88AB\u6539\u53D8\u4E86\uFF1F\u522B\u4EBA\u4E5F\u80FD\u770B\u5230\u63A2\u77E5\u5230\u7684\u6C14\u606F\u4E86...\u545C\u545C..."),
										(false));
						}
					}
				} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u5582\uFF0C\u4F60\u4EEC\u5148\u522B\u4E71\u52A8\uFF0C\u6211\u770B\u770B\u9644\u8FD1\u6709\u6CA1\u6709\u4EC0\u4E48\u52A8\u9759\u3002"), (false));
						}
					}
				} else {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u5582\u5582\uFF0C\u7B49\u4E00\u4E0B\u5566\uFF0C\u6211\u770B\u770B\u9644\u8FD1\u7684\u60C5\u51B5\u3002"), (false));
						}
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nenglimode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5F00\u542F\u4E86\u63A2\u77E5\u6C14\u606F\u3002"), (false));
		} else {
			if (entity.isShiftKeyDown() == false) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
					if (Mth.nextInt(new Random(), 1, 4) == 1) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u597D\uFF0C\u770B\u6765\u5C31\u8FD9\u6837\u4E86\u5462\u3002\u63A5\u7740\u770B\u4E0B\u53BB\u4F1A\u5F88\u7D2F\u7684\uFF0C\u5C31\u5148\u89E3\u9664\u4E86\u5462\u3002"),
											(false));
							}
						}
					} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent(
											"\u545C\u545C...\u73B0\u5728\u8FD8\u80FD\u8BA9\u522B\u4EBA\u770B\u5230...\u6211\u7684\u80FD\u529B\u80FD\u53D1\u6325\u7684\u4F5C\u7528\u5DF2\u7ECF\u6CA1\u591A\u5C11\u4E86...\u545C\u554A\u554A\u554A\u2014\u2014"),
											(false));
							}
						}
					} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u770B\u6765\u5468\u56F4\u5B89\u5168\u5462\uFF0C\u6211\u4EEC\u7EE7\u7EED\u8D70\u5427\u3002"), (false));
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u5468\u56F4\u6709\u70B9\u60C5\u51B5\uFF0C\u614E\u91CD\u70B9\u54E6\uFF1F"), (false));
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
					_player.displayClientMessage(new TextComponent("\u5173\u95ED\u4E86\u63A2\u77E5\u6C14\u606F\u3002"), (false));
			} else {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower >= 800) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 2, (false), (false)));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defend_out")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defend_out")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
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
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.GLOWING) : false) {
										if (entityiterator instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2, (false), (false)));
									}
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u4F7F\u7528\u63A2\u77E5\u6C14\u606F\u7684\u80FD\u529B\u4EE4\u76EE\u6807\u611F\u5230\u4E86\u6050\u60E7\u3002"), (false));
							{
								double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower - 800;
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
		}
	}
}
