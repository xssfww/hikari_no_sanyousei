package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class HakuroukenfengqiaodangyoujiandianjikongqishishitideweizhiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 6) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					if (entity.isOnGround()) {
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get(), 100);
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
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get()) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get());
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
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
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get()) {
												if (entity instanceof LivingEntity _entity) {
													ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get());
													_setstack.setCount(1);
													_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
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
														if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get()) {
															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
																if (entity instanceof LivingEntity _entity) {
																	ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENQIAO.get());
																	_setstack.setCount(1);
																	_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
																	if (_entity instanceof Player _player)
																		_player.getInventory().setChanged();
																}
																if (entity instanceof LivingEntity _entity) {
																	ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKEN.get());
																	_setstack.setCount(1);
																	_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
																	if (_entity instanceof Player _player)
																		_player.getInventory().setChanged();
																}
																if (entity instanceof Player _player)
																	_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.HAKUROUKEN.get(), 40);
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
																		(new ItemStack(HikariNoSanyouseiModItems.HAKUROUKEN.get())).enchant(Enchantments.SMITE, 3);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 5);
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
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u4E00\u80A1\u5F3A\u5927\u7684\u7075\u529B\u963B\u6B62\u4F60\u62D4\u51FA\u5200\u6765\u3002"), (true));
		}
	}
}
