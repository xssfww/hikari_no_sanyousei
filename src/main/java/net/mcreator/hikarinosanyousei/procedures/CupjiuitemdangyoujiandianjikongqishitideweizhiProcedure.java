package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;

public class CupjiuitemdangyoujiandianjikongqishitideweizhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 5));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 35);
		if (entity.isShiftKeyDown()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk
						+ (3 - ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue()) * 1333;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.drunk = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.CUPJIUITEM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.CUPEMPTYITEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 24000) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 4) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5495...\u559D...\u4E0D\u4E0B\u4E86..."), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u8FD8\u662F...\u7B2C\u4E00\u6B21...\u559D\u6210\u8FD9\u6837..."), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u4E0D\u884C\u4E86...\u518D\u559D\u5C31...\u8981\u6B7B\u4E86\u554A..."), (false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 5, (false), (false)));
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 16000) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 3) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u54C8...\u4E0D\u80FD\u559D\u4E86\u5566..."), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5495...\u5E94\u8BE5\u559D\u591F\u4E86\u5427..."), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u559D\u4E0D\u4E0B\u53BB\u4E86..."), (false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 4, (false), (false)));
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 10000) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 2) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u54C8\u554A\uFF0C\u771F\u597D\u559D\u2014\u2014"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5514\u55EF...\u4E0D\u60F3\u63A5\u7740\u559D\u4E86..."), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u547C...\u5E94\u8BE5\u5DEE\u4E0D\u591A\u4E86...\u4EE5\u540E\u8FD8\u6709\u65F6\u95F4\u6162\u6162\u54C1\u5C1D..."), (false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 3, (false), (false)));
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 6000) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 1) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5594\uFF0C\u8FD9\u9152\u8FD8\u633A\u597D\u559D\u7684\u561B\u3002"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u55EF...\u90FD\u5728\u559D\u5417\uFF1F\u7B97\u4E86\uFF0C\u63A5\u7740\u559D\u5427\u3002"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u547C...\u80FD\u4EAB\u53D7\u5230\u9152\u7684\u7F8E\u5473\u5C31\u662F\u597D\u554A\u3002"), (false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 2, (false), (false)));
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) == false) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u554A\u554A\uFF0C\u597D\u4E45\u6CA1\u559D\u4E86\uFF0C\u8FD9\u6B21\u5F97\u559D\u4E2A\u75DB\u5FEB\uFF01"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u8BF6...\u90A3\u5C31\u4E00\u8D77\u559D\u5427\u3002"), (false));
					} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5514\uFF0C\u679C\u7136\u597D\u4E45\u6CA1\u559D\u4E86\uFF0C\u521D\u5165\u53E3\u611F\u89C9\u6709\u70B9\u82E6\u554A\u3002"), (false));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 1, (false), (false)));
				}
			}
		} else {
			if ((itemstack).getDamageValue() < 2) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.CUPJIUITEM.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
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
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.CUPEMPTYITEM.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1, false);
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1, false);
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
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
									{
										double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk
												+ (3 - ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue()) * 1333;
										entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.drunk = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									if (entity instanceof Player _player)
										_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 1));
									if (entity instanceof Player _player)
										_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
									if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 24000) {
										if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 4) {
											if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u5495...\u559D...\u4E0D\u4E0B\u4E86..."), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u8FD8\u662F...\u7B2C\u4E00\u6B21...\u559D\u6210\u8FD9\u6837..."), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u4E0D\u884C\u4E86...\u518D\u559D\u5C31...\u8981\u6B7B\u4E86\u554A..."), (false));
											}
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 5, (false), (false)));
										}
									} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 16000) {
										if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 3) {
											if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u54C8...\u4E0D\u80FD\u559D\u4E86\u5566..."), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u5495...\u5E94\u8BE5\u559D\u591F\u4E86\u5427..."), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u54C8\u554A...\u559D\u4E0D\u4E0B\u53BB\u4E86..."), (false));
											}
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 4, (false), (false)));
										}
									} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 10000) {
										if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 2) {
											if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u54C8\u554A\uFF0C\u771F\u597D\u559D\u2014\u2014"), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u5514\u55EF...\u4E0D\u60F3\u63A5\u7740\u559D\u4E86..."), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u547C...\u5E94\u8BE5\u5DEE\u4E0D\u591A\u4E86...\u4EE5\u540E\u8FD8\u6709\u65F6\u95F4\u6162\u6162\u54C1\u5C1D..."), (false));
											}
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 3, (false), (false)));
										}
									} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 6000) {
										if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 1) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(new TextComponent("\u5594\uFF0C\u8FD9\u9152\u8FD8\u633A\u597D\u559D\u7684\u561B\u3002"), (false));
										} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(new TextComponent("\u55EF...\u90FD\u5728\u559D\u5417\uFF1F\u7B97\u4E86\uFF0C\u63A5\u7740\u559D\u5427\u3002"), (false));
										} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(new TextComponent("\u547C...\u80FD\u4EAB\u53D7\u5230\u9152\u7684\u7F8E\u5473\u5C31\u662F\u597D\u554A\u3002"), (false));
										}
										if (entity instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 2, (false), (false)));
									} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).drunk > 0) {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) : false) == false) {
											if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u554A\u554A\uFF0C\u597D\u4E45\u6CA1\u559D\u4E86\uFF0C\u8FD9\u6B21\u5F97\u559D\u4E2A\u75DB\u5FEB\uFF01"), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u8BF6...\u90A3\u5C31\u4E00\u8D77\u559D\u5427\u3002"), (false));
											} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("\u5514\uFF0C\u679C\u7136\u597D\u4E45\u6CA1\u559D\u4E86\uFF0C\u521D\u5165\u53E3\u611F\u89C9\u6709\u70B9\u82E6\u554A\u3002"), (false));
											}
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DRUNK.get(), 60, 1, (false), (false)));
										}
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 10);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 10);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		}
	}
}
