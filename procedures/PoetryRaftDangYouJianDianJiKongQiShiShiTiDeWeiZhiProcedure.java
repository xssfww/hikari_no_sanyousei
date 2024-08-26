package net.mcreator.hikarinosanyousei.procedures;

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
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class PoetryRaftDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
			if ((world instanceof Level _lvl && _lvl.isDay()) == false) {
				if (world.getLevelData().isRaining()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 160, 5, (false), (false)));
					(itemstack).shrink(1);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 160);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_STAR.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u591C\u665A\u4E86\uFF0C\u4F46\u662F\u6709\u96E8\u554A..."), (false));
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
									_player.displayClientMessage(new TextComponent("\u6709\u96E8\u6240\u4EE5\u770B\u4E0D\u5230\u661F\u7A7A..."), (false));
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
										world.getLevelData().setRaining((false));
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u4F46\u662F\uFF0C\u5C31\u7B97\u662F\u6211\u7684\u8FD9\u4EFD\u5C0F\u5C0F\u7684\u529B\u91CF"), (false));
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
													_player.displayClientMessage(new TextComponent("\u4E00\u5B9A\u53EF\u4EE5\uFF0C\u8BA9\u661F\u7A7A\u91CD\u65B0\u663E\u9732\u51FA\u6765\u7684\u3002"), (false));
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
															_player.displayClientMessage(new TextComponent("\u62AC\u5934\u770B\u5929\u5427\uFF0C\u90A3\u6B63\u662F\uFF0C\u7480\u74A8\u7684\u94F6\u6CB3\u554A\uFF01"), (false));
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
				} else {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u8FD9\u707F\u70C2\u7684\u661F\u7A7A\u554A...\uFF08\u9676\u9189\uFF09"), (true));
					}
				}
			} else {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u73B0\u5728\u8FD8\u662F\u767D\u5929\u554A\u3002\u5230\u665A\u4E0A\u518D\u770B\u661F\u661F\u5427\u3002"), (true));
				}
			}
		} else {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u8FD9\u4E1C\u897F\uFF0C\u597D\u50CF\u662F\u65AF\u5854\u505A\u7684\u5427\u3002\u7528\u6765\u5E72\u4EC0\u4E48\u7684\u6765\u7740..."), (true));
			}
		}
	}
}
