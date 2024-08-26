
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.hikarinosanyousei.client.renderer.DaiyouseiRenderer;
import net.mcreator.hikarinosanyousei.client.renderer.ColdSprinklerShootingRenderer;
import net.mcreator.hikarinosanyousei.client.renderer.CirnoRenderer;
import net.mcreator.hikarinosanyousei.client.renderer.AmuletRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HikariNoSanyouseiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.DANMAGU.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.SHOOTSAPPHIRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.MINIHAKEROMASTER_SPARK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.COLD_SPRINKLER_SHOOTING.get(), ColdSprinklerShootingRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.SURPRISE_SPRINGSHOOTING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.STARDANMAKU.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.AMULET.get(), AmuletRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.CIRNO.get(), CirnoRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.DAIYOUSEI.get(), DaiyouseiRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.MINIHAKKERO_DRAK_SPARK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HikariNoSanyouseiModEntities.SPELLCARDLUNATICRAINDANMAKU.get(), ThrownItemRenderer::new);
	}
}
