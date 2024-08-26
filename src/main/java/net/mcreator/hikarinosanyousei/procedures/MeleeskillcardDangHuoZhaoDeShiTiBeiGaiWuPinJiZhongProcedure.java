package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
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
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;

import java.util.Random;

public class MeleeskillcardDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).meleecishu <= 0) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DEFENDBUF.get()) : false) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 5, (false), (false)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defnd")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defnd")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 100);
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee1")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee1")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("melee").bypassArmor(), 3);
				{
					double _setval = entity.getX();
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lnx = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getY();
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lny = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getZ();
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lnz = _setval;
						capability.syncPlayerVariables(entity);
					});
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
							Entity _ent = entity;
							_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(), _ent.getXRot());
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
									Entity _ent = entity;
									_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
											((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
											((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
												((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
												((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(), _ent.getXRot());
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
											Entity _ent = entity;
											_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
													((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
													((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
														((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
														((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(), _ent.getXRot());
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
													Entity _ent = entity;
													_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
															((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
															((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(),
																_ent.getXRot());
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
															Entity _ent = entity;
															_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																	((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																	((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport(
																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(),
																		_ent.getXRot());
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
																	Entity _ent = entity;
																	_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																			((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																			((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport(
																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz), _ent.getYRot(),
																				_ent.getXRot());
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
																			Entity _ent = entity;
																			_ent.teleportTo(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport(
																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																						_ent.getYRot(), _ent.getXRot());
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
																					Entity _ent = entity;
																					_ent.teleportTo(
																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport(
																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																								_ent.getYRot(), _ent.getXRot());
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
																							Entity _ent = entity;
																							_ent.teleportTo(
																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport(
																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																										_ent.getYRot(), _ent.getXRot());
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
																									Entity _ent = entity;
																									_ent.teleportTo(
																											((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																											((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																											((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport(
																												((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																												((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																												((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																												_ent.getYRot(), _ent.getXRot());
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
																											Entity _ent = entity;
																											_ent.teleportTo(
																													((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																													((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																													((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport(
																														((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																														((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																														((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																														_ent.getYRot(), _ent.getXRot());
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
																													Entity _ent = entity;
																													_ent.teleportTo(
																															((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																															((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																															((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport(
																																((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																_ent.getYRot(), _ent.getXRot());
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
																															Entity _ent = entity;
																															_ent.teleportTo(
																																	((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																	((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																	((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport(
																																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																		((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																		_ent.getYRot(), _ent.getXRot());
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
																																	Entity _ent = entity;
																																	_ent.teleportTo(
																																			((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																			((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																			((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport(
																																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																				((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																				_ent.getYRot(), _ent.getXRot());
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
																																			Entity _ent = entity;
																																			_ent.teleportTo(
																																					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport(
																																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																						((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																						_ent.getYRot(), _ent.getXRot());
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
																																					Entity _ent = entity;
																																					_ent.teleportTo(
																																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																							((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport(
																																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																								((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																								_ent.getYRot(), _ent.getXRot());
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
																																							Entity _ent = entity;
																																							_ent.teleportTo(
																																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																											null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																											null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																									((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																											null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport(
																																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																												null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																												null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																												null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																										_ent.getYRot(), _ent.getXRot());
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
																																									Entity _ent = entity;
																																									_ent.teleportTo(
																																											((entity.getCapability(
																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																											((entity.getCapability(
																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																											((entity.getCapability(
																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport(((entity
																																												.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																														null)
																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																												((entity.getCapability(
																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																												((entity.getCapability(
																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																												_ent.getYRot(), _ent.getXRot());
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
																																											Entity _ent = entity;
																																											_ent.teleportTo(((entity.getCapability(
																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																													((entity.getCapability(
																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																													((entity.getCapability(
																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport(((entity.getCapability(
																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																														((entity.getCapability(
																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																null)
																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																														((entity.getCapability(
																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																null)
																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																														_ent.getYRot(), _ent.getXRot());
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
																																													Entity _ent = entity;
																																													_ent.teleportTo(((entity.getCapability(
																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																															((entity.getCapability(
																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																															((entity.getCapability(
																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport(((entity.getCapability(
																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																null)
																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																((entity.getCapability(
																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null)
																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																((entity.getCapability(
																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null)
																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																_ent.getYRot(), _ent.getXRot());
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
																																															Entity _ent = entity;
																																															_ent.teleportTo(((entity.getCapability(
																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																	((entity.getCapability(
																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																	((entity.getCapability(
																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection.teleport(((entity.getCapability(
																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null)
																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																		((entity.getCapability(
																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null)
																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																		((entity.getCapability(
																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null)
																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																		_ent.getYRot(), _ent.getXRot());
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
																																																	Entity _ent = entity;
																																																	_ent.teleportTo(((entity.getCapability(
																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																			((entity.getCapability(
																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																			((entity.getCapability(
																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(((entity
																																																				.getCapability(
																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null)
																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																				((entity.getCapability(
																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null)
																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																				((entity.getCapability(
																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null)
																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																				_ent.getYRot(), _ent.getXRot());
																																																}
																																																new Object() {
																																																	private int ticks = 0;
																																																	private float waitTicks;
																																																	private LevelAccessor world;

																																																	public void start(LevelAccessor world,
																																																			int waitTicks) {
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
																																																			Entity _ent = entity;
																																																			_ent.teleportTo(((entity.getCapability(
																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																					((entity.getCapability(
																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																							null)
																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																					((entity.getCapability(
																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																							null)
																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection.teleport(((entity
																																																						.getCapability(
																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																								null)
																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																						((entity.getCapability(
																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																								null)
																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																						((entity.getCapability(
																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																								null)
																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																						_ent.getYRot(), _ent.getXRot());
																																																		}
																																																		new Object() {
																																																			private int ticks = 0;
																																																			private float waitTicks;
																																																			private LevelAccessor world;

																																																			public void start(LevelAccessor world,
																																																					int waitTicks) {
																																																				this.waitTicks = waitTicks;
																																																				MinecraftForge.EVENT_BUS.register(this);
																																																				this.world = world;
																																																			}

																																																			@SubscribeEvent
																																																			public void tick(
																																																					TickEvent.ServerTickEvent event) {
																																																				if (event.phase == TickEvent.Phase.END) {
																																																					this.ticks += 1;
																																																					if (this.ticks >= this.waitTicks)
																																																						run();
																																																				}
																																																			}

																																																			private void run() {
																																																				{
																																																					Entity _ent = entity;
																																																					_ent.teleportTo(((entity
																																																							.getCapability(
																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																							((entity.getCapability(
																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																							((entity.getCapability(
																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								((entity.getCapability(
																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																										null)
																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																								((entity.getCapability(
																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																										null)
																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																								((entity.getCapability(
																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																										null)
																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																				}
																																																				new Object() {
																																																					private int ticks = 0;
																																																					private float waitTicks;
																																																					private LevelAccessor world;

																																																					public void start(LevelAccessor world,
																																																							int waitTicks) {
																																																						this.waitTicks = waitTicks;
																																																						MinecraftForge.EVENT_BUS
																																																								.register(this);
																																																						this.world = world;
																																																					}

																																																					@SubscribeEvent
																																																					public void tick(
																																																							TickEvent.ServerTickEvent event) {
																																																						if (event.phase == TickEvent.Phase.END) {
																																																							this.ticks += 1;
																																																							if (this.ticks >= this.waitTicks)
																																																								run();
																																																						}
																																																					}

																																																					private void run() {
																																																						{
																																																							Entity _ent = entity;
																																																							_ent.teleportTo(((entity
																																																									.getCapability(
																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																											null)
																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																									((entity.getCapability(
																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																											null)
																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																									((entity.getCapability(
																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																											null)
																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																								_serverPlayer.connection
																																																										.teleport(((entity
																																																												.getCapability(
																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																														null)
																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																												((entity.getCapability(
																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																														null)
																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																												((entity.getCapability(
																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																														null)
																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																												_ent.getYRot(),
																																																												_ent.getXRot());
																																																						}
																																																						new Object() {
																																																							private int ticks = 0;
																																																							private float waitTicks;
																																																							private LevelAccessor world;

																																																							public void start(
																																																									LevelAccessor world,
																																																									int waitTicks) {
																																																								this.waitTicks = waitTicks;
																																																								MinecraftForge.EVENT_BUS
																																																										.register(this);
																																																								this.world = world;
																																																							}

																																																							@SubscribeEvent
																																																							public void tick(
																																																									TickEvent.ServerTickEvent event) {
																																																								if (event.phase == TickEvent.Phase.END) {
																																																									this.ticks += 1;
																																																									if (this.ticks >= this.waitTicks)
																																																										run();
																																																								}
																																																							}

																																																							private void run() {
																																																								{
																																																									Entity _ent = entity;
																																																									_ent.teleportTo(
																																																											((entity.getCapability(
																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																													null)
																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																											((entity.getCapability(
																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																													null)
																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																											((entity.getCapability(
																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																													null)
																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																										_serverPlayer.connection
																																																												.teleport(
																																																														((entity.getCapability(
																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																null)
																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																														((entity.getCapability(
																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																null)
																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																														((entity.getCapability(
																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																null)
																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																														_ent.getYRot(),
																																																														_ent.getXRot());
																																																								}
																																																								new Object() {
																																																									private int ticks = 0;
																																																									private float waitTicks;
																																																									private LevelAccessor world;

																																																									public void start(
																																																											LevelAccessor world,
																																																											int waitTicks) {
																																																										this.waitTicks = waitTicks;
																																																										MinecraftForge.EVENT_BUS
																																																												.register(
																																																														this);
																																																										this.world = world;
																																																									}

																																																									@SubscribeEvent
																																																									public void tick(
																																																											TickEvent.ServerTickEvent event) {
																																																										if (event.phase == TickEvent.Phase.END) {
																																																											this.ticks += 1;
																																																											if (this.ticks >= this.waitTicks)
																																																												run();
																																																										}
																																																									}

																																																									private void run() {
																																																										{
																																																											Entity _ent = entity;
																																																											_ent.teleportTo(
																																																													((entity.getCapability(
																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																															null)
																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																													((entity.getCapability(
																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																															null)
																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																													((entity.getCapability(
																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																															null)
																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																												_serverPlayer.connection
																																																														.teleport(
																																																																((entity.getCapability(
																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																		null)
																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																((entity.getCapability(
																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																		null)
																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																((entity.getCapability(
																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																		null)
																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																_ent.getYRot(),
																																																																_ent.getXRot());
																																																										}
																																																										new Object() {
																																																											private int ticks = 0;
																																																											private float waitTicks;
																																																											private LevelAccessor world;

																																																											public void start(
																																																													LevelAccessor world,
																																																													int waitTicks) {
																																																												this.waitTicks = waitTicks;
																																																												MinecraftForge.EVENT_BUS
																																																														.register(
																																																																this);
																																																												this.world = world;
																																																											}

																																																											@SubscribeEvent
																																																											public void tick(
																																																													TickEvent.ServerTickEvent event) {
																																																												if (event.phase == TickEvent.Phase.END) {
																																																													this.ticks += 1;
																																																													if (this.ticks >= this.waitTicks)
																																																														run();
																																																												}
																																																											}

																																																											private void run() {
																																																												{
																																																													Entity _ent = entity;
																																																													_ent.teleportTo(
																																																															((entity.getCapability(
																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																	null)
																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																															((entity.getCapability(
																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																	null)
																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																															((entity.getCapability(
																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																	null)
																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																														_serverPlayer.connection
																																																																.teleport(
																																																																		((entity.getCapability(
																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																				null)
																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																		((entity.getCapability(
																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																				null)
																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																		((entity.getCapability(
																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																				null)
																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																		_ent.getYRot(),
																																																																		_ent.getXRot());
																																																												}
																																																												new Object() {
																																																													private int ticks = 0;
																																																													private float waitTicks;
																																																													private LevelAccessor world;

																																																													public void start(
																																																															LevelAccessor world,
																																																															int waitTicks) {
																																																														this.waitTicks = waitTicks;
																																																														MinecraftForge.EVENT_BUS
																																																																.register(
																																																																		this);
																																																														this.world = world;
																																																													}

																																																													@SubscribeEvent
																																																													public void tick(
																																																															TickEvent.ServerTickEvent event) {
																																																														if (event.phase == TickEvent.Phase.END) {
																																																															this.ticks += 1;
																																																															if (this.ticks >= this.waitTicks)
																																																																run();
																																																														}
																																																													}

																																																													private void run() {
																																																														{
																																																															Entity _ent = entity;
																																																															_ent.teleportTo(
																																																																	((entity.getCapability(
																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																			null)
																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																	((entity.getCapability(
																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																			null)
																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																	((entity.getCapability(
																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																			null)
																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																_serverPlayer.connection
																																																																		.teleport(
																																																																				((entity.getCapability(
																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																						null)
																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																				((entity.getCapability(
																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																						null)
																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																				((entity.getCapability(
																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																						null)
																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																				_ent.getYRot(),
																																																																				_ent.getXRot());
																																																														}
																																																														new Object() {
																																																															private int ticks = 0;
																																																															private float waitTicks;
																																																															private LevelAccessor world;

																																																															public void start(
																																																																	LevelAccessor world,
																																																																	int waitTicks) {
																																																																this.waitTicks = waitTicks;
																																																																MinecraftForge.EVENT_BUS
																																																																		.register(
																																																																				this);
																																																																this.world = world;
																																																															}

																																																															@SubscribeEvent
																																																															public void tick(
																																																																	TickEvent.ServerTickEvent event) {
																																																																if (event.phase == TickEvent.Phase.END) {
																																																																	this.ticks += 1;
																																																																	if (this.ticks >= this.waitTicks)
																																																																		run();
																																																																}
																																																															}

																																																															private void run() {
																																																																{
																																																																	Entity _ent = entity;
																																																																	_ent.teleportTo(
																																																																			((entity.getCapability(
																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																					null)
																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																			((entity.getCapability(
																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																					null)
																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																			((entity.getCapability(
																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																					null)
																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																		_serverPlayer.connection
																																																																				.teleport(
																																																																						((entity.getCapability(
																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																								null)
																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																						((entity.getCapability(
																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																								null)
																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																						((entity.getCapability(
																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																								null)
																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																						_ent.getYRot(),
																																																																						_ent.getXRot());
																																																																}
																																																																new Object() {
																																																																	private int ticks = 0;
																																																																	private float waitTicks;
																																																																	private LevelAccessor world;

																																																																	public void start(
																																																																			LevelAccessor world,
																																																																			int waitTicks) {
																																																																		this.waitTicks = waitTicks;
																																																																		MinecraftForge.EVENT_BUS
																																																																				.register(
																																																																						this);
																																																																		this.world = world;
																																																																	}

																																																																	@SubscribeEvent
																																																																	public void tick(
																																																																			TickEvent.ServerTickEvent event) {
																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																			this.ticks += 1;
																																																																			if (this.ticks >= this.waitTicks)
																																																																				run();
																																																																		}
																																																																	}

																																																																	private void run() {
																																																																		{
																																																																			Entity _ent = entity;
																																																																			_ent.teleportTo(
																																																																					((entity.getCapability(
																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																							null)
																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																					((entity.getCapability(
																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																							null)
																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																					((entity.getCapability(
																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																							null)
																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																				_serverPlayer.connection
																																																																						.teleport(
																																																																								((entity.getCapability(
																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																										null)
																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																								((entity.getCapability(
																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																										null)
																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																								((entity.getCapability(
																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																										null)
																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																								_ent.getYRot(),
																																																																								_ent.getXRot());
																																																																		}
																																																																		new Object() {
																																																																			private int ticks = 0;
																																																																			private float waitTicks;
																																																																			private LevelAccessor world;

																																																																			public void start(
																																																																					LevelAccessor world,
																																																																					int waitTicks) {
																																																																				this.waitTicks = waitTicks;
																																																																				MinecraftForge.EVENT_BUS
																																																																						.register(
																																																																								this);
																																																																				this.world = world;
																																																																			}

																																																																			@SubscribeEvent
																																																																			public void tick(
																																																																					TickEvent.ServerTickEvent event) {
																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																					this.ticks += 1;
																																																																					if (this.ticks >= this.waitTicks)
																																																																						run();
																																																																				}
																																																																			}

																																																																			private void run() {
																																																																				{
																																																																					Entity _ent = entity;
																																																																					_ent.teleportTo(
																																																																							((entity.getCapability(
																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																									null)
																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																							((entity.getCapability(
																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																									null)
																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																							((entity.getCapability(
																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																									null)
																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																						_serverPlayer.connection
																																																																								.teleport(
																																																																										((entity.getCapability(
																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																												null)
																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																										((entity.getCapability(
																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																												null)
																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																										((entity.getCapability(
																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																												null)
																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																										_ent.getYRot(),
																																																																										_ent.getXRot());
																																																																				}
																																																																				new Object() {
																																																																					private int ticks = 0;
																																																																					private float waitTicks;
																																																																					private LevelAccessor world;

																																																																					public void start(
																																																																							LevelAccessor world,
																																																																							int waitTicks) {
																																																																						this.waitTicks = waitTicks;
																																																																						MinecraftForge.EVENT_BUS
																																																																								.register(
																																																																										this);
																																																																						this.world = world;
																																																																					}

																																																																					@SubscribeEvent
																																																																					public void tick(
																																																																							TickEvent.ServerTickEvent event) {
																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																							this.ticks += 1;
																																																																							if (this.ticks >= this.waitTicks)
																																																																								run();
																																																																						}
																																																																					}

																																																																					private void run() {
																																																																						{
																																																																							Entity _ent = entity;
																																																																							_ent.teleportTo(
																																																																									((entity.getCapability(
																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																											null)
																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																									((entity.getCapability(
																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																											null)
																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																									((entity.getCapability(
																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																											null)
																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																								_serverPlayer.connection
																																																																										.teleport(
																																																																												((entity.getCapability(
																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																														null)
																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																												((entity.getCapability(
																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																														null)
																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																												((entity.getCapability(
																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																														null)
																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																												_ent.getYRot(),
																																																																												_ent.getXRot());
																																																																						}
																																																																						new Object() {
																																																																							private int ticks = 0;
																																																																							private float waitTicks;
																																																																							private LevelAccessor world;

																																																																							public void start(
																																																																									LevelAccessor world,
																																																																									int waitTicks) {
																																																																								this.waitTicks = waitTicks;
																																																																								MinecraftForge.EVENT_BUS
																																																																										.register(
																																																																												this);
																																																																								this.world = world;
																																																																							}

																																																																							@SubscribeEvent
																																																																							public void tick(
																																																																									TickEvent.ServerTickEvent event) {
																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																									this.ticks += 1;
																																																																									if (this.ticks >= this.waitTicks)
																																																																										run();
																																																																								}
																																																																							}

																																																																							private void run() {
																																																																								{
																																																																									Entity _ent = entity;
																																																																									_ent.teleportTo(
																																																																											((entity.getCapability(
																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																													null)
																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																											((entity.getCapability(
																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																													null)
																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																											((entity.getCapability(
																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																													null)
																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																										_serverPlayer.connection
																																																																												.teleport(
																																																																														((entity.getCapability(
																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																null)
																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																														((entity.getCapability(
																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																null)
																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																														((entity.getCapability(
																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																null)
																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																														_ent.getYRot(),
																																																																														_ent.getXRot());
																																																																								}
																																																																								new Object() {
																																																																									private int ticks = 0;
																																																																									private float waitTicks;
																																																																									private LevelAccessor world;

																																																																									public void start(
																																																																											LevelAccessor world,
																																																																											int waitTicks) {
																																																																										this.waitTicks = waitTicks;
																																																																										MinecraftForge.EVENT_BUS
																																																																												.register(
																																																																														this);
																																																																										this.world = world;
																																																																									}

																																																																									@SubscribeEvent
																																																																									public void tick(
																																																																											TickEvent.ServerTickEvent event) {
																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																											this.ticks += 1;
																																																																											if (this.ticks >= this.waitTicks)
																																																																												run();
																																																																										}
																																																																									}

																																																																									private void run() {
																																																																										{
																																																																											Entity _ent = entity;
																																																																											_ent.teleportTo(
																																																																													((entity.getCapability(
																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																															null)
																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																													((entity.getCapability(
																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																															null)
																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																													((entity.getCapability(
																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																															null)
																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																												_serverPlayer.connection
																																																																														.teleport(
																																																																																((entity.getCapability(
																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																		null)
																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																((entity.getCapability(
																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																		null)
																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																((entity.getCapability(
																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																		null)
																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																_ent.getYRot(),
																																																																																_ent.getXRot());
																																																																										}
																																																																										new Object() {
																																																																											private int ticks = 0;
																																																																											private float waitTicks;
																																																																											private LevelAccessor world;

																																																																											public void start(
																																																																													LevelAccessor world,
																																																																													int waitTicks) {
																																																																												this.waitTicks = waitTicks;
																																																																												MinecraftForge.EVENT_BUS
																																																																														.register(
																																																																																this);
																																																																												this.world = world;
																																																																											}

																																																																											@SubscribeEvent
																																																																											public void tick(
																																																																													TickEvent.ServerTickEvent event) {
																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																													this.ticks += 1;
																																																																													if (this.ticks >= this.waitTicks)
																																																																														run();
																																																																												}
																																																																											}

																																																																											private void run() {
																																																																												{
																																																																													Entity _ent = entity;
																																																																													_ent.teleportTo(
																																																																															((entity.getCapability(
																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																	null)
																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																															((entity.getCapability(
																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																	null)
																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																															((entity.getCapability(
																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																	null)
																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																														_serverPlayer.connection
																																																																																.teleport(
																																																																																		((entity.getCapability(
																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																				null)
																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																		((entity.getCapability(
																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																				null)
																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																		((entity.getCapability(
																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																				null)
																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																		_ent.getYRot(),
																																																																																		_ent.getXRot());
																																																																												}
																																																																												new Object() {
																																																																													private int ticks = 0;
																																																																													private float waitTicks;
																																																																													private LevelAccessor world;

																																																																													public void start(
																																																																															LevelAccessor world,
																																																																															int waitTicks) {
																																																																														this.waitTicks = waitTicks;
																																																																														MinecraftForge.EVENT_BUS
																																																																																.register(
																																																																																		this);
																																																																														this.world = world;
																																																																													}

																																																																													@SubscribeEvent
																																																																													public void tick(
																																																																															TickEvent.ServerTickEvent event) {
																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																															this.ticks += 1;
																																																																															if (this.ticks >= this.waitTicks)
																																																																																run();
																																																																														}
																																																																													}

																																																																													private void run() {
																																																																														{
																																																																															Entity _ent = entity;
																																																																															_ent.teleportTo(
																																																																																	((entity.getCapability(
																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																			null)
																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																	((entity.getCapability(
																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																			null)
																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																	((entity.getCapability(
																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																			null)
																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																_serverPlayer.connection
																																																																																		.teleport(
																																																																																				((entity.getCapability(
																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																						null)
																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																				((entity.getCapability(
																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																						null)
																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																				((entity.getCapability(
																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																						null)
																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																				_ent.getYRot(),
																																																																																				_ent.getXRot());
																																																																														}
																																																																														new Object() {
																																																																															private int ticks = 0;
																																																																															private float waitTicks;
																																																																															private LevelAccessor world;

																																																																															public void start(
																																																																																	LevelAccessor world,
																																																																																	int waitTicks) {
																																																																																this.waitTicks = waitTicks;
																																																																																MinecraftForge.EVENT_BUS
																																																																																		.register(
																																																																																				this);
																																																																																this.world = world;
																																																																															}

																																																																															@SubscribeEvent
																																																																															public void tick(
																																																																																	TickEvent.ServerTickEvent event) {
																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																	this.ticks += 1;
																																																																																	if (this.ticks >= this.waitTicks)
																																																																																		run();
																																																																																}
																																																																															}

																																																																															private void run() {
																																																																																{
																																																																																	Entity _ent = entity;
																																																																																	_ent.teleportTo(
																																																																																			((entity.getCapability(
																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																					null)
																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																			((entity.getCapability(
																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																					null)
																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																			((entity.getCapability(
																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																					null)
																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																		_serverPlayer.connection
																																																																																				.teleport(
																																																																																						((entity.getCapability(
																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																								null)
																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																						((entity.getCapability(
																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																								null)
																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																						((entity.getCapability(
																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																								null)
																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																						_ent.getYRot(),
																																																																																						_ent.getXRot());
																																																																																}
																																																																																new Object() {
																																																																																	private int ticks = 0;
																																																																																	private float waitTicks;
																																																																																	private LevelAccessor world;

																																																																																	public void start(
																																																																																			LevelAccessor world,
																																																																																			int waitTicks) {
																																																																																		this.waitTicks = waitTicks;
																																																																																		MinecraftForge.EVENT_BUS
																																																																																				.register(
																																																																																						this);
																																																																																		this.world = world;
																																																																																	}

																																																																																	@SubscribeEvent
																																																																																	public void tick(
																																																																																			TickEvent.ServerTickEvent event) {
																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																			this.ticks += 1;
																																																																																			if (this.ticks >= this.waitTicks)
																																																																																				run();
																																																																																		}
																																																																																	}

																																																																																	private void run() {
																																																																																		{
																																																																																			Entity _ent = entity;
																																																																																			_ent.teleportTo(
																																																																																					((entity.getCapability(
																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																							null)
																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																					((entity.getCapability(
																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																							null)
																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																					((entity.getCapability(
																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																							null)
																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																				_serverPlayer.connection
																																																																																						.teleport(
																																																																																								((entity.getCapability(
																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																										null)
																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																								((entity.getCapability(
																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																										null)
																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																								((entity.getCapability(
																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																										null)
																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																								_ent.getYRot(),
																																																																																								_ent.getXRot());
																																																																																		}
																																																																																		new Object() {
																																																																																			private int ticks = 0;
																																																																																			private float waitTicks;
																																																																																			private LevelAccessor world;

																																																																																			public void start(
																																																																																					LevelAccessor world,
																																																																																					int waitTicks) {
																																																																																				this.waitTicks = waitTicks;
																																																																																				MinecraftForge.EVENT_BUS
																																																																																						.register(
																																																																																								this);
																																																																																				this.world = world;
																																																																																			}

																																																																																			@SubscribeEvent
																																																																																			public void tick(
																																																																																					TickEvent.ServerTickEvent event) {
																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																					this.ticks += 1;
																																																																																					if (this.ticks >= this.waitTicks)
																																																																																						run();
																																																																																				}
																																																																																			}

																																																																																			private void run() {
																																																																																				{
																																																																																					Entity _ent = entity;
																																																																																					_ent.teleportTo(
																																																																																							((entity.getCapability(
																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																									null)
																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																							((entity.getCapability(
																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																									null)
																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																							((entity.getCapability(
																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																									null)
																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																						_serverPlayer.connection
																																																																																								.teleport(
																																																																																										((entity.getCapability(
																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																												null)
																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																										((entity.getCapability(
																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																												null)
																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																										((entity.getCapability(
																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																												null)
																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																										_ent.getYRot(),
																																																																																										_ent.getXRot());
																																																																																				}
																																																																																				new Object() {
																																																																																					private int ticks = 0;
																																																																																					private float waitTicks;
																																																																																					private LevelAccessor world;

																																																																																					public void start(
																																																																																							LevelAccessor world,
																																																																																							int waitTicks) {
																																																																																						this.waitTicks = waitTicks;
																																																																																						MinecraftForge.EVENT_BUS
																																																																																								.register(
																																																																																										this);
																																																																																						this.world = world;
																																																																																					}

																																																																																					@SubscribeEvent
																																																																																					public void tick(
																																																																																							TickEvent.ServerTickEvent event) {
																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																							this.ticks += 1;
																																																																																							if (this.ticks >= this.waitTicks)
																																																																																								run();
																																																																																						}
																																																																																					}

																																																																																					private void run() {
																																																																																						{
																																																																																							Entity _ent = entity;
																																																																																							_ent.teleportTo(
																																																																																									((entity.getCapability(
																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																											null)
																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																									((entity.getCapability(
																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																											null)
																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																									((entity.getCapability(
																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																											null)
																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																								_serverPlayer.connection
																																																																																										.teleport(
																																																																																												((entity.getCapability(
																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																														null)
																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																												((entity.getCapability(
																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																														null)
																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																												((entity.getCapability(
																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																														null)
																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																												_ent.getYRot(),
																																																																																												_ent.getXRot());
																																																																																						}
																																																																																						new Object() {
																																																																																							private int ticks = 0;
																																																																																							private float waitTicks;
																																																																																							private LevelAccessor world;

																																																																																							public void start(
																																																																																									LevelAccessor world,
																																																																																									int waitTicks) {
																																																																																								this.waitTicks = waitTicks;
																																																																																								MinecraftForge.EVENT_BUS
																																																																																										.register(
																																																																																												this);
																																																																																								this.world = world;
																																																																																							}

																																																																																							@SubscribeEvent
																																																																																							public void tick(
																																																																																									TickEvent.ServerTickEvent event) {
																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																									this.ticks += 1;
																																																																																									if (this.ticks >= this.waitTicks)
																																																																																										run();
																																																																																								}
																																																																																							}

																																																																																							private void run() {
																																																																																								{
																																																																																									Entity _ent = entity;
																																																																																									_ent.teleportTo(
																																																																																											((entity.getCapability(
																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																													null)
																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																											((entity.getCapability(
																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																													null)
																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																											((entity.getCapability(
																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																													null)
																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																										_serverPlayer.connection
																																																																																												.teleport(
																																																																																														((entity.getCapability(
																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																null)
																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																														((entity.getCapability(
																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																null)
																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																														((entity.getCapability(
																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																null)
																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																														_ent.getYRot(),
																																																																																														_ent.getXRot());
																																																																																								}
																																																																																								new Object() {
																																																																																									private int ticks = 0;
																																																																																									private float waitTicks;
																																																																																									private LevelAccessor world;

																																																																																									public void start(
																																																																																											LevelAccessor world,
																																																																																											int waitTicks) {
																																																																																										this.waitTicks = waitTicks;
																																																																																										MinecraftForge.EVENT_BUS
																																																																																												.register(
																																																																																														this);
																																																																																										this.world = world;
																																																																																									}

																																																																																									@SubscribeEvent
																																																																																									public void tick(
																																																																																											TickEvent.ServerTickEvent event) {
																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																											this.ticks += 1;
																																																																																											if (this.ticks >= this.waitTicks)
																																																																																												run();
																																																																																										}
																																																																																									}

																																																																																									private void run() {
																																																																																										{
																																																																																											Entity _ent = entity;
																																																																																											_ent.teleportTo(
																																																																																													((entity.getCapability(
																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																															null)
																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																													((entity.getCapability(
																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																															null)
																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																													((entity.getCapability(
																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																															null)
																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																												_serverPlayer.connection
																																																																																														.teleport(
																																																																																																((entity.getCapability(
																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																		null)
																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																((entity.getCapability(
																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																		null)
																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																((entity.getCapability(
																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																		null)
																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																_ent.getYRot(),
																																																																																																_ent.getXRot());
																																																																																										}
																																																																																										new Object() {
																																																																																											private int ticks = 0;
																																																																																											private float waitTicks;
																																																																																											private LevelAccessor world;

																																																																																											public void start(
																																																																																													LevelAccessor world,
																																																																																													int waitTicks) {
																																																																																												this.waitTicks = waitTicks;
																																																																																												MinecraftForge.EVENT_BUS
																																																																																														.register(
																																																																																																this);
																																																																																												this.world = world;
																																																																																											}

																																																																																											@SubscribeEvent
																																																																																											public void tick(
																																																																																													TickEvent.ServerTickEvent event) {
																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																													this.ticks += 1;
																																																																																													if (this.ticks >= this.waitTicks)
																																																																																														run();
																																																																																												}
																																																																																											}

																																																																																											private void run() {
																																																																																												{
																																																																																													Entity _ent = entity;
																																																																																													_ent.teleportTo(
																																																																																															((entity.getCapability(
																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																	null)
																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																															((entity.getCapability(
																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																	null)
																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																															((entity.getCapability(
																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																	null)
																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																														_serverPlayer.connection
																																																																																																.teleport(
																																																																																																		((entity.getCapability(
																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																				null)
																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																		((entity.getCapability(
																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																				null)
																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																		((entity.getCapability(
																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																				null)
																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																		_ent.getYRot(),
																																																																																																		_ent.getXRot());
																																																																																												}
																																																																																												new Object() {
																																																																																													private int ticks = 0;
																																																																																													private float waitTicks;
																																																																																													private LevelAccessor world;

																																																																																													public void start(
																																																																																															LevelAccessor world,
																																																																																															int waitTicks) {
																																																																																														this.waitTicks = waitTicks;
																																																																																														MinecraftForge.EVENT_BUS
																																																																																																.register(
																																																																																																		this);
																																																																																														this.world = world;
																																																																																													}

																																																																																													@SubscribeEvent
																																																																																													public void tick(
																																																																																															TickEvent.ServerTickEvent event) {
																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																															this.ticks += 1;
																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																run();
																																																																																														}
																																																																																													}

																																																																																													private void run() {
																																																																																														{
																																																																																															Entity _ent = entity;
																																																																																															_ent.teleportTo(
																																																																																																	((entity.getCapability(
																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																			null)
																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																	((entity.getCapability(
																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																			null)
																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																	((entity.getCapability(
																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																			null)
																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																_serverPlayer.connection
																																																																																																		.teleport(
																																																																																																				((entity.getCapability(
																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																						null)
																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																				((entity.getCapability(
																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																						null)
																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																				((entity.getCapability(
																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																						null)
																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																				_ent.getYRot(),
																																																																																																				_ent.getXRot());
																																																																																														}
																																																																																														new Object() {
																																																																																															private int ticks = 0;
																																																																																															private float waitTicks;
																																																																																															private LevelAccessor world;

																																																																																															public void start(
																																																																																																	LevelAccessor world,
																																																																																																	int waitTicks) {
																																																																																																this.waitTicks = waitTicks;
																																																																																																MinecraftForge.EVENT_BUS
																																																																																																		.register(
																																																																																																				this);
																																																																																																this.world = world;
																																																																																															}

																																																																																															@SubscribeEvent
																																																																																															public void tick(
																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																	this.ticks += 1;
																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																		run();
																																																																																																}
																																																																																															}

																																																																																															private void run() {
																																																																																																{
																																																																																																	Entity _ent = entity;
																																																																																																	_ent.teleportTo(
																																																																																																			((entity.getCapability(
																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																					null)
																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																			((entity.getCapability(
																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																					null)
																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																			((entity.getCapability(
																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																					null)
																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																		_serverPlayer.connection
																																																																																																				.teleport(
																																																																																																						((entity.getCapability(
																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																								null)
																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																						((entity.getCapability(
																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																								null)
																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																						((entity.getCapability(
																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																								null)
																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																						_ent.getYRot(),
																																																																																																						_ent.getXRot());
																																																																																																}
																																																																																																new Object() {
																																																																																																	private int ticks = 0;
																																																																																																	private float waitTicks;
																																																																																																	private LevelAccessor world;

																																																																																																	public void start(
																																																																																																			LevelAccessor world,
																																																																																																			int waitTicks) {
																																																																																																		this.waitTicks = waitTicks;
																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																				.register(
																																																																																																						this);
																																																																																																		this.world = world;
																																																																																																	}

																																																																																																	@SubscribeEvent
																																																																																																	public void tick(
																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																			this.ticks += 1;
																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																				run();
																																																																																																		}
																																																																																																	}

																																																																																																	private void run() {
																																																																																																		{
																																																																																																			Entity _ent = entity;
																																																																																																			_ent.teleportTo(
																																																																																																					((entity.getCapability(
																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																							null)
																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																					((entity.getCapability(
																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																							null)
																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																					((entity.getCapability(
																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																							null)
																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																				_serverPlayer.connection
																																																																																																						.teleport(
																																																																																																								((entity.getCapability(
																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																										null)
																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																								((entity.getCapability(
																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																										null)
																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																								((entity.getCapability(
																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																										null)
																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																								_ent.getYRot(),
																																																																																																								_ent.getXRot());
																																																																																																		}
																																																																																																		new Object() {
																																																																																																			private int ticks = 0;
																																																																																																			private float waitTicks;
																																																																																																			private LevelAccessor world;

																																																																																																			public void start(
																																																																																																					LevelAccessor world,
																																																																																																					int waitTicks) {
																																																																																																				this.waitTicks = waitTicks;
																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																						.register(
																																																																																																								this);
																																																																																																				this.world = world;
																																																																																																			}

																																																																																																			@SubscribeEvent
																																																																																																			public void tick(
																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																					this.ticks += 1;
																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																						run();
																																																																																																				}
																																																																																																			}

																																																																																																			private void run() {
																																																																																																				{
																																																																																																					Entity _ent = entity;
																																																																																																					_ent.teleportTo(
																																																																																																							((entity.getCapability(
																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																									null)
																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																							((entity.getCapability(
																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																									null)
																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																							((entity.getCapability(
																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																									null)
																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																						_serverPlayer.connection
																																																																																																								.teleport(
																																																																																																										((entity.getCapability(
																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																												null)
																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																										((entity.getCapability(
																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																												null)
																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																										((entity.getCapability(
																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																												null)
																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																										_ent.getYRot(),
																																																																																																										_ent.getXRot());
																																																																																																				}
																																																																																																				new Object() {
																																																																																																					private int ticks = 0;
																																																																																																					private float waitTicks;
																																																																																																					private LevelAccessor world;

																																																																																																					public void start(
																																																																																																							LevelAccessor world,
																																																																																																							int waitTicks) {
																																																																																																						this.waitTicks = waitTicks;
																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																								.register(
																																																																																																										this);
																																																																																																						this.world = world;
																																																																																																					}

																																																																																																					@SubscribeEvent
																																																																																																					public void tick(
																																																																																																							TickEvent.ServerTickEvent event) {
																																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																																							this.ticks += 1;
																																																																																																							if (this.ticks >= this.waitTicks)
																																																																																																								run();
																																																																																																						}
																																																																																																					}

																																																																																																					private void run() {
																																																																																																						{
																																																																																																							Entity _ent = entity;
																																																																																																							_ent.teleportTo(
																																																																																																									((entity.getCapability(
																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																											null)
																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																									((entity.getCapability(
																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																											null)
																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																									((entity.getCapability(
																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																											null)
																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																								_serverPlayer.connection
																																																																																																										.teleport(
																																																																																																												((entity.getCapability(
																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																														null)
																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																												((entity.getCapability(
																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																														null)
																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																												((entity.getCapability(
																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																														null)
																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																												_ent.getYRot(),
																																																																																																												_ent.getXRot());
																																																																																																						}
																																																																																																						new Object() {
																																																																																																							private int ticks = 0;
																																																																																																							private float waitTicks;
																																																																																																							private LevelAccessor world;

																																																																																																							public void start(
																																																																																																									LevelAccessor world,
																																																																																																									int waitTicks) {
																																																																																																								this.waitTicks = waitTicks;
																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																										.register(
																																																																																																												this);
																																																																																																								this.world = world;
																																																																																																							}

																																																																																																							@SubscribeEvent
																																																																																																							public void tick(
																																																																																																									TickEvent.ServerTickEvent event) {
																																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																																									this.ticks += 1;
																																																																																																									if (this.ticks >= this.waitTicks)
																																																																																																										run();
																																																																																																								}
																																																																																																							}

																																																																																																							private void run() {
																																																																																																								{
																																																																																																									Entity _ent = entity;
																																																																																																									_ent.teleportTo(
																																																																																																											((entity.getCapability(
																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																													null)
																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																											((entity.getCapability(
																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																													null)
																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																											((entity.getCapability(
																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																													null)
																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																										_serverPlayer.connection
																																																																																																												.teleport(
																																																																																																														((entity.getCapability(
																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																null)
																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																														((entity.getCapability(
																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																null)
																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																														((entity.getCapability(
																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																null)
																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																														_ent.getYRot(),
																																																																																																														_ent.getXRot());
																																																																																																								}
																																																																																																								new Object() {
																																																																																																									private int ticks = 0;
																																																																																																									private float waitTicks;
																																																																																																									private LevelAccessor world;

																																																																																																									public void start(
																																																																																																											LevelAccessor world,
																																																																																																											int waitTicks) {
																																																																																																										this.waitTicks = waitTicks;
																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																												.register(
																																																																																																														this);
																																																																																																										this.world = world;
																																																																																																									}

																																																																																																									@SubscribeEvent
																																																																																																									public void tick(
																																																																																																											TickEvent.ServerTickEvent event) {
																																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																																											this.ticks += 1;
																																																																																																											if (this.ticks >= this.waitTicks)
																																																																																																												run();
																																																																																																										}
																																																																																																									}

																																																																																																									private void run() {
																																																																																																										{
																																																																																																											Entity _ent = entity;
																																																																																																											_ent.teleportTo(
																																																																																																													((entity.getCapability(
																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																															null)
																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																													((entity.getCapability(
																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																															null)
																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																													((entity.getCapability(
																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																															null)
																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																												_serverPlayer.connection
																																																																																																														.teleport(
																																																																																																																((entity.getCapability(
																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																		null)
																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																((entity.getCapability(
																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																		null)
																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																((entity.getCapability(
																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																		null)
																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																_ent.getYRot(),
																																																																																																																_ent.getXRot());
																																																																																																										}
																																																																																																										new Object() {
																																																																																																											private int ticks = 0;
																																																																																																											private float waitTicks;
																																																																																																											private LevelAccessor world;

																																																																																																											public void start(
																																																																																																													LevelAccessor world,
																																																																																																													int waitTicks) {
																																																																																																												this.waitTicks = waitTicks;
																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																														.register(
																																																																																																																this);
																																																																																																												this.world = world;
																																																																																																											}

																																																																																																											@SubscribeEvent
																																																																																																											public void tick(
																																																																																																													TickEvent.ServerTickEvent event) {
																																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																																													this.ticks += 1;
																																																																																																													if (this.ticks >= this.waitTicks)
																																																																																																														run();
																																																																																																												}
																																																																																																											}

																																																																																																											private void run() {
																																																																																																												{
																																																																																																													Entity _ent = entity;
																																																																																																													_ent.teleportTo(
																																																																																																															((entity.getCapability(
																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																	null)
																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																															((entity.getCapability(
																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																	null)
																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																															((entity.getCapability(
																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																	null)
																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																														_serverPlayer.connection
																																																																																																																.teleport(
																																																																																																																		((entity.getCapability(
																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																				null)
																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																		((entity.getCapability(
																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																				null)
																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																		((entity.getCapability(
																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																				null)
																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																		_ent.getYRot(),
																																																																																																																		_ent.getXRot());
																																																																																																												}
																																																																																																												new Object() {
																																																																																																													private int ticks = 0;
																																																																																																													private float waitTicks;
																																																																																																													private LevelAccessor world;

																																																																																																													public void start(
																																																																																																															LevelAccessor world,
																																																																																																															int waitTicks) {
																																																																																																														this.waitTicks = waitTicks;
																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																.register(
																																																																																																																		this);
																																																																																																														this.world = world;
																																																																																																													}

																																																																																																													@SubscribeEvent
																																																																																																													public void tick(
																																																																																																															TickEvent.ServerTickEvent event) {
																																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																																															this.ticks += 1;
																																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																																run();
																																																																																																														}
																																																																																																													}

																																																																																																													private void run() {
																																																																																																														{
																																																																																																															Entity _ent = entity;
																																																																																																															_ent.teleportTo(
																																																																																																																	((entity.getCapability(
																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																			null)
																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																	((entity.getCapability(
																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																			null)
																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																	((entity.getCapability(
																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																			null)
																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																_serverPlayer.connection
																																																																																																																		.teleport(
																																																																																																																				((entity.getCapability(
																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																						null)
																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																				((entity.getCapability(
																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																						null)
																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																				((entity.getCapability(
																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																						null)
																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																				_ent.getYRot(),
																																																																																																																				_ent.getXRot());
																																																																																																														}
																																																																																																														new Object() {
																																																																																																															private int ticks = 0;
																																																																																																															private float waitTicks;
																																																																																																															private LevelAccessor world;

																																																																																																															public void start(
																																																																																																																	LevelAccessor world,
																																																																																																																	int waitTicks) {
																																																																																																																this.waitTicks = waitTicks;
																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																		.register(
																																																																																																																				this);
																																																																																																																this.world = world;
																																																																																																															}

																																																																																																															@SubscribeEvent
																																																																																																															public void tick(
																																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																																	this.ticks += 1;
																																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																																		run();
																																																																																																																}
																																																																																																															}

																																																																																																															private void run() {
																																																																																																																{
																																																																																																																	Entity _ent = entity;
																																																																																																																	_ent.teleportTo(
																																																																																																																			((entity.getCapability(
																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																					null)
																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																			((entity.getCapability(
																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																					null)
																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																			((entity.getCapability(
																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																					null)
																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																		_serverPlayer.connection
																																																																																																																				.teleport(
																																																																																																																						((entity.getCapability(
																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																								null)
																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																						((entity.getCapability(
																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																								null)
																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																						((entity.getCapability(
																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																								null)
																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																						_ent.getYRot(),
																																																																																																																						_ent.getXRot());
																																																																																																																}
																																																																																																																new Object() {
																																																																																																																	private int ticks = 0;
																																																																																																																	private float waitTicks;
																																																																																																																	private LevelAccessor world;

																																																																																																																	public void start(
																																																																																																																			LevelAccessor world,
																																																																																																																			int waitTicks) {
																																																																																																																		this.waitTicks = waitTicks;
																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																				.register(
																																																																																																																						this);
																																																																																																																		this.world = world;
																																																																																																																	}

																																																																																																																	@SubscribeEvent
																																																																																																																	public void tick(
																																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																																			this.ticks += 1;
																																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																																				run();
																																																																																																																		}
																																																																																																																	}

																																																																																																																	private void run() {
																																																																																																																		{
																																																																																																																			Entity _ent = entity;
																																																																																																																			_ent.teleportTo(
																																																																																																																					((entity.getCapability(
																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																							null)
																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																					((entity.getCapability(
																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																							null)
																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																					((entity.getCapability(
																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																							null)
																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																				_serverPlayer.connection
																																																																																																																						.teleport(
																																																																																																																								((entity.getCapability(
																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																										null)
																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																								((entity.getCapability(
																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																										null)
																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																								((entity.getCapability(
																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																										null)
																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																								_ent.getYRot(),
																																																																																																																								_ent.getXRot());
																																																																																																																		}
																																																																																																																		new Object() {
																																																																																																																			private int ticks = 0;
																																																																																																																			private float waitTicks;
																																																																																																																			private LevelAccessor world;

																																																																																																																			public void start(
																																																																																																																					LevelAccessor world,
																																																																																																																					int waitTicks) {
																																																																																																																				this.waitTicks = waitTicks;
																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																						.register(
																																																																																																																								this);
																																																																																																																				this.world = world;
																																																																																																																			}

																																																																																																																			@SubscribeEvent
																																																																																																																			public void tick(
																																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																																					this.ticks += 1;
																																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																																						run();
																																																																																																																				}
																																																																																																																			}

																																																																																																																			private void run() {
																																																																																																																				{
																																																																																																																					Entity _ent = entity;
																																																																																																																					_ent.teleportTo(
																																																																																																																							((entity.getCapability(
																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																									null)
																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																							((entity.getCapability(
																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																									null)
																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																							((entity.getCapability(
																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																									null)
																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																						_serverPlayer.connection
																																																																																																																								.teleport(
																																																																																																																										((entity.getCapability(
																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																												null)
																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																										((entity.getCapability(
																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																												null)
																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																										((entity.getCapability(
																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																												null)
																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																										_ent.getYRot(),
																																																																																																																										_ent.getXRot());
																																																																																																																				}
																																																																																																																				new Object() {
																																																																																																																					private int ticks = 0;
																																																																																																																					private float waitTicks;
																																																																																																																					private LevelAccessor world;

																																																																																																																					public void start(
																																																																																																																							LevelAccessor world,
																																																																																																																							int waitTicks) {
																																																																																																																						this.waitTicks = waitTicks;
																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																								.register(
																																																																																																																										this);
																																																																																																																						this.world = world;
																																																																																																																					}

																																																																																																																					@SubscribeEvent
																																																																																																																					public void tick(
																																																																																																																							TickEvent.ServerTickEvent event) {
																																																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																																																							this.ticks += 1;
																																																																																																																							if (this.ticks >= this.waitTicks)
																																																																																																																								run();
																																																																																																																						}
																																																																																																																					}

																																																																																																																					private void run() {
																																																																																																																						{
																																																																																																																							Entity _ent = entity;
																																																																																																																							_ent.teleportTo(
																																																																																																																									((entity.getCapability(
																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																											null)
																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																									((entity.getCapability(
																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																											null)
																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																									((entity.getCapability(
																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																											null)
																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																								_serverPlayer.connection
																																																																																																																										.teleport(
																																																																																																																												((entity.getCapability(
																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																														null)
																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																												((entity.getCapability(
																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																														null)
																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																												((entity.getCapability(
																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																														null)
																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																												_ent.getYRot(),
																																																																																																																												_ent.getXRot());
																																																																																																																						}
																																																																																																																						new Object() {
																																																																																																																							private int ticks = 0;
																																																																																																																							private float waitTicks;
																																																																																																																							private LevelAccessor world;

																																																																																																																							public void start(
																																																																																																																									LevelAccessor world,
																																																																																																																									int waitTicks) {
																																																																																																																								this.waitTicks = waitTicks;
																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																										.register(
																																																																																																																												this);
																																																																																																																								this.world = world;
																																																																																																																							}

																																																																																																																							@SubscribeEvent
																																																																																																																							public void tick(
																																																																																																																									TickEvent.ServerTickEvent event) {
																																																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																																																									this.ticks += 1;
																																																																																																																									if (this.ticks >= this.waitTicks)
																																																																																																																										run();
																																																																																																																								}
																																																																																																																							}

																																																																																																																							private void run() {
																																																																																																																								{
																																																																																																																									Entity _ent = entity;
																																																																																																																									_ent.teleportTo(
																																																																																																																											((entity.getCapability(
																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																													null)
																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																											((entity.getCapability(
																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																													null)
																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																											((entity.getCapability(
																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																													null)
																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																										_serverPlayer.connection
																																																																																																																												.teleport(
																																																																																																																														((entity.getCapability(
																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																null)
																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																														((entity.getCapability(
																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																null)
																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																														((entity.getCapability(
																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																null)
																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																														_ent.getYRot(),
																																																																																																																														_ent.getXRot());
																																																																																																																								}
																																																																																																																								new Object() {
																																																																																																																									private int ticks = 0;
																																																																																																																									private float waitTicks;
																																																																																																																									private LevelAccessor world;

																																																																																																																									public void start(
																																																																																																																											LevelAccessor world,
																																																																																																																											int waitTicks) {
																																																																																																																										this.waitTicks = waitTicks;
																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																												.register(
																																																																																																																														this);
																																																																																																																										this.world = world;
																																																																																																																									}

																																																																																																																									@SubscribeEvent
																																																																																																																									public void tick(
																																																																																																																											TickEvent.ServerTickEvent event) {
																																																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																																																											this.ticks += 1;
																																																																																																																											if (this.ticks >= this.waitTicks)
																																																																																																																												run();
																																																																																																																										}
																																																																																																																									}

																																																																																																																									private void run() {
																																																																																																																										{
																																																																																																																											Entity _ent = entity;
																																																																																																																											_ent.teleportTo(
																																																																																																																													((entity.getCapability(
																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																															null)
																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																													((entity.getCapability(
																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																															null)
																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																													((entity.getCapability(
																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																															null)
																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																												_serverPlayer.connection
																																																																																																																														.teleport(
																																																																																																																																((entity.getCapability(
																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																		null)
																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																((entity.getCapability(
																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																		null)
																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																((entity.getCapability(
																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																		null)
																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																_ent.getYRot(),
																																																																																																																																_ent.getXRot());
																																																																																																																										}
																																																																																																																										new Object() {
																																																																																																																											private int ticks = 0;
																																																																																																																											private float waitTicks;
																																																																																																																											private LevelAccessor world;

																																																																																																																											public void start(
																																																																																																																													LevelAccessor world,
																																																																																																																													int waitTicks) {
																																																																																																																												this.waitTicks = waitTicks;
																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																														.register(
																																																																																																																																this);
																																																																																																																												this.world = world;
																																																																																																																											}

																																																																																																																											@SubscribeEvent
																																																																																																																											public void tick(
																																																																																																																													TickEvent.ServerTickEvent event) {
																																																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																																																													this.ticks += 1;
																																																																																																																													if (this.ticks >= this.waitTicks)
																																																																																																																														run();
																																																																																																																												}
																																																																																																																											}

																																																																																																																											private void run() {
																																																																																																																												{
																																																																																																																													Entity _ent = entity;
																																																																																																																													_ent.teleportTo(
																																																																																																																															((entity.getCapability(
																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																	null)
																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																															((entity.getCapability(
																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																	null)
																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																															((entity.getCapability(
																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																	null)
																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																														_serverPlayer.connection
																																																																																																																																.teleport(
																																																																																																																																		((entity.getCapability(
																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																				null)
																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																		((entity.getCapability(
																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																				null)
																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																		((entity.getCapability(
																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																				null)
																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																		_ent.getYRot(),
																																																																																																																																		_ent.getXRot());
																																																																																																																												}
																																																																																																																												new Object() {
																																																																																																																													private int ticks = 0;
																																																																																																																													private float waitTicks;
																																																																																																																													private LevelAccessor world;

																																																																																																																													public void start(
																																																																																																																															LevelAccessor world,
																																																																																																																															int waitTicks) {
																																																																																																																														this.waitTicks = waitTicks;
																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																.register(
																																																																																																																																		this);
																																																																																																																														this.world = world;
																																																																																																																													}

																																																																																																																													@SubscribeEvent
																																																																																																																													public void tick(
																																																																																																																															TickEvent.ServerTickEvent event) {
																																																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																																																															this.ticks += 1;
																																																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																																																run();
																																																																																																																														}
																																																																																																																													}

																																																																																																																													private void run() {
																																																																																																																														{
																																																																																																																															Entity _ent = entity;
																																																																																																																															_ent.teleportTo(
																																																																																																																																	((entity.getCapability(
																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																			null)
																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																	((entity.getCapability(
																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																			null)
																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																	((entity.getCapability(
																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																			null)
																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																_serverPlayer.connection
																																																																																																																																		.teleport(
																																																																																																																																				((entity.getCapability(
																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																						null)
																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																				((entity.getCapability(
																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																						null)
																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																				((entity.getCapability(
																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																						null)
																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																				_ent.getYRot(),
																																																																																																																																				_ent.getXRot());
																																																																																																																														}
																																																																																																																														new Object() {
																																																																																																																															private int ticks = 0;
																																																																																																																															private float waitTicks;
																																																																																																																															private LevelAccessor world;

																																																																																																																															public void start(
																																																																																																																																	LevelAccessor world,
																																																																																																																																	int waitTicks) {
																																																																																																																																this.waitTicks = waitTicks;
																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																		.register(
																																																																																																																																				this);
																																																																																																																																this.world = world;
																																																																																																																															}

																																																																																																																															@SubscribeEvent
																																																																																																																															public void tick(
																																																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																																																	this.ticks += 1;
																																																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																																																		run();
																																																																																																																																}
																																																																																																																															}

																																																																																																																															private void run() {
																																																																																																																																{
																																																																																																																																	Entity _ent = entity;
																																																																																																																																	_ent.teleportTo(
																																																																																																																																			((entity.getCapability(
																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																					null)
																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																			((entity.getCapability(
																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																					null)
																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																			((entity.getCapability(
																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																					null)
																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																		_serverPlayer.connection
																																																																																																																																				.teleport(
																																																																																																																																						((entity.getCapability(
																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																								null)
																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																						((entity.getCapability(
																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																								null)
																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																						((entity.getCapability(
																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																								null)
																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																						_ent.getYRot(),
																																																																																																																																						_ent.getXRot());
																																																																																																																																}
																																																																																																																																new Object() {
																																																																																																																																	private int ticks = 0;
																																																																																																																																	private float waitTicks;
																																																																																																																																	private LevelAccessor world;

																																																																																																																																	public void start(
																																																																																																																																			LevelAccessor world,
																																																																																																																																			int waitTicks) {
																																																																																																																																		this.waitTicks = waitTicks;
																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																				.register(
																																																																																																																																						this);
																																																																																																																																		this.world = world;
																																																																																																																																	}

																																																																																																																																	@SubscribeEvent
																																																																																																																																	public void tick(
																																																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																																																			this.ticks += 1;
																																																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																																																				run();
																																																																																																																																		}
																																																																																																																																	}

																																																																																																																																	private void run() {
																																																																																																																																		{
																																																																																																																																			Entity _ent = entity;
																																																																																																																																			_ent.teleportTo(
																																																																																																																																					((entity.getCapability(
																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																							null)
																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																					((entity.getCapability(
																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																							null)
																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																					((entity.getCapability(
																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																							null)
																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																				_serverPlayer.connection
																																																																																																																																						.teleport(
																																																																																																																																								((entity.getCapability(
																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																										null)
																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																								((entity.getCapability(
																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																										null)
																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																								((entity.getCapability(
																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																										null)
																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																								_ent.getYRot(),
																																																																																																																																								_ent.getXRot());
																																																																																																																																		}
																																																																																																																																		new Object() {
																																																																																																																																			private int ticks = 0;
																																																																																																																																			private float waitTicks;
																																																																																																																																			private LevelAccessor world;

																																																																																																																																			public void start(
																																																																																																																																					LevelAccessor world,
																																																																																																																																					int waitTicks) {
																																																																																																																																				this.waitTicks = waitTicks;
																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																						.register(
																																																																																																																																								this);
																																																																																																																																				this.world = world;
																																																																																																																																			}

																																																																																																																																			@SubscribeEvent
																																																																																																																																			public void tick(
																																																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																																																					this.ticks += 1;
																																																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																																																						run();
																																																																																																																																				}
																																																																																																																																			}

																																																																																																																																			private void run() {
																																																																																																																																				{
																																																																																																																																					Entity _ent = entity;
																																																																																																																																					_ent.teleportTo(
																																																																																																																																							((entity.getCapability(
																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																									null)
																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																							((entity.getCapability(
																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																									null)
																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																							((entity.getCapability(
																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																									null)
																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																						_serverPlayer.connection
																																																																																																																																								.teleport(
																																																																																																																																										((entity.getCapability(
																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																												null)
																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																										((entity.getCapability(
																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																												null)
																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																										((entity.getCapability(
																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																												null)
																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																										_ent.getYRot(),
																																																																																																																																										_ent.getXRot());
																																																																																																																																				}
																																																																																																																																				new Object() {
																																																																																																																																					private int ticks = 0;
																																																																																																																																					private float waitTicks;
																																																																																																																																					private LevelAccessor world;

																																																																																																																																					public void start(
																																																																																																																																							LevelAccessor world,
																																																																																																																																							int waitTicks) {
																																																																																																																																						this.waitTicks = waitTicks;
																																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																																								.register(
																																																																																																																																										this);
																																																																																																																																						this.world = world;
																																																																																																																																					}

																																																																																																																																					@SubscribeEvent
																																																																																																																																					public void tick(
																																																																																																																																							TickEvent.ServerTickEvent event) {
																																																																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																																																																							this.ticks += 1;
																																																																																																																																							if (this.ticks >= this.waitTicks)
																																																																																																																																								run();
																																																																																																																																						}
																																																																																																																																					}

																																																																																																																																					private void run() {
																																																																																																																																						{
																																																																																																																																							Entity _ent = entity;
																																																																																																																																							_ent.teleportTo(
																																																																																																																																									((entity.getCapability(
																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																											null)
																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																									((entity.getCapability(
																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																											null)
																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																									((entity.getCapability(
																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																											null)
																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																								_serverPlayer.connection
																																																																																																																																										.teleport(
																																																																																																																																												((entity.getCapability(
																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																														null)
																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																												((entity.getCapability(
																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																														null)
																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																												((entity.getCapability(
																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																														null)
																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																												_ent.getYRot(),
																																																																																																																																												_ent.getXRot());
																																																																																																																																						}
																																																																																																																																						new Object() {
																																																																																																																																							private int ticks = 0;
																																																																																																																																							private float waitTicks;
																																																																																																																																							private LevelAccessor world;

																																																																																																																																							public void start(
																																																																																																																																									LevelAccessor world,
																																																																																																																																									int waitTicks) {
																																																																																																																																								this.waitTicks = waitTicks;
																																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																																										.register(
																																																																																																																																												this);
																																																																																																																																								this.world = world;
																																																																																																																																							}

																																																																																																																																							@SubscribeEvent
																																																																																																																																							public void tick(
																																																																																																																																									TickEvent.ServerTickEvent event) {
																																																																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																																																																									this.ticks += 1;
																																																																																																																																									if (this.ticks >= this.waitTicks)
																																																																																																																																										run();
																																																																																																																																								}
																																																																																																																																							}

																																																																																																																																							private void run() {
																																																																																																																																								{
																																																																																																																																									Entity _ent = entity;
																																																																																																																																									_ent.teleportTo(
																																																																																																																																											((entity.getCapability(
																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																													null)
																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																											((entity.getCapability(
																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																													null)
																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																											((entity.getCapability(
																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																													null)
																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																										_serverPlayer.connection
																																																																																																																																												.teleport(
																																																																																																																																														((entity.getCapability(
																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																null)
																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																														((entity.getCapability(
																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																null)
																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																														((entity.getCapability(
																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																null)
																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																														_ent.getYRot(),
																																																																																																																																														_ent.getXRot());
																																																																																																																																								}
																																																																																																																																								new Object() {
																																																																																																																																									private int ticks = 0;
																																																																																																																																									private float waitTicks;
																																																																																																																																									private LevelAccessor world;

																																																																																																																																									public void start(
																																																																																																																																											LevelAccessor world,
																																																																																																																																											int waitTicks) {
																																																																																																																																										this.waitTicks = waitTicks;
																																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																																												.register(
																																																																																																																																														this);
																																																																																																																																										this.world = world;
																																																																																																																																									}

																																																																																																																																									@SubscribeEvent
																																																																																																																																									public void tick(
																																																																																																																																											TickEvent.ServerTickEvent event) {
																																																																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																																																																											this.ticks += 1;
																																																																																																																																											if (this.ticks >= this.waitTicks)
																																																																																																																																												run();
																																																																																																																																										}
																																																																																																																																									}

																																																																																																																																									private void run() {
																																																																																																																																										{
																																																																																																																																											Entity _ent = entity;
																																																																																																																																											_ent.teleportTo(
																																																																																																																																													((entity.getCapability(
																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																															null)
																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																													((entity.getCapability(
																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																															null)
																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																													((entity.getCapability(
																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																															null)
																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																												_serverPlayer.connection
																																																																																																																																														.teleport(
																																																																																																																																																((entity.getCapability(
																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																		null)
																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																((entity.getCapability(
																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																		null)
																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																((entity.getCapability(
																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																		null)
																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																_ent.getYRot(),
																																																																																																																																																_ent.getXRot());
																																																																																																																																										}
																																																																																																																																										new Object() {
																																																																																																																																											private int ticks = 0;
																																																																																																																																											private float waitTicks;
																																																																																																																																											private LevelAccessor world;

																																																																																																																																											public void start(
																																																																																																																																													LevelAccessor world,
																																																																																																																																													int waitTicks) {
																																																																																																																																												this.waitTicks = waitTicks;
																																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																																														.register(
																																																																																																																																																this);
																																																																																																																																												this.world = world;
																																																																																																																																											}

																																																																																																																																											@SubscribeEvent
																																																																																																																																											public void tick(
																																																																																																																																													TickEvent.ServerTickEvent event) {
																																																																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																																																																													this.ticks += 1;
																																																																																																																																													if (this.ticks >= this.waitTicks)
																																																																																																																																														run();
																																																																																																																																												}
																																																																																																																																											}

																																																																																																																																											private void run() {
																																																																																																																																												{
																																																																																																																																													Entity _ent = entity;
																																																																																																																																													_ent.teleportTo(
																																																																																																																																															((entity.getCapability(
																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																	null)
																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																															((entity.getCapability(
																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																	null)
																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																															((entity.getCapability(
																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																	null)
																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																														_serverPlayer.connection
																																																																																																																																																.teleport(
																																																																																																																																																		((entity.getCapability(
																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																				null)
																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																		((entity.getCapability(
																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																				null)
																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																		((entity.getCapability(
																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																				null)
																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																		_ent.getYRot(),
																																																																																																																																																		_ent.getXRot());
																																																																																																																																												}
																																																																																																																																												new Object() {
																																																																																																																																													private int ticks = 0;
																																																																																																																																													private float waitTicks;
																																																																																																																																													private LevelAccessor world;

																																																																																																																																													public void start(
																																																																																																																																															LevelAccessor world,
																																																																																																																																															int waitTicks) {
																																																																																																																																														this.waitTicks = waitTicks;
																																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																																.register(
																																																																																																																																																		this);
																																																																																																																																														this.world = world;
																																																																																																																																													}

																																																																																																																																													@SubscribeEvent
																																																																																																																																													public void tick(
																																																																																																																																															TickEvent.ServerTickEvent event) {
																																																																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																																																																															this.ticks += 1;
																																																																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																																																																run();
																																																																																																																																														}
																																																																																																																																													}

																																																																																																																																													private void run() {
																																																																																																																																														{
																																																																																																																																															Entity _ent = entity;
																																																																																																																																															_ent.teleportTo(
																																																																																																																																																	((entity.getCapability(
																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																			null)
																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																	((entity.getCapability(
																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																			null)
																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																	((entity.getCapability(
																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																			null)
																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																_serverPlayer.connection
																																																																																																																																																		.teleport(
																																																																																																																																																				((entity.getCapability(
																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																						null)
																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																				((entity.getCapability(
																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																						null)
																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																				((entity.getCapability(
																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																						null)
																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																				_ent.getYRot(),
																																																																																																																																																				_ent.getXRot());
																																																																																																																																														}
																																																																																																																																														new Object() {
																																																																																																																																															private int ticks = 0;
																																																																																																																																															private float waitTicks;
																																																																																																																																															private LevelAccessor world;

																																																																																																																																															public void start(
																																																																																																																																																	LevelAccessor world,
																																																																																																																																																	int waitTicks) {
																																																																																																																																																this.waitTicks = waitTicks;
																																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																																		.register(
																																																																																																																																																				this);
																																																																																																																																																this.world = world;
																																																																																																																																															}

																																																																																																																																															@SubscribeEvent
																																																																																																																																															public void tick(
																																																																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																	this.ticks += 1;
																																																																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																																																																		run();
																																																																																																																																																}
																																																																																																																																															}

																																																																																																																																															private void run() {
																																																																																																																																																{
																																																																																																																																																	Entity _ent = entity;
																																																																																																																																																	_ent.teleportTo(
																																																																																																																																																			((entity.getCapability(
																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																					null)
																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																			((entity.getCapability(
																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																					null)
																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																			((entity.getCapability(
																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																					null)
																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																		_serverPlayer.connection
																																																																																																																																																				.teleport(
																																																																																																																																																						((entity.getCapability(
																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																								null)
																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																						((entity.getCapability(
																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																								null)
																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																						((entity.getCapability(
																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																								null)
																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																						_ent.getYRot(),
																																																																																																																																																						_ent.getXRot());
																																																																																																																																																}
																																																																																																																																																new Object() {
																																																																																																																																																	private int ticks = 0;
																																																																																																																																																	private float waitTicks;
																																																																																																																																																	private LevelAccessor world;

																																																																																																																																																	public void start(
																																																																																																																																																			LevelAccessor world,
																																																																																																																																																			int waitTicks) {
																																																																																																																																																		this.waitTicks = waitTicks;
																																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																																				.register(
																																																																																																																																																						this);
																																																																																																																																																		this.world = world;
																																																																																																																																																	}

																																																																																																																																																	@SubscribeEvent
																																																																																																																																																	public void tick(
																																																																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																			this.ticks += 1;
																																																																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																																																																				run();
																																																																																																																																																		}
																																																																																																																																																	}

																																																																																																																																																	private void run() {
																																																																																																																																																		{
																																																																																																																																																			Entity _ent = entity;
																																																																																																																																																			_ent.teleportTo(
																																																																																																																																																					((entity.getCapability(
																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																							null)
																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																					((entity.getCapability(
																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																							null)
																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																					((entity.getCapability(
																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																							null)
																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																				_serverPlayer.connection
																																																																																																																																																						.teleport(
																																																																																																																																																								((entity.getCapability(
																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																										null)
																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																								((entity.getCapability(
																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																										null)
																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																								((entity.getCapability(
																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																										null)
																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																								_ent.getYRot(),
																																																																																																																																																								_ent.getXRot());
																																																																																																																																																		}
																																																																																																																																																		new Object() {
																																																																																																																																																			private int ticks = 0;
																																																																																																																																																			private float waitTicks;
																																																																																																																																																			private LevelAccessor world;

																																																																																																																																																			public void start(
																																																																																																																																																					LevelAccessor world,
																																																																																																																																																					int waitTicks) {
																																																																																																																																																				this.waitTicks = waitTicks;
																																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																																						.register(
																																																																																																																																																								this);
																																																																																																																																																				this.world = world;
																																																																																																																																																			}

																																																																																																																																																			@SubscribeEvent
																																																																																																																																																			public void tick(
																																																																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																					this.ticks += 1;
																																																																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																																																																						run();
																																																																																																																																																				}
																																																																																																																																																			}

																																																																																																																																																			private void run() {
																																																																																																																																																				{
																																																																																																																																																					Entity _ent = entity;
																																																																																																																																																					_ent.teleportTo(
																																																																																																																																																							((entity.getCapability(
																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																									null)
																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																							((entity.getCapability(
																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																									null)
																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																							((entity.getCapability(
																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																									null)
																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																						_serverPlayer.connection
																																																																																																																																																								.teleport(
																																																																																																																																																										((entity.getCapability(
																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																												null)
																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																										((entity.getCapability(
																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																												null)
																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																										((entity.getCapability(
																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																												null)
																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																										_ent.getYRot(),
																																																																																																																																																										_ent.getXRot());
																																																																																																																																																				}
																																																																																																																																																				new Object() {
																																																																																																																																																					private int ticks = 0;
																																																																																																																																																					private float waitTicks;
																																																																																																																																																					private LevelAccessor world;

																																																																																																																																																					public void start(
																																																																																																																																																							LevelAccessor world,
																																																																																																																																																							int waitTicks) {
																																																																																																																																																						this.waitTicks = waitTicks;
																																																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																																																								.register(
																																																																																																																																																										this);
																																																																																																																																																						this.world = world;
																																																																																																																																																					}

																																																																																																																																																					@SubscribeEvent
																																																																																																																																																					public void tick(
																																																																																																																																																							TickEvent.ServerTickEvent event) {
																																																																																																																																																						if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																							this.ticks += 1;
																																																																																																																																																							if (this.ticks >= this.waitTicks)
																																																																																																																																																								run();
																																																																																																																																																						}
																																																																																																																																																					}

																																																																																																																																																					private void run() {
																																																																																																																																																						{
																																																																																																																																																							Entity _ent = entity;
																																																																																																																																																							_ent.teleportTo(
																																																																																																																																																									((entity.getCapability(
																																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																											null)
																																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																									((entity.getCapability(
																																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																											null)
																																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																									((entity.getCapability(
																																																																																																																																																											HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																											null)
																																																																																																																																																											.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																								_serverPlayer.connection
																																																																																																																																																										.teleport(
																																																																																																																																																												((entity.getCapability(
																																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																														null)
																																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																												((entity.getCapability(
																																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																														null)
																																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																												((entity.getCapability(
																																																																																																																																																														HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																														null)
																																																																																																																																																														.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																												_ent.getYRot(),
																																																																																																																																																												_ent.getXRot());
																																																																																																																																																						}
																																																																																																																																																						new Object() {
																																																																																																																																																							private int ticks = 0;
																																																																																																																																																							private float waitTicks;
																																																																																																																																																							private LevelAccessor world;

																																																																																																																																																							public void start(
																																																																																																																																																									LevelAccessor world,
																																																																																																																																																									int waitTicks) {
																																																																																																																																																								this.waitTicks = waitTicks;
																																																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																																																										.register(
																																																																																																																																																												this);
																																																																																																																																																								this.world = world;
																																																																																																																																																							}

																																																																																																																																																							@SubscribeEvent
																																																																																																																																																							public void tick(
																																																																																																																																																									TickEvent.ServerTickEvent event) {
																																																																																																																																																								if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																									this.ticks += 1;
																																																																																																																																																									if (this.ticks >= this.waitTicks)
																																																																																																																																																										run();
																																																																																																																																																								}
																																																																																																																																																							}

																																																																																																																																																							private void run() {
																																																																																																																																																								{
																																																																																																																																																									Entity _ent = entity;
																																																																																																																																																									_ent.teleportTo(
																																																																																																																																																											((entity.getCapability(
																																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																													null)
																																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																											((entity.getCapability(
																																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																													null)
																																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																											((entity.getCapability(
																																																																																																																																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																													null)
																																																																																																																																																													.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																										_serverPlayer.connection
																																																																																																																																																												.teleport(
																																																																																																																																																														((entity.getCapability(
																																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																null)
																																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																														((entity.getCapability(
																																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																null)
																																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																														((entity.getCapability(
																																																																																																																																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																null)
																																																																																																																																																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																														_ent.getYRot(),
																																																																																																																																																														_ent.getXRot());
																																																																																																																																																								}
																																																																																																																																																								new Object() {
																																																																																																																																																									private int ticks = 0;
																																																																																																																																																									private float waitTicks;
																																																																																																																																																									private LevelAccessor world;

																																																																																																																																																									public void start(
																																																																																																																																																											LevelAccessor world,
																																																																																																																																																											int waitTicks) {
																																																																																																																																																										this.waitTicks = waitTicks;
																																																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																																																												.register(
																																																																																																																																																														this);
																																																																																																																																																										this.world = world;
																																																																																																																																																									}

																																																																																																																																																									@SubscribeEvent
																																																																																																																																																									public void tick(
																																																																																																																																																											TickEvent.ServerTickEvent event) {
																																																																																																																																																										if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																											this.ticks += 1;
																																																																																																																																																											if (this.ticks >= this.waitTicks)
																																																																																																																																																												run();
																																																																																																																																																										}
																																																																																																																																																									}

																																																																																																																																																									private void run() {
																																																																																																																																																										{
																																																																																																																																																											Entity _ent = entity;
																																																																																																																																																											_ent.teleportTo(
																																																																																																																																																													((entity.getCapability(
																																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																															null)
																																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																													((entity.getCapability(
																																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																															null)
																																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																													((entity.getCapability(
																																																																																																																																																															HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																															null)
																																																																																																																																																															.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																												_serverPlayer.connection
																																																																																																																																																														.teleport(
																																																																																																																																																																((entity.getCapability(
																																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																		null)
																																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																((entity.getCapability(
																																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																		null)
																																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																((entity.getCapability(
																																																																																																																																																																		HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																		null)
																																																																																																																																																																		.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																_ent.getYRot(),
																																																																																																																																																																_ent.getXRot());
																																																																																																																																																										}
																																																																																																																																																										new Object() {
																																																																																																																																																											private int ticks = 0;
																																																																																																																																																											private float waitTicks;
																																																																																																																																																											private LevelAccessor world;

																																																																																																																																																											public void start(
																																																																																																																																																													LevelAccessor world,
																																																																																																																																																													int waitTicks) {
																																																																																																																																																												this.waitTicks = waitTicks;
																																																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																																																														.register(
																																																																																																																																																																this);
																																																																																																																																																												this.world = world;
																																																																																																																																																											}

																																																																																																																																																											@SubscribeEvent
																																																																																																																																																											public void tick(
																																																																																																																																																													TickEvent.ServerTickEvent event) {
																																																																																																																																																												if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																													this.ticks += 1;
																																																																																																																																																													if (this.ticks >= this.waitTicks)
																																																																																																																																																														run();
																																																																																																																																																												}
																																																																																																																																																											}

																																																																																																																																																											private void run() {
																																																																																																																																																												{
																																																																																																																																																													Entity _ent = entity;
																																																																																																																																																													_ent.teleportTo(
																																																																																																																																																															((entity.getCapability(
																																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																	null)
																																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																															((entity.getCapability(
																																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																	null)
																																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																															((entity.getCapability(
																																																																																																																																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																	null)
																																																																																																																																																																	.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																														_serverPlayer.connection
																																																																																																																																																																.teleport(
																																																																																																																																																																		((entity.getCapability(
																																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																				null)
																																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																		((entity.getCapability(
																																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																				null)
																																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																		((entity.getCapability(
																																																																																																																																																																				HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																				null)
																																																																																																																																																																				.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																		_ent.getYRot(),
																																																																																																																																																																		_ent.getXRot());
																																																																																																																																																												}
																																																																																																																																																												new Object() {
																																																																																																																																																													private int ticks = 0;
																																																																																																																																																													private float waitTicks;
																																																																																																																																																													private LevelAccessor world;

																																																																																																																																																													public void start(
																																																																																																																																																															LevelAccessor world,
																																																																																																																																																															int waitTicks) {
																																																																																																																																																														this.waitTicks = waitTicks;
																																																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																																																.register(
																																																																																																																																																																		this);
																																																																																																																																																														this.world = world;
																																																																																																																																																													}

																																																																																																																																																													@SubscribeEvent
																																																																																																																																																													public void tick(
																																																																																																																																																															TickEvent.ServerTickEvent event) {
																																																																																																																																																														if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																															this.ticks += 1;
																																																																																																																																																															if (this.ticks >= this.waitTicks)
																																																																																																																																																																run();
																																																																																																																																																														}
																																																																																																																																																													}

																																																																																																																																																													private void run() {
																																																																																																																																																														{
																																																																																																																																																															Entity _ent = entity;
																																																																																																																																																															_ent.teleportTo(
																																																																																																																																																																	((entity.getCapability(
																																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																			null)
																																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																	((entity.getCapability(
																																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																			null)
																																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																	((entity.getCapability(
																																																																																																																																																																			HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																			null)
																																																																																																																																																																			.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																																_serverPlayer.connection
																																																																																																																																																																		.teleport(
																																																																																																																																																																				((entity.getCapability(
																																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																						null)
																																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																				((entity.getCapability(
																																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																						null)
																																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																				((entity.getCapability(
																																																																																																																																																																						HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																						null)
																																																																																																																																																																						.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																				_ent.getYRot(),
																																																																																																																																																																				_ent.getXRot());
																																																																																																																																																														}
																																																																																																																																																														new Object() {
																																																																																																																																																															private int ticks = 0;
																																																																																																																																																															private float waitTicks;
																																																																																																																																																															private LevelAccessor world;

																																																																																																																																																															public void start(
																																																																																																																																																																	LevelAccessor world,
																																																																																																																																																																	int waitTicks) {
																																																																																																																																																																this.waitTicks = waitTicks;
																																																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																																																		.register(
																																																																																																																																																																				this);
																																																																																																																																																																this.world = world;
																																																																																																																																																															}

																																																																																																																																																															@SubscribeEvent
																																																																																																																																																															public void tick(
																																																																																																																																																																	TickEvent.ServerTickEvent event) {
																																																																																																																																																																if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																																	this.ticks += 1;
																																																																																																																																																																	if (this.ticks >= this.waitTicks)
																																																																																																																																																																		run();
																																																																																																																																																																}
																																																																																																																																																															}

																																																																																																																																																															private void run() {
																																																																																																																																																																{
																																																																																																																																																																	Entity _ent = entity;
																																																																																																																																																																	_ent.teleportTo(
																																																																																																																																																																			((entity.getCapability(
																																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																					null)
																																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																			((entity.getCapability(
																																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																					null)
																																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																			((entity.getCapability(
																																																																																																																																																																					HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																					null)
																																																																																																																																																																					.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																																		_serverPlayer.connection
																																																																																																																																																																				.teleport(
																																																																																																																																																																						((entity.getCapability(
																																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																								null)
																																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																						((entity.getCapability(
																																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																								null)
																																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																						((entity.getCapability(
																																																																																																																																																																								HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																								null)
																																																																																																																																																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																						_ent.getYRot(),
																																																																																																																																																																						_ent.getXRot());
																																																																																																																																																																}
																																																																																																																																																																new Object() {
																																																																																																																																																																	private int ticks = 0;
																																																																																																																																																																	private float waitTicks;
																																																																																																																																																																	private LevelAccessor world;

																																																																																																																																																																	public void start(
																																																																																																																																																																			LevelAccessor world,
																																																																																																																																																																			int waitTicks) {
																																																																																																																																																																		this.waitTicks = waitTicks;
																																																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																																																				.register(
																																																																																																																																																																						this);
																																																																																																																																																																		this.world = world;
																																																																																																																																																																	}

																																																																																																																																																																	@SubscribeEvent
																																																																																																																																																																	public void tick(
																																																																																																																																																																			TickEvent.ServerTickEvent event) {
																																																																																																																																																																		if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																																			this.ticks += 1;
																																																																																																																																																																			if (this.ticks >= this.waitTicks)
																																																																																																																																																																				run();
																																																																																																																																																																		}
																																																																																																																																																																	}

																																																																																																																																																																	private void run() {
																																																																																																																																																																		{
																																																																																																																																																																			Entity _ent = entity;
																																																																																																																																																																			_ent.teleportTo(
																																																																																																																																																																					((entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																					((entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																					((entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																																				_serverPlayer.connection
																																																																																																																																																																						.teleport(
																																																																																																																																																																								((entity.getCapability(
																																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																										null)
																																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																								((entity.getCapability(
																																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																										null)
																																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																								((entity.getCapability(
																																																																																																																																																																										HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																										null)
																																																																																																																																																																										.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																								_ent.getYRot(),
																																																																																																																																																																								_ent.getXRot());
																																																																																																																																																																		}
																																																																																																																																																																		new Object() {
																																																																																																																																																																			private int ticks = 0;
																																																																																																																																																																			private float waitTicks;
																																																																																																																																																																			private LevelAccessor world;

																																																																																																																																																																			public void start(
																																																																																																																																																																					LevelAccessor world,
																																																																																																																																																																					int waitTicks) {
																																																																																																																																																																				this.waitTicks = waitTicks;
																																																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																																																						.register(
																																																																																																																																																																								this);
																																																																																																																																																																				this.world = world;
																																																																																																																																																																			}

																																																																																																																																																																			@SubscribeEvent
																																																																																																																																																																			public void tick(
																																																																																																																																																																					TickEvent.ServerTickEvent event) {
																																																																																																																																																																				if (event.phase == TickEvent.Phase.END) {
																																																																																																																																																																					this.ticks += 1;
																																																																																																																																																																					if (this.ticks >= this.waitTicks)
																																																																																																																																																																						run();
																																																																																																																																																																				}
																																																																																																																																																																			}

																																																																																																																																																																			private void run() {
																																																																																																																																																																				{
																																																																																																																																																																					Entity _ent = entity;
																																																																																																																																																																					_ent.teleportTo(
																																																																																																																																																																							((entity.getCapability(
																																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																									null)
																																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																							((entity.getCapability(
																																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																									null)
																																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																							((entity.getCapability(
																																																																																																																																																																									HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																									null)
																																																																																																																																																																									.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz));
																																																																																																																																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																																																																																																						_serverPlayer.connection
																																																																																																																																																																								.teleport(
																																																																																																																																																																										((entity.getCapability(
																																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																												null)
																																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
																																																																																																																																																																										((entity.getCapability(
																																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																												null)
																																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
																																																																																																																																																																										((entity.getCapability(
																																																																																																																																																																												HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																												null)
																																																																																																																																																																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz),
																																																																																																																																																																										_ent.getYRot(),
																																																																																																																																																																										_ent.getXRot());
																																																																																																																																																																				}
																																																																																																																																																																				{
																																																																																																																																																																					double _setval = 0;
																																																																																																																																																																					entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.ifPresent(
																																																																																																																																																																									capability -> {
																																																																																																																																																																										capability.lnx = _setval;
																																																																																																																																																																										capability
																																																																																																																																																																												.syncPlayerVariables(
																																																																																																																																																																														entity);
																																																																																																																																																																									});
																																																																																																																																																																				}
																																																																																																																																																																				{
																																																																																																																																																																					double _setval = 0;
																																																																																																																																																																					entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.ifPresent(
																																																																																																																																																																									capability -> {
																																																																																																																																																																										capability.lny = _setval;
																																																																																																																																																																										capability
																																																																																																																																																																												.syncPlayerVariables(
																																																																																																																																																																														entity);
																																																																																																																																																																									});
																																																																																																																																																																				}
																																																																																																																																																																				{
																																																																																																																																																																					double _setval = 0;
																																																																																																																																																																					entity.getCapability(
																																																																																																																																																																							HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																							null)
																																																																																																																																																																							.ifPresent(
																																																																																																																																																																									capability -> {
																																																																																																																																																																										capability.lnz = _setval;
																																																																																																																																																																										capability
																																																																																																																																																																												.syncPlayerVariables(
																																																																																																																																																																														entity);
																																																																																																																																																																									});
																																																																																																																																																																				}
																																																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																																																						.unregister(
																																																																																																																																																																								this);
																																																																																																																																																																			}
																																																																																																																																																																		}.start(world,
																																																																																																																																																																				1);
																																																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																																																				.unregister(
																																																																																																																																																																						this);
																																																																																																																																																																	}
																																																																																																																																																																}.start(world,
																																																																																																																																																																		1);
																																																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																																																		.unregister(
																																																																																																																																																																				this);
																																																																																																																																																															}
																																																																																																																																																														}.start(world,
																																																																																																																																																																1);
																																																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																																																.unregister(
																																																																																																																																																																		this);
																																																																																																																																																													}
																																																																																																																																																												}.start(world,
																																																																																																																																																														1);
																																																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																																																														.unregister(
																																																																																																																																																																this);
																																																																																																																																																											}
																																																																																																																																																										}.start(world,
																																																																																																																																																												1);
																																																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																																																												.unregister(
																																																																																																																																																														this);
																																																																																																																																																									}
																																																																																																																																																								}.start(world,
																																																																																																																																																										1);
																																																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																																																										.unregister(
																																																																																																																																																												this);
																																																																																																																																																							}
																																																																																																																																																						}.start(world,
																																																																																																																																																								1);
																																																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																																																								.unregister(
																																																																																																																																																										this);
																																																																																																																																																					}
																																																																																																																																																				}.start(world,
																																																																																																																																																						1);
																																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																																						.unregister(
																																																																																																																																																								this);
																																																																																																																																																			}
																																																																																																																																																		}.start(world,
																																																																																																																																																				1);
																																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																																				.unregister(
																																																																																																																																																						this);
																																																																																																																																																	}
																																																																																																																																																}.start(world,
																																																																																																																																																		1);
																																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																																		.unregister(
																																																																																																																																																				this);
																																																																																																																																															}
																																																																																																																																														}.start(world,
																																																																																																																																																1);
																																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																																.unregister(
																																																																																																																																																		this);
																																																																																																																																													}
																																																																																																																																												}.start(world,
																																																																																																																																														1);
																																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																																														.unregister(
																																																																																																																																																this);
																																																																																																																																											}
																																																																																																																																										}.start(world,
																																																																																																																																												1);
																																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																																												.unregister(
																																																																																																																																														this);
																																																																																																																																									}
																																																																																																																																								}.start(world,
																																																																																																																																										1);
																																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																																										.unregister(
																																																																																																																																												this);
																																																																																																																																							}
																																																																																																																																						}.start(world,
																																																																																																																																								1);
																																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																																								.unregister(
																																																																																																																																										this);
																																																																																																																																					}
																																																																																																																																				}.start(world,
																																																																																																																																						1);
																																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																																						.unregister(
																																																																																																																																								this);
																																																																																																																																			}
																																																																																																																																		}.start(world,
																																																																																																																																				1);
																																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																																				.unregister(
																																																																																																																																						this);
																																																																																																																																	}
																																																																																																																																}.start(world,
																																																																																																																																		1);
																																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																																		.unregister(
																																																																																																																																				this);
																																																																																																																															}
																																																																																																																														}.start(world,
																																																																																																																																1);
																																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																																.unregister(
																																																																																																																																		this);
																																																																																																																													}
																																																																																																																												}.start(world,
																																																																																																																														1);
																																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																																														.unregister(
																																																																																																																																this);
																																																																																																																											}
																																																																																																																										}.start(world,
																																																																																																																												1);
																																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																																												.unregister(
																																																																																																																														this);
																																																																																																																									}
																																																																																																																								}.start(world,
																																																																																																																										1);
																																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																																										.unregister(
																																																																																																																												this);
																																																																																																																							}
																																																																																																																						}.start(world,
																																																																																																																								1);
																																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																																								.unregister(
																																																																																																																										this);
																																																																																																																					}
																																																																																																																				}.start(world,
																																																																																																																						1);
																																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																																						.unregister(
																																																																																																																								this);
																																																																																																																			}
																																																																																																																		}.start(world,
																																																																																																																				1);
																																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																																				.unregister(
																																																																																																																						this);
																																																																																																																	}
																																																																																																																}.start(world,
																																																																																																																		1);
																																																																																																																MinecraftForge.EVENT_BUS
																																																																																																																		.unregister(
																																																																																																																				this);
																																																																																																															}
																																																																																																														}.start(world,
																																																																																																																1);
																																																																																																														MinecraftForge.EVENT_BUS
																																																																																																																.unregister(
																																																																																																																		this);
																																																																																																													}
																																																																																																												}.start(world,
																																																																																																														1);
																																																																																																												MinecraftForge.EVENT_BUS
																																																																																																														.unregister(
																																																																																																																this);
																																																																																																											}
																																																																																																										}.start(world,
																																																																																																												1);
																																																																																																										MinecraftForge.EVENT_BUS
																																																																																																												.unregister(
																																																																																																														this);
																																																																																																									}
																																																																																																								}.start(world,
																																																																																																										1);
																																																																																																								MinecraftForge.EVENT_BUS
																																																																																																										.unregister(
																																																																																																												this);
																																																																																																							}
																																																																																																						}.start(world,
																																																																																																								1);
																																																																																																						MinecraftForge.EVENT_BUS
																																																																																																								.unregister(
																																																																																																										this);
																																																																																																					}
																																																																																																				}.start(world,
																																																																																																						1);
																																																																																																				MinecraftForge.EVENT_BUS
																																																																																																						.unregister(
																																																																																																								this);
																																																																																																			}
																																																																																																		}.start(world,
																																																																																																				1);
																																																																																																		MinecraftForge.EVENT_BUS
																																																																																																				.unregister(
																																																																																																						this);
																																																																																																	}
																																																																																																}.start(world,
																																																																																																		1);
																																																																																																MinecraftForge.EVENT_BUS
																																																																																																		.unregister(
																																																																																																				this);
																																																																																															}
																																																																																														}.start(world,
																																																																																																1);
																																																																																														MinecraftForge.EVENT_BUS
																																																																																																.unregister(
																																																																																																		this);
																																																																																													}
																																																																																												}.start(world,
																																																																																														1);
																																																																																												MinecraftForge.EVENT_BUS
																																																																																														.unregister(
																																																																																																this);
																																																																																											}
																																																																																										}.start(world,
																																																																																												1);
																																																																																										MinecraftForge.EVENT_BUS
																																																																																												.unregister(
																																																																																														this);
																																																																																									}
																																																																																								}.start(world,
																																																																																										1);
																																																																																								MinecraftForge.EVENT_BUS
																																																																																										.unregister(
																																																																																												this);
																																																																																							}
																																																																																						}.start(world,
																																																																																								1);
																																																																																						MinecraftForge.EVENT_BUS
																																																																																								.unregister(
																																																																																										this);
																																																																																					}
																																																																																				}.start(world,
																																																																																						1);
																																																																																				MinecraftForge.EVENT_BUS
																																																																																						.unregister(
																																																																																								this);
																																																																																			}
																																																																																		}.start(world,
																																																																																				1);
																																																																																		MinecraftForge.EVENT_BUS
																																																																																				.unregister(
																																																																																						this);
																																																																																	}
																																																																																}.start(world,
																																																																																		1);
																																																																																MinecraftForge.EVENT_BUS
																																																																																		.unregister(
																																																																																				this);
																																																																															}
																																																																														}.start(world,
																																																																																1);
																																																																														MinecraftForge.EVENT_BUS
																																																																																.unregister(
																																																																																		this);
																																																																													}
																																																																												}.start(world,
																																																																														1);
																																																																												MinecraftForge.EVENT_BUS
																																																																														.unregister(
																																																																																this);
																																																																											}
																																																																										}.start(world,
																																																																												1);
																																																																										MinecraftForge.EVENT_BUS
																																																																												.unregister(
																																																																														this);
																																																																									}
																																																																								}.start(world,
																																																																										1);
																																																																								MinecraftForge.EVENT_BUS
																																																																										.unregister(
																																																																												this);
																																																																							}
																																																																						}.start(world,
																																																																								1);
																																																																						MinecraftForge.EVENT_BUS
																																																																								.unregister(
																																																																										this);
																																																																					}
																																																																				}.start(world,
																																																																						1);
																																																																				MinecraftForge.EVENT_BUS
																																																																						.unregister(
																																																																								this);
																																																																			}
																																																																		}.start(world,
																																																																				1);
																																																																		MinecraftForge.EVENT_BUS
																																																																				.unregister(
																																																																						this);
																																																																	}
																																																																}.start(world,
																																																																		1);
																																																																MinecraftForge.EVENT_BUS
																																																																		.unregister(
																																																																				this);
																																																															}
																																																														}.start(world,
																																																																1);
																																																														MinecraftForge.EVENT_BUS
																																																																.unregister(
																																																																		this);
																																																													}
																																																												}.start(world,
																																																														1);
																																																												MinecraftForge.EVENT_BUS
																																																														.unregister(
																																																																this);
																																																											}
																																																										}.start(world, 1);
																																																										MinecraftForge.EVENT_BUS
																																																												.unregister(
																																																														this);
																																																									}
																																																								}.start(world, 1);
																																																								MinecraftForge.EVENT_BUS
																																																										.unregister(this);
																																																							}
																																																						}.start(world, 1);
																																																						MinecraftForge.EVENT_BUS
																																																								.unregister(this);
																																																					}
																																																				}.start(world, 1);
																																																				MinecraftForge.EVENT_BUS.unregister(this);
																																																			}
																																																		}.start(world, 1);
																																																		MinecraftForge.EVENT_BUS.unregister(this);
																																																	}
																																																}.start(world, 1);
																																																MinecraftForge.EVENT_BUS.unregister(this);
																																															}
																																														}.start(world, 1);
																																														MinecraftForge.EVENT_BUS.unregister(this);
																																													}
																																												}.start(world, 1);
																																												MinecraftForge.EVENT_BUS.unregister(this);
																																											}
																																										}.start(world, 1);
																																										MinecraftForge.EVENT_BUS.unregister(this);
																																									}
																																								}.start(world, 1);
																																								MinecraftForge.EVENT_BUS.unregister(this);
																																							}
																																						}.start(world, 1);
																																						MinecraftForge.EVENT_BUS.unregister(this);
																																					}
																																				}.start(world, 1);
																																				MinecraftForge.EVENT_BUS.unregister(this);
																																			}
																																		}.start(world, 1);
																																		MinecraftForge.EVENT_BUS.unregister(this);
																																	}
																																}.start(world, 1);
																																MinecraftForge.EVENT_BUS.unregister(this);
																															}
																														}.start(world, 1);
																														MinecraftForge.EVENT_BUS.unregister(this);
																													}
																												}.start(world, 1);
																												MinecraftForge.EVENT_BUS.unregister(this);
																											}
																										}.start(world, 1);
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, 1);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, 1);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, 1);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 1);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 1);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 1);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 1);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 1);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 1);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 1);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1);
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 85);
				{
					double _setval = 85;
					sourceentity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.meleecishu = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
