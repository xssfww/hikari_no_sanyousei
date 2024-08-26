
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.hikarinosanyousei.block.entity.TeacupemptyBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.TeacupBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.PotionmixerBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.MushroompottedemptyBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.MagicpotwaterBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.MagicpotBlockEntity;
import net.mcreator.hikarinosanyousei.block.entity.JiupingfullblockBlockEntity;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

public class HikariNoSanyouseiModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, HikariNoSanyouseiMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TEACUP = register("teacup", HikariNoSanyouseiModBlocks.TEACUP, TeacupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MUSHROOMPOTTEDEMPTY = register("mushroompottedempty", HikariNoSanyouseiModBlocks.MUSHROOMPOTTEDEMPTY, MushroompottedemptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JIUPINGFULLBLOCK = register("jiupingfullblock", HikariNoSanyouseiModBlocks.JIUPINGFULLBLOCK, JiupingfullblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEACUPEMPTY = register("teacupempty", HikariNoSanyouseiModBlocks.TEACUPEMPTY, TeacupemptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGICPOT = register("magicpot", HikariNoSanyouseiModBlocks.MAGICPOT, MagicpotBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGICPOTWATER = register("magicpotwater", HikariNoSanyouseiModBlocks.MAGICPOTWATER, MagicpotwaterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POTIONMIXER = register("potionmixer", HikariNoSanyouseiModBlocks.POTIONMIXER, PotionmixerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
