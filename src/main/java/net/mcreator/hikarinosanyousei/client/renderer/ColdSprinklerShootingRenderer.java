package net.mcreator.hikarinosanyousei.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.hikarinosanyousei.entity.ColdSprinklerShootingEntity;
import net.mcreator.hikarinosanyousei.client.model.Modelcirno_ice_Converted;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ColdSprinklerShootingRenderer extends EntityRenderer<ColdSprinklerShootingEntity> {
	private static final ResourceLocation texture = new ResourceLocation("hikari_no_sanyousei:textures/entities/cirno_icedanmagu.png");
	private final Modelcirno_ice_Converted model;

	public ColdSprinklerShootingRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelcirno_ice_Converted(context.bakeLayer(Modelcirno_ice_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(ColdSprinklerShootingEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ColdSprinklerShootingEntity entity) {
		return texture;
	}
}
