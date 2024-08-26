package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;
import java.util.Iterator;

public class RoukankenfengqiaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 6) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					if (entity.isOnGround()) {
						if (entity.isShiftKeyDown() == true) {
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get(), 40);
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
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get()) {
										if (entity instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get());
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
										if (entity instanceof Player _player)
											_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get(), 100);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melle_xuli")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melle_xuli")), SoundSource.PLAYERS, 1, 1, false);
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
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get()) {
													if (entity instanceof LivingEntity _entity) {
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entity instanceof LivingEntity _entity)
														_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 50, 5, (false), (false)));
													if (entity instanceof Player _player)
														_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get(), 100);
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
															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get()) {
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
																	if (world instanceof Level _level) {
																		if (!_level.isClientSide()) {
																			_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:blade")),
																					SoundSource.PLAYERS, 1, 1);
																		} else {
																			_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:blade")),
																					SoundSource.PLAYERS, 1, 1, false);
																		}
																	}
																	entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.5), (entity.getDeltaMovement().y()), (entity.getLookAngle().z * 1.5)));
																	if (Mth.nextInt(new Random(), 1, 100) == 2) {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	} else {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	}
																	if (entity instanceof LivingEntity _entity) {
																		ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENQIAO.get());
																		_setstack.setCount(1);
																		_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																		if (_entity instanceof Player _player)
																			_player.getInventory().setChanged();
																	}
																	if (entity instanceof Player _player)
																		_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get(), 100);
																	if (world instanceof Level _level && !_level.isClientSide())
																		_level.explode(null,
																				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																				2, Explosion.BlockInteraction.NONE);
																}
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 20);
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 10);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 5);
						} else {
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get(), 100);
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
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get()) {
										if (entity instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get());
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
										if (entity instanceof Player _player)
											_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get(), 100);
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
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get()) {
													if (entity instanceof LivingEntity _entity) {
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entity instanceof Player _player)
														_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get(), 100);
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
															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get()) {
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
																	if (entity instanceof LivingEntity _entity) {
																		ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENQIAO.get());
																		_setstack.setCount(1);
																		_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																		if (_entity instanceof Player _player)
																			_player.getInventory().setChanged();
																	}
																	if (Mth.nextInt(new Random(), 1, 100) == 2) {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	} else {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	}
																}
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 10);
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
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get()) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u9B42\u9B44\u6D41\u4E4B\u5251\u6280..."), (false));
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
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get()) {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get()) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get());
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									if (entity instanceof Player _player)
										_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get(), 100);
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get());
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									if (entity instanceof Player _player)
										_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get(), 100);
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
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get()) {
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get()) {
													if (entity instanceof LivingEntity _entity) {
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entity instanceof Player _player)
														_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get(), 100);
													if (entity instanceof LivingEntity _entity) {
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entity instanceof Player _player)
														_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get(), 100);
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
															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get()) {
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get()) {
																	if (entity instanceof Player _player) {
																		ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENQIAO.get());
																		_setstack.setCount(1);
																		ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
																	}
																	if (entity instanceof Player _player) {
																		ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENQIAO.get());
																		_setstack.setCount(1);
																		ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
																	}
																	if (entity instanceof LivingEntity _entity) {
																		ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKEN.get());
																		_setstack.setCount(1);
																		_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																		if (_entity instanceof Player _player)
																			_player.getInventory().setChanged();
																	}
																	if (entity instanceof Player _player && !_player.level.isClientSide())
																		_player.displayClientMessage(new TextComponent("\u4E8C\u5200\u6D41\u4E4B\u5965\u4E49\uFF01"), (false));
																	if (Mth.nextInt(new Random(), 1, 100) == 2) {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	} else {
																		if (entity instanceof Player _player)
																			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.ROUKANKEN.get(), 40);
																		if (entity instanceof LivingEntity _entity) {
																			ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKEN.get());
																			_setstack.setCount(1);
																			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																			if (_entity instanceof Player _player)
																				_player.getInventory().setChanged();
																		}
																	}
																}
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 10);
												}
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 5);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 5);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get()) {
					{
						boolean _setval = true;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.use_sanyousei = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 6;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.sanyousei = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1800;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.nenglipower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1800;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.flypower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u534A\u4EBA\u534A\u7075\u7684\u5EAD\u5E08\uFF0C\u300E\u9B42\u9B44\u5996\u68A6\u300F\u3002"), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u5982\u679C\u4F60\u60F3\u5B66\u5251\u7684\u8BDD\uFF0C\u53EF\u4EE5\u6765\u627E\u6211\u3002\u6559\u4EBA\u7EC3\u5251\u4E5F\u662F\u79CD\u4E0D\u9519\u7684\u4FEE\u884C\uFF01"),
								(false));
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("hikari_no_sanyousei:youmujindu"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u4E8C\u5200\u6D41\u8C8C\u4F3C\u4E0D\u50CF\u662F\u8FD9\u6837\u6446\u67B6\u52BF\u7684\u3002"), (true));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u8FD9\u628A\u5200\u592A\u957F\u4E86\uFF0C\u96BE\u4EE5\u6325\u52A8"), (true));
			}
		}
	}
}
