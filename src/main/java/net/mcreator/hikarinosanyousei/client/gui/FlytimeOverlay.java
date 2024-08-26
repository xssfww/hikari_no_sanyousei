
package net.mcreator.hikarinosanyousei.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.hikarinosanyousei.procedures.ManacheckProcedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck9Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck8Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck7Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck6Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck5Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck4Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck3Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck2Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck1Procedure;
import net.mcreator.hikarinosanyousei.procedures.Manacheck10Procedure;
import net.mcreator.hikarinosanyousei.procedures.Flycheck1Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck9Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck8Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck7Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck6Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck5Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck4Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck3Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck2Procedure;
import net.mcreator.hikarinosanyousei.procedures.FlyCheck10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FlytimeOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (true) {
				if (ManacheckProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + -85, 0, 0, 60, 8, 60, 8);
				}
				if (Flycheck1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section_left.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -201, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -195, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck4Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck5Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -183, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck6Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -177, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck7Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -171, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck8Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -165, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck9Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -159, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (FlyCheck10Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/fly_section_right.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -153, posY + -85, 0, 0, 6, 8, 6, 8);
				}
				if (ManacheckProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + -76, 0, 0, 60, 8, 60, 8);
				}
				if (Manacheck1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section_left.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -201, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck4Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck5Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -183, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck6Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -177, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck7Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -171, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck8Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -165, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck9Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -159, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck10Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section_right.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -153, posY + -76, 0, 0, 6, 8, 6, 8);
				}
				if (Manacheck3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mana_section.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -195, posY + -76, 0, 0, 6, 8, 6, 8);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
