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
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

import java.util.Random;

public class SpellcardFatalFlashDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == true) {
				SunnytalkspellcardProcedure.execute(world, x, y, z, entity);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u77AC\u5149\u300CFatal Flash\u300D"), (true));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 10));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 1));
			world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.SPELLCARDSC_2.get()), x, y, z, 0, 0, 0);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
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
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 5));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
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
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
								}
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(1, 0, 1, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, 1, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-1), 0, 1, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(1, 0, 0, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(1, 0, (-1), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, 0, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, (-1), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-1), 0, 0, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 1);
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
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
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
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
										}
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(1, 0, 1, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, 1, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-1), 0, 1, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(1, 0, 0, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(1, 0, (-1), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, 0, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, (-1), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-1), 0, 0, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 3, 0);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 1);
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
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
												}
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(1, 0, 1, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, 1, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-1), 0, 1, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(1, 0, 0, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(1, 0, (-1), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, 0, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, (-1), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-1), 0, 0, 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 3, 0);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 1);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
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
															_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
														}
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(1, 0, 1, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0, 0, 1, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-1), 0, 1, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(1, 0, 0, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(1, 0, (-1), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0, 0, 0, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot(0, 0, (-1), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-1), 0, 0, 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 3, 0);
														_entityToSpawn.setPos(x, y, z);
														_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 1);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
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
																	_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
																}
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 1);
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
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
																	_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 2, 1, false);
																}
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 1, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(1, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0.5, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot(0, 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-0.5), 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 0.5, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, 0, 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, (-0.5), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 3, 0);
																_entityToSpawn.setPos(x, y, z);
																_entityToSpawn.shoot((-1), 0, (-1), 2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
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
																	DanmakukaihuaProcedure.execute(world,
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																			(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																			entity);
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
																					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 1, 1);
																				} else {
																					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 1, 1, false);
																				}
																			}
																			for (int index0 = 0; index0 < (int) (36); index0++) {
																				if (world instanceof ServerLevel projectileLevel) {
																					Projectile _entityToSpawn = new Object() {
																						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																							AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																							entityToSpawn.setOwner(shooter);
																							entityToSpawn.setBaseDamage(damage);
																							entityToSpawn.setKnockback(knockback);
																							entityToSpawn.setSilent(true);
																							entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																							return entityToSpawn;
																						}
																					}.getArrow(projectileLevel, entity, 2, 0);
																					_entityToSpawn.setPos(
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
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
																					DanmakukaihuaProcedure.execute(world,
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																							entity);
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
																											SoundSource.PLAYERS, 1, 1);
																								} else {
																									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:damagu_1")), SoundSource.PLAYERS, 1, 1,
																											false);
																								}
																							}
																							for (int index1 = 0; index1 < (int) (36); index1++) {
																								if (world instanceof ServerLevel projectileLevel) {
																									Projectile _entityToSpawn = new Object() {
																										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																											AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
																											entityToSpawn.setOwner(shooter);
																											entityToSpawn.setBaseDamage(damage);
																											entityToSpawn.setKnockback(knockback);
																											entityToSpawn.setSilent(true);
																											entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
																											return entityToSpawn;
																										}
																									}.getArrow(projectileLevel, entity, 2, 0);
																									_entityToSpawn.setPos(
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
																											(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
																									_entityToSpawn.shoot((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), -1, 1)), 3, 0);
																									projectileLevel.addFreshEntity(_entityToSpawn);
																								}
																							}
																							MinecraftForge.EVENT_BUS.unregister(this);
																						}
																					}.start(world, 8);
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, 10);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, 8);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, 10);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 10);
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
			}.start(world, 10);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5F53\u524D\u5E76\u6CA1\u6709\u4F7F\u7528\u6851\u5C3C\u7C73\u5C14\u514B\u3002"), (true));
		}
	}
}
