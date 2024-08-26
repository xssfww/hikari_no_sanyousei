
package net.mcreator.hikarinosanyousei.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.hikarinosanyousei.entity.CirnoEntity;
import net.mcreator.hikarinosanyousei.client.model.Modelcrino;

public class CirnoRenderer extends MobRenderer<CirnoEntity, Modelcrino<CirnoEntity>> {
	public CirnoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrino(context.bakeLayer(Modelcrino.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CirnoEntity entity) {
		return new ResourceLocation("hikari_no_sanyousei:textures/entities/crino_texture.png");
	}
}
