package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.SurpriseSpringshootingEntity;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

import java.util.Random;

public class SpellcardSurpriseSpringDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 7) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u4F60\u5BA3\u8A00\u4E86 \u6625\u7B26\u300CSurprise Spring\u300D"), (false));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 1));
			world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.SPELLCARDSC_2.get()), x, y, z, 0, 0, 0);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.SPELLCARD_SURPRISE_SPRING.get(), 300);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
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
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
						}
					}
					for (int index0 = 0; index0 < (int) (32); index0++) {
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
							}.getArrow(projectileLevel, entity, 2, 0);
							_entityToSpawn.setPos(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
							_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
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
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
								}
							}
							for (int index1 = 0; index1 < (int) (32); index1++) {
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
									}.getArrow(projectileLevel, entity, 2, 0);
									_entityToSpawn.setPos(
											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX()),
											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY()),
											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()));
									_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
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
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
										}
									}
									for (int index2 = 0; index2 < (int) (32); index2++) {
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
											}.getArrow(projectileLevel, entity, 2, 0);
											_entityToSpawn.setPos(
													(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()));
											_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
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
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
												}
											}
											for (int index3 = 0; index3 < (int) (32); index3++) {
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
													}.getArrow(projectileLevel, entity, 2, 0);
													_entityToSpawn.setPos(
															(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()));
													_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
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
															_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
														}
													}
													for (int index4 = 0; index4 < (int) (32); index4++) {
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
															}.getArrow(projectileLevel, entity, 2, 0);
															_entityToSpawn.setPos(
																	(entity.level
																			.clip(new ClipContext(
																					entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level.clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level.clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ()));
															_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
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
																	_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
																}
															}
															for (int index5 = 0; index5 < (int) (32); index5++) {
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
																	}.getArrow(projectileLevel, entity, 2, 0);
																	_entityToSpawn.setPos(
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																	_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																	projectileLevel.addFreshEntity(_entityToSpawn);
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
																			_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
																		} else {
																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
																		}
																	}
																	for (int index6 = 0; index6 < (int) (32); index6++) {
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
																			}.getArrow(projectileLevel, entity, 2, 0);
																			_entityToSpawn.setPos(
																					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																			_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																			projectileLevel.addFreshEntity(_entityToSpawn);
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
																					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1);
																				} else {
																					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
																				}
																			}
																			for (int index7 = 0; index7 < (int) (32); index7++) {
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
																					}.getArrow(projectileLevel, entity, 2, 0);
																					_entityToSpawn.setPos(
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																					_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																					projectileLevel.addFreshEntity(_entityToSpawn);
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
																							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")),
																									SoundSource.PLAYERS, 7, 1);
																						} else {
																							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1, false);
																						}
																					}
																					for (int index8 = 0; index8 < (int) (32); index8++) {
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
																							}.getArrow(projectileLevel, entity, 2, 0);
																							_entityToSpawn.setPos(
																									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																							_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																							projectileLevel.addFreshEntity(_entityToSpawn);
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
																									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")),
																											SoundSource.PLAYERS, 7, 1);
																								} else {
																									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 7, 1,
																											false);
																								}
																							}
																							for (int index9 = 0; index9 < (int) (32); index9++) {
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
																									}.getArrow(projectileLevel, entity, 2, 0);
																									_entityToSpawn.setPos(
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(23)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																									_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																									projectileLevel.addFreshEntity(_entityToSpawn);
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
																											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")),
																													SoundSource.PLAYERS, 7, 1);
																										} else {
																											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")),
																													SoundSource.PLAYERS, 7, 1, false);
																										}
																									}
																									{
																										Entity _shootFrom = entity;
																										Level projectileLevel = _shootFrom.level;
																										if (!projectileLevel.isClientSide()) {
																											Projectile _entityToSpawn = new Object() {
																												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																													AbstractArrow entityToSpawn = new SurpriseSpringshootingEntity(HikariNoSanyouseiModEntities.SURPRISE_SPRINGSHOOTING.get(), level);
																													entityToSpawn.setOwner(shooter);
																													entityToSpawn.setBaseDamage(damage);
																													entityToSpawn.setKnockback(knockback);
																													entityToSpawn.setSilent(true);
																													entityToSpawn.setCritArrow(true);
																													return entityToSpawn;
																												}
																											}.getArrow(projectileLevel, entity, 1, 0);
																											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
																											projectileLevel.addFreshEntity(_entityToSpawn);
																										}
																									}
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, 30);
																							MinecraftForge.EVENT_BUS.unregister(this);
																						}
																					}.start(world, 10);
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, 10);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, 10);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, 10);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 10);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 10);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 10);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 10);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 10);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5F53\u524D\u5E76\u6CA1\u6709\u4F7F\u7528\u8389\u8389\u970D\u74E6\u7279\u3002"), (false));
		}
	}
}
