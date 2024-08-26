package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LilyWhiteabilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower >= 900) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5BA3\u544A\u4E86\u6625\u5929\u7684\u5230\u6765\u3002"), (false));
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
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, (false), (false)));
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x, y - 1, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x, y, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y - 1, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y - 1, z + 0);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y - 1, z + 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x - 1, y - 1, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x - 1, y - 1, z + 0);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 0, y - 1, z + 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 0, y - 1, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y, z + 0);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 1, y, z + 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x - 1, y, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x - 1, y, z + 0);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x - 1, y, z + 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 0, y, z + 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x + 0, y, z - 1);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
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
								BlockPos _bp = new BlockPos(x, y - 1, z);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x, y, z);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y - 1, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y - 1, z + 0);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y - 1, z + 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x - 1, y - 1, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x - 1, y - 1, z + 0);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 0, y - 1, z + 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 0, y - 1, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y, z + 0);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 1, y, z + 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x - 1, y, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x - 1, y, z + 0);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x - 1, y, z + 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 0, y, z + 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof Level _level) {
								BlockPos _bp = new BlockPos(x + 0, y, z - 1);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
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
										BlockPos _bp = new BlockPos(x, y - 1, z);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x, y, z);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y - 1, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y - 1, z + 0);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y - 1, z + 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x - 1, y - 1, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x - 1, y - 1, z + 0);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 0, y - 1, z + 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 0, y - 1, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y, z + 0);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 1, y, z + 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x - 1, y, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x - 1, y, z + 0);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x - 1, y, z + 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 0, y, z + 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
										}
									}
									if (world instanceof Level _level) {
										BlockPos _bp = new BlockPos(x + 0, y, z - 1);
										if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
											if (!_level.isClientSide())
												_level.levelEvent(2005, _bp, 0);
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
												BlockPos _bp = new BlockPos(x, y - 1, z);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x, y, z);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y - 1, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y - 1, z + 0);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y - 1, z + 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x - 1, y - 1, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x - 1, y - 1, z + 0);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 0, y - 1, z + 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 0, y - 1, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y, z + 0);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 1, y, z + 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x - 1, y, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x - 1, y, z + 0);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x - 1, y, z + 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 0, y, z + 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											if (world instanceof Level _level) {
												BlockPos _bp = new BlockPos(x + 0, y, z - 1);
												if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
													if (!_level.isClientSide())
														_level.levelEvent(2005, _bp, 0);
												}
											}
											{
												final Vec3 _center = new Vec3(x, y, z);
												List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream()
														.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
												for (Entity entityiterator : _entfound) {
													if (entityiterator instanceof LivingEntity _entity)
														_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1, (false), (false)));
												}
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 5);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 5);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 5);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 5);
			{
				double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower - 900;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nenglipower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u5F53\u524D\u9B54\u529B\u4E0D\u8DB3"), (false));
		}
	}
}
