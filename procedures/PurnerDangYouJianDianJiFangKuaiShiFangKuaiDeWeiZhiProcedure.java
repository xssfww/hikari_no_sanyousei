package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModBlocks;

import java.util.Random;
import java.util.Map;

public class PurnerDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTED.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u554A\uFF0C\u8611\u83C7\u76C6\u683D\u957F\u597D\u4E86\uFF01\u7B49\u4E86\u597D\u4E45\u4E86\u2014\u2014"), (false));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 5, (false), (false)));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.PURNER.get(), 60);
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
							_player.displayClientMessage(new TextComponent("\u90A3\u5C31\u5F00\u59CB\u4FEE\u526A\u5427\uFF0C\u526A\u4E0B\u6765\u7684\u8611\u83C7\u8FD8\u80FD\u7528\u6765\u505A\u706B\u9505\u5403\u5462\u3002"), (false));
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
									_player.displayClientMessage(new TextComponent("\u597D\uFF0C\u5B8C\u6210\u5566\uFF01"), (false));
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 1, 3)); index0++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.MUSHROOMMANA.get()));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								{
									BlockPos _bp = new BlockPos(x, y, z);
									BlockState _bs = HikariNoSanyouseiModBlocks.MUSHROOMPOTTEDEMPTY.get().defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index1 = 0; index1 < (int) (Mth.nextInt(new Random(), 1, 3)); index1++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_MUSHROOM));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index2 = 0; index2 < (int) (Mth.nextInt(new Random(), 1, 3)); index2++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.MUSHROOMRED.get()));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index3 = 0; index3 < (int) (Mth.nextInt(new Random(), 1, 3)); index3++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.MUSHROOMSOYBEAN.get()));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index4 = 0; index4 < (int) (Mth.nextInt(new Random(), 1, 3)); index4++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.MUSHROOMBIG.get()));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Mth.nextInt(new Random(), 1, 2) == 1) {
									for (int index5 = 0; index5 < (int) (Mth.nextInt(new Random(), 1, 3)); index5++) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_MUSHROOM));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 30);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTEDEMPTY.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u8611\u83C7\u76C6\u683D\u597D\u50CF\u8FD8\u6CA1\u957F\u597D\u554A\uFF1F\u771F\u6162\u554A..."), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u55EF...\u8611\u83C7\u76C6\u683D\u5728..."), (false));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTED.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							new TextComponent("\u65AF\u5854\u7684\u8611\u83C7\u76C6\u683D\u957F\u8D77\u6765\u4E86\u554A\u3002\u6211\u53EF\u4E0D\u4F1A\u4FEE\u526A\u8FD9\u4E1C\u897F\uFF0C\u53EB\u65AF\u5854\u6765\u526A\u5427\u3002"), (false));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTEDEMPTY.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u770B\u4E0A\u53BB\u65AF\u5854\u7684\u8611\u83C7\u76C6\u683D\u8FD8\u6CA1\u957F\u597D\u5462\u3002\u55EF...\u4EE5\u524D\u6709\u8FD9\u4E2A\u4E1C\u897F\u5417\uFF1F"), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u8FD9\u628A\u56ED\u827A\u526A...\u65AF\u5854\u7528\u6765\u4FEE\u526A\u8611\u83C7\u76C6\u683D\u7684\u5427\uFF1F"), (false));
			}
		} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTED.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							new TextComponent(
									"\u55EF\u55EF\uFF0C\u8611\u83C7\u76C6\u683D\u957F\u8D77\u6765\u4E86\u5462\u3002\u8BA9\u65AF\u5854\u4FEE\u526A\u597D\u540E\u628A\u526A\u4E0B\u6765\u7684\u8611\u83C7\u505A\u6210\u706B\u9505\u5403\u5427\u3002"),
							(false));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MUSHROOMPOTTEDEMPTY.get()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u65AF\u5854\u7684\u8611\u83C7\u76C6\u683D\u8FD8\u6CA1\u957F\u597D\u5462\u3002\u55EF..."), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u56ED\u827A\u526A\u662F\u65AF\u5854\u7684\u5427\uFF1F\u653E\u56DE\u53BB\u597D\u4E86\u3002"), (false));
			}
		}
	}
}
