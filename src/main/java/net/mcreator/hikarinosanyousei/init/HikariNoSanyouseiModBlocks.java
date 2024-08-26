
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.hikarinosanyousei.block.TeacupemptyBlock;
import net.mcreator.hikarinosanyousei.block.TeacupBlock;
import net.mcreator.hikarinosanyousei.block.PotionmixerBlock;
import net.mcreator.hikarinosanyousei.block.MushroompottedemptyBlock;
import net.mcreator.hikarinosanyousei.block.MushroompottedBlock;
import net.mcreator.hikarinosanyousei.block.MagicpotwaterBlock;
import net.mcreator.hikarinosanyousei.block.MagicpotBlock;
import net.mcreator.hikarinosanyousei.block.JiupingfullblockBlock;
import net.mcreator.hikarinosanyousei.block.JiupingemptyblockBlock;
import net.mcreator.hikarinosanyousei.block.EhavedicecupblockBlock;
import net.mcreator.hikarinosanyousei.block.DeskBlock;
import net.mcreator.hikarinosanyousei.block.CupemptyblockBlock;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

public class HikariNoSanyouseiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HikariNoSanyouseiMod.MODID);
	public static final RegistryObject<Block> TEACUP = REGISTRY.register("teacup", () -> new TeacupBlock());
	public static final RegistryObject<Block> EHAVEDICECUPBLOCK = REGISTRY.register("ehavedicecupblock", () -> new EhavedicecupblockBlock());
	public static final RegistryObject<Block> MUSHROOMPOTTED = REGISTRY.register("mushroompotted", () -> new MushroompottedBlock());
	public static final RegistryObject<Block> MUSHROOMPOTTEDEMPTY = REGISTRY.register("mushroompottedempty", () -> new MushroompottedemptyBlock());
	public static final RegistryObject<Block> CUPEMPTYBLOCK = REGISTRY.register("cupemptyblock", () -> new CupemptyblockBlock());
	public static final RegistryObject<Block> JIUPINGEMPTYBLOCK = REGISTRY.register("jiupingemptyblock", () -> new JiupingemptyblockBlock());
	public static final RegistryObject<Block> JIUPINGFULLBLOCK = REGISTRY.register("jiupingfullblock", () -> new JiupingfullblockBlock());
	public static final RegistryObject<Block> TEACUPEMPTY = REGISTRY.register("teacupempty", () -> new TeacupemptyBlock());
	public static final RegistryObject<Block> MAGICPOT = REGISTRY.register("magicpot", () -> new MagicpotBlock());
	public static final RegistryObject<Block> MAGICPOTWATER = REGISTRY.register("magicpotwater", () -> new MagicpotwaterBlock());
	public static final RegistryObject<Block> POTIONMIXER = REGISTRY.register("potionmixer", () -> new PotionmixerBlock());
	public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TeacupBlock.registerRenderLayer();
			EhavedicecupblockBlock.registerRenderLayer();
			MushroompottedBlock.registerRenderLayer();
			MushroompottedemptyBlock.registerRenderLayer();
			CupemptyblockBlock.registerRenderLayer();
			JiupingemptyblockBlock.registerRenderLayer();
			JiupingfullblockBlock.registerRenderLayer();
			TeacupemptyBlock.registerRenderLayer();
			MagicpotBlock.registerRenderLayer();
			MagicpotwaterBlock.registerRenderLayer();
			PotionmixerBlock.registerRenderLayer();
			DeskBlock.registerRenderLayer();
		}
	}
}
