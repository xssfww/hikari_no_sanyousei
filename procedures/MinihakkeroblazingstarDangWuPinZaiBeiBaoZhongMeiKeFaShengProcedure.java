package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class MinihakkeroblazingstarDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).spellcard == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("time");
				if (_so == null)
					_so = _sc.addObjective("time", ObjectiveCriteria.DUMMY, new TextComponent("time"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
		} else {
			entity.setDeltaMovement(new Vec3(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx),
					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny),
					((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz)));
			{
				final Vec3 _center = new Vec3(
						(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									_ent.getYRot(), _ent.getXRot());
					}
					entity.hurt(DamageSource.MAGIC, (float) 0.3);
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
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
											if (world instanceof Level _level && !_level.isClientSide())
												_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
													if (entity instanceof LivingEntity _entity)
														_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
													if (world instanceof Level _level && !_level.isClientSide())
														_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
															if (entity instanceof LivingEntity _entity)
																_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
															if (world instanceof Level _level && !_level.isClientSide())
																_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																	if (entity instanceof LivingEntity _entity)
																		_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																	if (world instanceof Level _level && !_level.isClientSide())
																		_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																			if (entity instanceof LivingEntity _entity)
																				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																			if (world instanceof Level _level && !_level.isClientSide())
																				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																					if (entity instanceof LivingEntity _entity)
																						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																					if (world instanceof Level _level && !_level.isClientSide())
																						_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																							if (entity instanceof LivingEntity _entity)
																								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																							if (world instanceof Level _level && !_level.isClientSide())
																								_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																									if (entity instanceof LivingEntity _entity)
																										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																									if (world instanceof Level _level && !_level.isClientSide())
																										_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																											if (entity instanceof LivingEntity _entity)
																												_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																											if (world instanceof Level _level && !_level.isClientSide())
																												_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																													if (entity instanceof LivingEntity _entity)
																														_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																													if (world instanceof Level _level && !_level.isClientSide())
																														_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																															if (entity instanceof LivingEntity _entity)
																																_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																															if (world instanceof Level _level && !_level.isClientSide())
																																_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																	if (entity instanceof LivingEntity _entity)
																																		_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																																	if (world instanceof Level _level && !_level.isClientSide())
																																		_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																			if (entity instanceof LivingEntity _entity)
																																				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																																			if (world instanceof Level _level && !_level.isClientSide())
																																				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																					if (entity instanceof LivingEntity _entity)
																																						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																																					if (world instanceof Level _level && !_level.isClientSide())
																																						_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																							if (entity instanceof LivingEntity _entity)
																																								_entity.addEffect(
																																										new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																																							if (world instanceof Level _level && !_level.isClientSide())
																																								_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																									if (entity instanceof LivingEntity _entity)
																																										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5,
																																												(false), (false)));
																																									if (world instanceof Level _level && !_level.isClientSide())
																																										_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																											if (entity instanceof LivingEntity _entity)
																																												_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60,
																																														5, (false), (false)));
																																											if (world instanceof Level _level && !_level.isClientSide())
																																												_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																													if (entity instanceof LivingEntity _entity)
																																														_entity.addEffect(new MobEffectInstance(
																																																MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
																																													if (world instanceof Level _level && !_level.isClientSide())
																																														_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
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
																																															if (entity instanceof LivingEntity _entity)
																																																_entity.addEffect(new MobEffectInstance(
																																																		MobEffects.DAMAGE_RESISTANCE, 60, 5, (false),
																																																		(false)));
																																															if (world instanceof Level _level && !_level.isClientSide())
																																																_level.explode(null, x, y, z, 4,
																																																		Explosion.BlockInteraction.NONE);
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
																																																	if (entity instanceof LivingEntity _entity)
																																																		_entity.addEffect(new MobEffectInstance(
																																																				MobEffects.DAMAGE_RESISTANCE, 60, 5,
																																																				(false), (false)));
																																																	if (world instanceof Level _level
																																																			&& !_level.isClientSide())
																																																		_level.explode(null, x, y, z, 4,
																																																				Explosion.BlockInteraction.NONE);
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
																																																			if (entity instanceof LivingEntity _entity)
																																																				_entity.addEffect(new MobEffectInstance(
																																																						MobEffects.DAMAGE_RESISTANCE, 60,
																																																						5, (false), (false)));
																																																			if (world instanceof Level _level
																																																					&& !_level.isClientSide())
																																																				_level.explode(null, x, y, z, 4,
																																																						Explosion.BlockInteraction.NONE);
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
																																																					if (entity instanceof LivingEntity _entity)
																																																						_entity.addEffect(
																																																								new MobEffectInstance(
																																																										MobEffects.DAMAGE_RESISTANCE,
																																																										60, 5, (false),
																																																										(false)));
																																																					if (world instanceof Level _level
																																																							&& !_level.isClientSide())
																																																						_level.explode(null, x, y, z, 4,
																																																								Explosion.BlockInteraction.NONE);
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
																																																							if (entity instanceof LivingEntity _entity)
																																																								_entity.addEffect(
																																																										new MobEffectInstance(
																																																												MobEffects.DAMAGE_RESISTANCE,
																																																												60, 5,
																																																												(false),
																																																												(false)));
																																																							if (world instanceof Level _level
																																																									&& !_level
																																																											.isClientSide())
																																																								_level.explode(null, x, y,
																																																										z, 4,
																																																										Explosion.BlockInteraction.NONE);
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
																																																									if (entity instanceof LivingEntity _entity)
																																																										_entity.addEffect(
																																																												new MobEffectInstance(
																																																														MobEffects.DAMAGE_RESISTANCE,
																																																														60,
																																																														5,
																																																														(false),
																																																														(false)));
																																																									if (world instanceof Level _level
																																																											&& !_level
																																																													.isClientSide())
																																																										_level.explode(
																																																												null, x,
																																																												y, z, 4,
																																																												Explosion.BlockInteraction.NONE);
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
																																																											if (entity instanceof LivingEntity _entity)
																																																												_entity.addEffect(
																																																														new MobEffectInstance(
																																																																MobEffects.DAMAGE_RESISTANCE,
																																																																60,
																																																																5,
																																																																(false),
																																																																(false)));
																																																											if (world instanceof Level _level
																																																													&& !_level
																																																															.isClientSide())
																																																												_level.explode(
																																																														null,
																																																														x,
																																																														y,
																																																														z,
																																																														4,
																																																														Explosion.BlockInteraction.NONE);
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
																																																													if (entity instanceof LivingEntity _entity)
																																																														_entity.addEffect(
																																																																new MobEffectInstance(
																																																																		MobEffects.DAMAGE_RESISTANCE,
																																																																		60,
																																																																		5,
																																																																		(false),
																																																																		(false)));
																																																													if (world instanceof Level _level
																																																															&& !_level
																																																																	.isClientSide())
																																																														_level.explode(
																																																																null,
																																																																x,
																																																																y,
																																																																z,
																																																																4,
																																																																Explosion.BlockInteraction.NONE);
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
																																																															if (entity instanceof LivingEntity _entity)
																																																																_entity.addEffect(
																																																																		new MobEffectInstance(
																																																																				MobEffects.DAMAGE_RESISTANCE,
																																																																				60,
																																																																				5,
																																																																				(false),
																																																																				(false)));
																																																															if (world instanceof Level _level
																																																																	&& !_level
																																																																			.isClientSide())
																																																																_level.explode(
																																																																		null,
																																																																		x,
																																																																		y,
																																																																		z,
																																																																		4,
																																																																		Explosion.BlockInteraction.NONE);
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
																																																																	if (entity instanceof LivingEntity _entity)
																																																																		_entity.addEffect(
																																																																				new MobEffectInstance(
																																																																						MobEffects.DAMAGE_RESISTANCE,
																																																																						60,
																																																																						5,
																																																																						(false),
																																																																						(false)));
																																																																	if (world instanceof Level _level
																																																																			&& !_level
																																																																					.isClientSide())
																																																																		_level.explode(
																																																																				null,
																																																																				x,
																																																																				y,
																																																																				z,
																																																																				4,
																																																																				Explosion.BlockInteraction.NONE);
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
																																																																			if (entity instanceof LivingEntity _entity)
																																																																				_entity.addEffect(
																																																																						new MobEffectInstance(
																																																																								MobEffects.DAMAGE_RESISTANCE,
																																																																								60,
																																																																								5,
																																																																								(false),
																																																																								(false)));
																																																																			if (world instanceof Level _level
																																																																					&& !_level
																																																																							.isClientSide())
																																																																				_level.explode(
																																																																						null,
																																																																						x,
																																																																						y,
																																																																						z,
																																																																						4,
																																																																						Explosion.BlockInteraction.NONE);
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
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("time", entity) == 3) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("time");
					if (_so == null)
						_so = _sc.addObjective("time", ObjectiveCriteria.DUMMY, new TextComponent("time"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, (false), (false)));
				for (int index0 = 0; index0 < (int) (48); index0++) {
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
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
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
}
