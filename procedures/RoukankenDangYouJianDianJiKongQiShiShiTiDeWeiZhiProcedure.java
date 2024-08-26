package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class RoukankenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENQIAO.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
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
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
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
										ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get());
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 8);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 5);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKEN.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.JIANSHENGROUKANKEN.get()) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HikariNoSanyouseiModItems.ROUKANKENQIAO.get())) : false) == true) {
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENQIAO.get())) : false) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENQIAO.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENQIAO.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
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
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_1.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_1.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.ROUKANKENFENGQIAO_2.get()) {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_2.get()) {
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
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ROUKANKENFENGQIAO.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entity instanceof LivingEntity _entity) {
														ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.HAKUROUKENFENGQIAO_3.get());
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
												}
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 8);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 5);
				}
			}
		}
	}
}
