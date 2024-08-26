package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SanyuejingpandingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		return execute(null, world, x, y, z, entity);
	}

	private static String execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
			SunnypandingProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
			LunapandingProcedure.execute(world, x, y, z, entity);
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
			StarpandingProcedure.execute(world, entity);
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 4) {
			CirnopandingProcedure.execute(entity);
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 7) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.BLOOMINGCHERRYBLOSSOMBRANCHES.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 0, (false), (false)));
			}
		}
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei >= 1) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode == true) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower < 2) {
					{
						boolean _setval = false;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.nenglimode = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.niyousei_nengli = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if (Mth.nextInt(new Random(), 1, 5) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u5514\u59C6\uFF0C\u6211\u575A\u6301\u4E0D\u4F4F\u4E86\uFF0C\u5927\u5BB6\u5C0F\u5FC3\u554A\u3002"), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u8BF6\u8BF6\uFF0C\u9B54\u529B\u4E0D\u591F\u4E86\u3002\u5927\u5BB6\uFF0C\u6D88\u9664\u8EAB\u5F71\u8981\u7ED3\u675F\u4E86\u554A\u3002"), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u5230\u6781\u9650\u4E86\uFF0C\u6D88\u9664\u8EAB\u5F71\u8981\u89E3\u9664\u4E86\u3002"), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u6211\u4E0D\u884C\u4E86\uFF0C\u5927\u5BB6\u5C0F\u5FC3\uFF0C\u6D88\u9664\u8EAB\u5F71\u8981\u7ED3\u675F\u4E86\u3002"), (false));
									}
								}
							} else {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u545C\u54C7\uFF0C\u7D2F\u6B7B\u4E86\uFF0C\u6D88\u9664\u8EAB\u5F71\u8981\u89E3\u9664\u4E86\u3002"), (false));
									}
								}
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u7ED3\u675F\u4E86\u6D88\u9664\u8EAB\u5F71\u3002"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if (Mth.nextInt(new Random(), 1, 5) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u6211\u575A\u6301\u4E0D\u4F4F\u4E86\uFF0C\u5927\u5BB6\u5C0F\u5FC3\u554A..."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u547C...\u547C...\u9B54\u529B\u4E0D\u591F\u4E86\uFF0C\u6D88\u9664\u58F0\u97F3\u8981\u7ED3\u675F\u4E86..."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u5230...\u5230\u6781\u9650\u4E86...\u6D88\u97F3\u8981\u7ED3\u675F\u4E86..."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u6211\u4E0D\u884C\u4E86\uFF0C\u5C0F\u5FC3\uFF0C\u6D88\u9664\u58F0\u97F3\u8981\u7ED3\u675F\u4E86\u3002"), (false));
									}
								}
							} else {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u547C...\u547C...\u597D\u7D2F...\u6D88\u9664\u58F0\u97F3\u8981\u7ED3\u675F\u4E86\uFF0C\u5404\u4F4D\u3002"), (false));
									}
								}
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u7ED3\u675F\u4E86\u6D88\u9664\u58F0\u97F3\u3002"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if (Mth.nextInt(new Random(), 1, 5) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u5934\u597D\u75BC...\u63A2\u77E5\u6C14\u606F\u8981\u7ED3\u675F\u4E86..."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u597D\u7D2F....\u54C8\u554A...\u4E0D\u884C\u4E86\uFF0C\u63A2\u77E5\u6C14\u606F\u8981\u7ED3\u675F\u4E86...."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u54C8\u554A...\u6211\u4E0D\u884C\u4E86...\u63A2\u77E5\u6C14\u606F\u597D\u7D2F..."), (false));
									}
								}
							} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u54C8\u554A...\u6491\u4E0D\u4F4F\u4E86..."), (false));
									}
								}
							} else {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u547C...\u547C...\u597D\u7D2F...\u63A2\u77E5\u8981\u7ED3\u675F\u4E86..."), (false));
									}
								}
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u7ED3\u675F\u4E86\u63A2\u77E5\u6C14\u606F\u3002"), (false));
					}
				}
			}
		}
		FlynengliProcedure.execute(entity);
		ManacheckProcedure.execute(entity);
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 24000) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) {
				{
					double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk - 1;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.drunk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 5, (false), (false)));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 16000) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) {
				{
					double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk - 1;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.drunk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 4, (false), (false)));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 10000) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) {
				{
					double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk - 1;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.drunk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 3, (false), (false)));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 6000) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) {
				{
					double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk - 1;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.drunk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 2, (false), (false)));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 0) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) {
				{
					double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk - 1;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.drunk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 1, (false), (false)));
			}
		}
		TimexianshiProcedure.execute(entity);
		return "\u5269\u4F59\u9B54\u529B" + Math.round(100 * ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower / 1800)) + "%";
	}
}
