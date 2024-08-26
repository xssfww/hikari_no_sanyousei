package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;

public class MagicbroomDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MASTER_SPARKSPELLCARD.get()) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 5) {
					if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HikariNoSanyouseiModItems.MINI_HAKEERO.get())) : false) == true) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MASTER_SPARKSPELLCARD.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						{
							double _setval = 0;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglipower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.MAGICBROOM.get(), 6000);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.SPELLCARD.get()), x, y, z, 0, 0, 0);
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 1, (false), (false)));
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u547C...\u771F\u6CA1\u60F3\u5230\u4F1A\u88AB\u903C\u51FA\u8FD9\u4E00\u62DB\u3002"), (false));
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
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
										if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(new TextComponent("\u90A3\u4E48\uFF0C\u9B54\u529B\u5168\u5F00\uFF0C\u8FF7\u4F60\u516B\u5366\u7089\uFF01"), (false));
										}
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MINI_HAKEERO.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
										if (entity instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MINI_HAKEERO.get());
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
										if (entity instanceof Player _player)
											_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.MINI_HAKEERO.get(), 100);
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
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
													if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
														if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
															if (entity instanceof Player _player && !_player.level.isClientSide())
																_player.displayClientMessage(new TextComponent("\u5168\u90E8\u7684\u9B54\u529B\u704C\u6CE8\u8FDB\u6B64\uFF01"), (false));
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spell_xuli")), SoundSource.PLAYERS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spell_xuli")), SoundSource.PLAYERS, 1, 1, false);
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
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																	if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
																			if (entity instanceof Player _player && !_player.level.isClientSide())
																				_player.displayClientMessage(new TextComponent("\u5C31\u5728\u6B64\uFF0C\u5316\u8EAB\u4E3A"), (false));
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
																				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
																							if (entity instanceof Player _player && !_player.level.isClientSide())
																								_player.displayClientMessage(new TextComponent("\u5212\u7834\u591C\u7A7A\u7684\u6D41\u661F\uFF01"), (false));
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
																								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																										if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
																											if (entity instanceof Player _player && !_player.level.isClientSide())
																												_player.displayClientMessage(new TextComponent("\u604B\u7B26 Master Spark\uFF01"), (false));
																										}
																										if (world instanceof Level _level) {
																											if (!_level.isClientSide()) {
																												_level.playSound(null, new BlockPos(x, y, z),
																														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1);
																											} else {
																												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")),
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
																												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
																														.getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																													if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																															.getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																														if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
																															if (entity instanceof Player _player && !_player.level.isClientSide())
																																_player.displayClientMessage(new TextComponent("\u6D41\u661F\u7684...\u5149\u8F89\uFF01"), (false));
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
																																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
																																		.getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																																	if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																																			.getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																																		if (world instanceof Level _level) {
																																			if (!_level.isClientSide()) {
																																				_level.playSound(null, new BlockPos(x, y, z),
																																						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spell_xuli")),
																																						SoundSource.PLAYERS, 1, 1);
																																			} else {
																																				_level.playLocalSound(x, y, z,
																																						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spell_xuli")),
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
																																				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
																																						.getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
																																					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																																							.getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																																						world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.SPELLCARD.get()), x, y,
																																								z, 0, 0, 0);
																																						{
																																							boolean _setval = true;
																																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.ifPresent(capability -> {
																																										capability.spellcard = _setval;
																																										capability.syncPlayerVariables(entity);
																																									});
																																						}
																																						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																								.orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
																																							if (entity instanceof Player _player && !_player.level.isClientSide())
																																								_player.displayClientMessage(new TextComponent("BLAZING STAR\uFF01"), (false));
																																						}
																																						if (entity instanceof LivingEntity _entity)
																																							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3, (false), (false)));
																																						if (world instanceof Level _level) {
																																							if (!_level.isClientSide()) {
																																								_level.playSound(null, new BlockPos(x, y, z),
																																										ForgeRegistries.SOUND_EVENTS
																																												.getValue(new ResourceLocation("hikari_no_sanyousei:bomb")),
																																										SoundSource.PLAYERS, 1, 1);
																																							} else {
																																								_level.playLocalSound(x, y, z,
																																										ForgeRegistries.SOUND_EVENTS
																																												.getValue(new ResourceLocation("hikari_no_sanyousei:bomb")),
																																										SoundSource.PLAYERS, 1, 1, false);
																																							}
																																						}
																																						if (entity instanceof LivingEntity _entity)
																																							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 6, (false), (false)));
																																						if (entity instanceof LivingEntity _entity) {
																																							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR.get());
																																							_setstack.setCount(1);
																																							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																																							if (_entity instanceof Player _player)
																																								_player.getInventory().setChanged();
																																						}
																																						entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getLookAngle().y * 2),
																																								(entity.getLookAngle().z * 2)));
																																						{
																																							double _setval = entity.getLookAngle().x * 2;
																																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.ifPresent(capability -> {
																																										capability.lnx = _setval;
																																										capability.syncPlayerVariables(entity);
																																									});
																																						}
																																						{
																																							double _setval = entity.getLookAngle().y * 2;
																																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.ifPresent(capability -> {
																																										capability.lny = _setval;
																																										capability.syncPlayerVariables(entity);
																																									});
																																						}
																																						{
																																							double _setval = entity.getLookAngle().y * 2;
																																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.ifPresent(capability -> {
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
																																								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
																																										.getItem() == HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR.get()) {
																																									if ((entity instanceof LivingEntity _livEnt
																																											? _livEnt.getMainHandItem()
																																											: ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
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
																																												if ((entity instanceof LivingEntity _livEnt
																																														? _livEnt.getOffhandItem()
																																														: ItemStack.EMPTY)
																																														.getItem() == HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR
																																																.get()) {
																																													if ((entity instanceof LivingEntity _livEnt
																																															? _livEnt.getMainHandItem()
																																															: ItemStack.EMPTY)
																																															.getItem() == HikariNoSanyouseiModItems.MAGICBROOM.get()) {
																																														if (entity instanceof Player _player) {
																																															ItemStack _stktoremove = new ItemStack(
																																																	HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR
																																																			.get());
																																															_player.getInventory().clearOrCountMatchingItems(
																																																	p -> _stktoremove.getItem() == p.getItem(), 1,
																																																	_player.inventoryMenu.getCraftSlots());
																																														}
																																														if (entity instanceof LivingEntity _entity) {
																																															ItemStack _setstack = new ItemStack(
																																																	HikariNoSanyouseiModItems.MINI_HAKEERO.get());
																																															_setstack.setCount(1);
																																															_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																																															if (_entity instanceof Player _player)
																																																_player.getInventory().setChanged();
																																														}
																																														{
																																															boolean _setval = false;
																																															entity.getCapability(
																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null).ifPresent(capability -> {
																																																		capability.spellcard = _setval;
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
																																																	ItemStack _ist = (entity instanceof LivingEntity _livEnt
																																																			? _livEnt.getOffhandItem()
																																																			: ItemStack.EMPTY);
																																																	if (_ist.hurt(30, new Random(), null)) {
																																																		_ist.shrink(1);
																																																		_ist.setDamageValue(0);
																																																	}
																																																}
																																																MinecraftForge.EVENT_BUS.unregister(this);
																																															}
																																														}.start(world, 1);
																																													} else {
																																														{
																																															boolean _setval = false;
																																															entity.getCapability(
																																																	HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null).ifPresent(capability -> {
																																																		capability.spellcard = _setval;
																																																		capability.syncPlayerVariables(entity);
																																																	});
																																														}
																																													}
																																												} else {
																																													{
																																														boolean _setval = false;
																																														entity.getCapability(
																																																HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																null).ifPresent(capability -> {
																																																	capability.spellcard = _setval;
																																																	capability.syncPlayerVariables(entity);
																																																});
																																													}
																																												}
																																												MinecraftForge.EVENT_BUS.unregister(this);
																																											}
																																										}.start(world, 50);
																																									} else {
																																										{
																																											boolean _setval = false;
																																											entity.getCapability(
																																													HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																													.ifPresent(capability -> {
																																														capability.spellcard = _setval;
																																														capability.syncPlayerVariables(entity);
																																													});
																																										}
																																									}
																																								} else {
																																									{
																																										boolean _setval = false;
																																										entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY,
																																												null).ifPresent(capability -> {
																																													capability.spellcard = _setval;
																																													capability.syncPlayerVariables(entity);
																																												});
																																									}
																																								}
																																								MinecraftForge.EVENT_BUS.unregister(this);
																																							}
																																						}.start(world, 150);
																																					} else {
																																						{
																																							boolean _setval = false;
																																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																									.ifPresent(capability -> {
																																										capability.spellcard = _setval;
																																										capability.syncPlayerVariables(entity);
																																									});
																																						}
																																					}
																																				} else {
																																					{
																																						boolean _setval = false;
																																						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																								.ifPresent(capability -> {
																																									capability.spellcard = _setval;
																																									capability.syncPlayerVariables(entity);
																																								});
																																					}
																																				}
																																				MinecraftForge.EVENT_BUS.unregister(this);
																																			}
																																		}.start(world, 20);
																																	} else {
																																		{
																																			boolean _setval = false;
																																			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.ifPresent(capability -> {
																																						capability.spellcard = _setval;
																																						capability.syncPlayerVariables(entity);
																																					});
																																		}
																																	}
																																} else {
																																	{
																																		boolean _setval = false;
																																		entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																			capability.spellcard = _setval;
																																			capability.syncPlayerVariables(entity);
																																		});
																																	}
																																}
																																MinecraftForge.EVENT_BUS.unregister(this);
																															}
																														}.start(world, 20);
																													} else {
																														{
																															boolean _setval = false;
																															entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																capability.spellcard = _setval;
																																capability.syncPlayerVariables(entity);
																															});
																														}
																													}
																												} else {
																													{
																														boolean _setval = false;
																														entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																															capability.spellcard = _setval;
																															capability.syncPlayerVariables(entity);
																														});
																													}
																												}
																												MinecraftForge.EVENT_BUS.unregister(this);
																											}
																										}.start(world, 20);
																									} else {
																										{
																											boolean _setval = false;
																											entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																												capability.spellcard = _setval;
																												capability.syncPlayerVariables(entity);
																											});
																										}
																									}
																								} else {
																									{
																										boolean _setval = false;
																										entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																											capability.spellcard = _setval;
																											capability.syncPlayerVariables(entity);
																										});
																									}
																								}
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, 20);
																					} else {
																						{
																							boolean _setval = false;
																							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																								capability.spellcard = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																						}
																					}
																				} else {
																					{
																						boolean _setval = false;
																						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																							capability.spellcard = _setval;
																							capability.syncPlayerVariables(entity);
																						});
																					}
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 20);
																	} else {
																		{
																			boolean _setval = false;
																			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																				capability.spellcard = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																		}
																	}
																} else {
																	{
																		boolean _setval = false;
																		entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																			capability.spellcard = _setval;
																			capability.syncPlayerVariables(entity);
																		});
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 20);
													} else {
														{
															boolean _setval = false;
															entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.spellcard = _setval;
																capability.syncPlayerVariables(entity);
															});
														}
													}
												} else {
													{
														boolean _setval = false;
														entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.spellcard = _setval;
															capability.syncPlayerVariables(entity);
														});
													}
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 20);
									} else {
										{
											boolean _setval = false;
											entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.spellcard = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
								} else {
									{
										boolean _setval = false;
										entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.spellcard = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u80CC\u5305\u5185\u5E76\u6CA1\u6709\u8FF7\u4F60\u516B\u5366\u7089"), (false));
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u5E76\u6CA1\u6709\u9009\u62E9\u96FE\u96E8\u9B54\u7406\u6C99"), (false));
				}
			}
		}
	}
}
