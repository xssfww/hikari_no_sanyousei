
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hikarinosanyousei.client.model.Model大妖精;
import net.mcreator.hikarinosanyousei.client.model.Modelunknown;
import net.mcreator.hikarinosanyousei.client.model.Modelcrino;
import net.mcreator.hikarinosanyousei.client.model.Modelcirno_ice_Converted;
import net.mcreator.hikarinosanyousei.client.model.Modelamulet;
import net.mcreator.hikarinosanyousei.client.model.ModelReimu;
import net.mcreator.hikarinosanyousei.client.model.ModelMagic_Array;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HikariNoSanyouseiModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcirno_ice_Converted.LAYER_LOCATION, Modelcirno_ice_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelunknown.LAYER_LOCATION, Modelunknown::createBodyLayer);
		event.registerLayerDefinition(Modelamulet.LAYER_LOCATION, Modelamulet::createBodyLayer);
		event.registerLayerDefinition(ModelMagic_Array.LAYER_LOCATION, ModelMagic_Array::createBodyLayer);
		event.registerLayerDefinition(Modelcrino.LAYER_LOCATION, Modelcrino::createBodyLayer);
		event.registerLayerDefinition(ModelReimu.LAYER_LOCATION, ModelReimu::createBodyLayer);
		event.registerLayerDefinition(Model大妖精.LAYER_LOCATION, Model大妖精::createBodyLayer);
	}
}
