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
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class PowerpotionDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 4, (false), (false)));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.POWERPOTION.get(), 100);
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
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
													if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
																			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
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
																						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																							if (world instanceof Level _level) {
																								if (!_level.isClientSide()) {
																									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")),
																											SoundSource.PLAYERS, 1, 1);
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
																									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																										if (world instanceof Level _level) {
																											if (!_level.isClientSide()) {
																												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")),
																														SoundSource.PLAYERS, 1, 1);
																											} else {
																												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS,
																														1, 1, false);
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
																												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																														.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																													if (world instanceof Level _level) {
																														if (!_level.isClientSide()) {
																															_level.playSound(null, new BlockPos(x, y, z),
																																	ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
																														} else {
																															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")),
																																	SoundSource.PLAYERS, 1, 1, false);
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
																															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																																	.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																																if (world instanceof Level _level) {
																																	if (!_level.isClientSide()) {
																																		_level.playSound(null, new BlockPos(x, y, z),
																																				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS,
																																				1, 1);
																																	} else {
																																		_level.playLocalSound(x, y, z,
																																				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS,
																																				1, 1, false);
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
																																		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																																				.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																																			if (world instanceof Level _level) {
																																				if (!_level.isClientSide()) {
																																					_level.playSound(null, new BlockPos(x, y, z),
																																							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")),
																																							SoundSource.PLAYERS, 1, 1);
																																				} else {
																																					_level.playLocalSound(x, y, z,
																																							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.drink")),
																																							SoundSource.PLAYERS, 1, 1, false);
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
																																					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																																							.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
																																						if (world instanceof Level _level) {
																																							if (!_level.isClientSide()) {
																																								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(
																																										new ResourceLocation("entity.generic.drink")), SoundSource.PLAYERS, 1, 1);
																																							} else {
																																								_level.playLocalSound(x, y, z,
																																										ForgeRegistries.SOUND_EVENTS
																																												.getValue(new ResourceLocation("entity.generic.drink")),
																																										SoundSource.PLAYERS, 1, 1, false);
																																							}
																																						}
																																						if (entity instanceof Player _player) {
																																							ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POWERPOTION.get());
																																							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(),
																																									1, _player.inventoryMenu.getCraftSlots());
																																						}
																																						if (entity instanceof Player _player) {
																																							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MANAPOTIONEMPTY.get());
																																							_setstack.setCount(1);
																																							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
																																						}
																																						if (entity instanceof LivingEntity _entity)
																																							_entity.addEffect(
																																									new MobEffectInstance(HikariNoSanyouseiModMobEffects.DANMAKU_POWER.get(), 600, 1));
																																					}
																																					MinecraftForge.EVENT_BUS.unregister(this);
																																				}
																																			}.start(world, 5);
																																		}
																																		MinecraftForge.EVENT_BUS.unregister(this);
																																	}
																																}.start(world, 5);
																															}
																															MinecraftForge.EVENT_BUS.unregister(this);
																														}
																													}.start(world, 5);
																												}
																												MinecraftForge.EVENT_BUS.unregister(this);
																											}
																										}.start(world, 5);
																									}
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, 5);
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, 5);
																			}
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, 5);
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 5);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 5);
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 5);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 5);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
	}
}
