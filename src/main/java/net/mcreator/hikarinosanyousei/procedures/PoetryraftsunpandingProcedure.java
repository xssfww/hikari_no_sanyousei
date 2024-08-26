package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PoetryraftsunpandingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 160, 5, (false), (false)));
			(itemstack).shrink(1);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFTSUN.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u81EA\u59CB\u81F3\u7EC8\uFF0C\u5996\u7CBE\u90FD\u662F\u5E7B\u60F3\u4E61\u5E95\u5C42\u5B58\u5728\u3002"), (false));
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
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u6211\u4E5F\u77E5\u9053\uFF0C\u8FD9\u662F\u6CA1\u529E\u6CD5\u7684\u4E8B\u60C5\u3002"), (false));
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
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u4F46\uFF0C\u5018\u82E5\u6211\u80FD\u591F\u7EDF\u9886\u8D77\u6765\u6240\u6709\u5996\u7CBE\uFF0C\u4E00\u8D77\u9F50\u5FC3\u534F\u529B"), (false));
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
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u4E00\u5B9A\u53EF\u4EE5\uFF0C\u8BA9\u5996\u7CBE\u83B7\u5F97\u5927\u5BB6\u7684\u5C0A\u91CD\u7684\uFF01"), (false));
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
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u6211\u7684\u613F\u671B\u662F\uFF0C\u4F7F\u5996\u7CBE\uFF0C\u53D8\u5F97\u6700\u4F1F\u5927\uFF01"), (false));
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 40);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 40);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 40);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 40);
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
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1, (false), (false)));
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1, (false), (false)));
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1, (false), (false)));
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 4) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1, (false), (false)));
							}
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 160);
		} else {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u8BD7\u7B4F...\u6851\u5C3C\u505A\u7684\u5427\uFF1F"), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8BA9\u5996\u7CBE\u53D8\u5F97\u6700\u4F1F\u5927...\u5657\uFF0C\u6851\u5C3C\u600E\u4E48\u8FD8\u5E0C\u671B\u7740\u8FD9\u4E2A\u554A\u3002"), (false));
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u8BD7\u7B4F...\u6851\u5C3C\u505A\u7684\u5427\uFF1F\u6211\u770B\u770B..."), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8BA9\u5996\u7CBE\u53D8\u5F97\u6700\u4F1F\u5927...\u55EF\uFF0C\u6851\u5C3C\u613F\u671B\u8FD8\u633A\u8FDC\u5927\u7684\u5462\u3002"), (false));
				}
			}
		}
	}
}
