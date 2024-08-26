package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MeleeskillcardDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).meleecishu <= 0) {
			{
				double _setval = entity.getDeltaMovement().x();
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lnx = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.getDeltaMovement().y();
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lny = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.getDeltaMovement().z();
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lnz = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 200;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.meleecishu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melle_xuli")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melle_xuli")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 5, (false), (false)));
			{
				boolean _setval = true;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.meleexuli = _setval;
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
					for (int index0 = 0; index0 < (int) (40); index0++) {
						{
							double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).melee + 1;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.melee = _setval;
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
								entity.setDeltaMovement(new Vec3(((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnx * 3),
										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lny * 3),
										((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).lnz * 3)));
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if ((entityiterator.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).meleexuli == false) {
											if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DEFENDBUF.get()) : false) {
												if (entityiterator instanceof LivingEntity _entity)
													_entity.removeEffect(HikariNoSanyouseiModMobEffects.DEFENDBUF.get());
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
																ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defend_out")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:defend_out")),
																SoundSource.PLAYERS, 1, 1, false);
													}
												}
												if (entityiterator instanceof Player _player)
													_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.DEFEND.get(), 600);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee3")),
															SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:melee3")),
															SoundSource.PLAYERS, 1, 1, false);
												}
											}
											if (entityiterator instanceof LivingEntity _entity)
												_entity.hurt(new DamageSource("melee").bypassArmor(), 8);
											{
												boolean _setval = false;
												entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.meleexuli = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).melee);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
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
						boolean _setval = false;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.meleexuli = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lnx = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lny = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lnz = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 100);
		}
	}
}
