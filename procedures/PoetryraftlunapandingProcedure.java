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

public class PoetryraftlunapandingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
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
					_player.displayClientMessage(new TextComponent("\u867D\u7136\u8BF4\u5996\u7CBE\u5E76\u4E0D\u9700\u8981\u98DF\u7269\u5C31\u80FD\u5B58\u6D3B"), (false));
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
							_player.displayClientMessage(new TextComponent("\u53EF\u7F8E\u98DF\u7684\u65E8\u5473\u4E5F\u591A\u4E48\u6C81\u4EBA\u5FC3\u813E\u5462\uFF0C\u597D\u5FEB\u4E50"), (false));
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
									_player.displayClientMessage(new TextComponent("\u4E0D\u8FC7\u6709\u4E9B\u6CA1\u505A\u597D\u7684\u4E1C\u897F\u53EF\u771F\u662F\u53EB\u4EBA\u556E\u6A97\u541E\u9488\u5462..."), (false));
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
											_player.displayClientMessage(new TextComponent("\u8981\u662F\u7F8E\u98DF\u80FD\u591A\u7ED9\u5927\u5BB6\u5E26\u6765\u5FEB\u4E50\u5C31\u597D\u4E86\uFF01"), (false));
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
													_player.displayClientMessage(new TextComponent("\u90A3\u5C31\u5E0C\u671B\uFF0C\u6240\u6709\u7684\u98DF\u7269\uFF0C\u90FD\u53D8\u5F97\u597D\u5403\uFF01"), (false));
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
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 300, 1, (false), (false)));
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 300, 1, (false), (false)));
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 300, 1, (false), (false)));
							}
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 160);
		} else {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u8BD7\u7B4F...\u9732\u5A1C\u5199\u7684\u5427\uFF1F"), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(
								new TextComponent("\u5E0C\u671B\u6240\u6709\u4E1C\u897F\u90FD\u53D8\u5F97\u597D\u5403...\u5582\u5582\uFF0C\u90A3\u4E2A\u6B3E\u51AC\u5473\u564C\u6211\u53EF\u4E0D\u60F3\u5C1D\u7B2C\u4E8C\u904D\u4E86\u554A\u3002"),
								(false));
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u8BD7\u7B4F...\u9732\u5A1C\u5199\u7684\u5427\uFF1F\u6211\u770B\u770B..."), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(
								new TextComponent("\u5E0C\u671B\u6240\u6709\u4E1C\u897F\u90FD\u53D8\u5F97\u597D\u5403...\u613F\u671B\u5F88\u4E0D\u9519\u5462\uFF0C\u53EF\u60DC\u6211\u4E0D\u662F\u5F88\u80FD\u5403\u82E6\u5473\u7684\u4E1C\u897F\u3002"),
								(false));
				}
			}
		}
	}
}
