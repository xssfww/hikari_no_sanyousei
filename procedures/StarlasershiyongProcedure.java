package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;

public class StarlasershiyongProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
			StartalkspellcardProcedure.execute(world, x, y, z, entity);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u661F\u5149\u300CStar Laser\u300D"), (true));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 7, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 7, 1, false);
				}
			}
			world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.SPELLCARD.get()), x, y, z, 0, 0, 0);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.SPELLCARDSTARLASER.get(), 1000);
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
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_x");
								if (_so == null)
									_so = _sc.addObjective("starlaser_x", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_x"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (entity.getX() + entity.getLookAngle().x * 12));
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_y");
								if (_so == null)
									_so = _sc.addObjective("starlaser_y", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_y"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (entity.getY() + entity.getLookAngle().y * 12));
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_z");
								if (_so == null)
									_so = _sc.addObjective("starlaser_z", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_z"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (entity.getZ() + entity.getLookAngle().z * 12));
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_playerx");
								if (_so == null)
									_so = _sc.addObjective("starlaser_playerx", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_playerx"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) entity.getX());
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_playery");
								if (_so == null)
									_so = _sc.addObjective("starlaser_playery", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_playery"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) entity.getY());
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_playerz");
								if (_so == null)
									_so = _sc.addObjective("starlaser_playerz", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_playerz"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) entity.getZ());
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_xz");
								if (_so == null)
									_so = _sc.addObjective("starlaser_xz", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_xz"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) entity.getYRot());
							}
							{
								Entity _ent = entity;
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective("starlaser_cx");
								if (_so == null)
									_so = _sc.addObjective("starlaser_cx", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_cx"), ObjectiveCriteria.RenderType.INTEGER);
								_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) entity.getXRot());
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
										boolean _setval = true;
										entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.spellcard = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									{
										Entity _ent = entity;
										Scoreboard _sc = _ent.getLevel().getScoreboard();
										Objective _so = _sc.getObjective("starlaser_use");
										if (_so == null)
											_so = _sc.addObjective("starlaser_use", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_use"), ObjectiveCriteria.RenderType.INTEGER);
										_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
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
												Entity _ent = entity;
												Scoreboard _sc = _ent.getLevel().getScoreboard();
												Objective _so = _sc.getObjective("starlaser_use");
												if (_so == null)
													_so = _sc.addObjective("starlaser_use", ObjectiveCriteria.DUMMY, new TextComponent("starlaser_use"), ObjectiveCriteria.RenderType.INTEGER);
												_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
											}
											{
												boolean _setval = false;
												entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.spellcard = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											{
												ItemStack _ist = itemstack;
												if (_ist.hurt(1, new Random(), null)) {
													_ist.shrink(1);
													_ist.setDamageValue(0);
												}
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 299);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 1);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5F53\u524D\u5E76\u6CA1\u6709\u4F7F\u7528\u65AF\u5854\u8428\u83F2\u96C5\u3002"), (true));
		}
	}
}
