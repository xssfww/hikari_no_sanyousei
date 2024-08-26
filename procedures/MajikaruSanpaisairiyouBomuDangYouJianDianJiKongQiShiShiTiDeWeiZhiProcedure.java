package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.MajikaruSanpaisairiyouBomushootEntity;

public class MajikaruSanpaisairiyouBomuDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
		if (entity.isShiftKeyDown() == true) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 5) {
				if ((itemstack).getCount() >= 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 0);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
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
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get()) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 0);
									_entityToSpawn.setPos(x, y, z);
									_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
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
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get()) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
												}
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 5, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (entity instanceof Player _player) {
												ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
												_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 10);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 10);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 0);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 5, 0);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new MajikaruSanpaisairiyouBomushootEntity(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.5), (entity.getLookAngle().z), 1, 1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
