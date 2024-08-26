
package net.mcreator.hikarinosanyousei.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.hikarinosanyousei.entity.DaiyouseiEntity;
import net.mcreator.hikarinosanyousei.client.model.Model大妖精;

public class DaiyouseiRenderer extends MobRenderer<DaiyouseiEntity, Model大妖精<DaiyouseiEntity>> {
	public DaiyouseiRenderer(EntityRendererProvider.Context context) {
		super(context, new Model大妖精(context.bakeLayer(Model大妖精.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DaiyouseiEntity entity) {
		return new ResourceLocation("hikari_no_sanyousei:textures/entities/daiyousei_texture.png");
	}
}
