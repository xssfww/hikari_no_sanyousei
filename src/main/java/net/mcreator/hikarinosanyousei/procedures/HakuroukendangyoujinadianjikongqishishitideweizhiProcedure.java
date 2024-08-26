package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;

public class HakuroukendangyoujinadianjikongqishishitideweizhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AZALEA_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.FLOWERING_AZALEA_LEAVES) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CACOON.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 100) == 23) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
