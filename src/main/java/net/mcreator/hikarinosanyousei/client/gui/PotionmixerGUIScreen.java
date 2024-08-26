
package net.mcreator.hikarinosanyousei.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.hikarinosanyousei.world.inventory.PotionmixerGUIMenu;
import net.mcreator.hikarinosanyousei.network.PotionmixerGUIButtonMessage;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PotionmixerGUIScreen extends AbstractContainerScreen<PotionmixerGUIMenu> {
	private final static HashMap<String, Object> guistate = PotionmixerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kai_shi_hun_he;

	public PotionmixerGUIScreen(PotionmixerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("hikari_no_sanyousei:textures/screens/potionmixer_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/jiantou_right.png"));
		this.blit(ms, this.leftPos + 63, this.topPos + 49, 0, 0, 10, 6, 10, 6);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/jiantou_zuo.png"));
		this.blit(ms, this.leftPos + 99, this.topPos + 49, 0, 0, 10, 6, 10, 6);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mark_volimetric_flask.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mark_volimetric_flask.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mark_volimetric_flask.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hikari_no_sanyousei:textures/screens/mark_reagents.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_kai_shi_hun_he = new Button(this.leftPos + 114, this.topPos + 61, 46, 20, new TranslatableComponent("gui.hikari_no_sanyousei.potionmixer_gui.button_kai_shi_hun_he"), e -> {
			if (true) {
				HikariNoSanyouseiMod.PACKET_HANDLER.sendToServer(new PotionmixerGUIButtonMessage(0, x, y, z));
				PotionmixerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_kai_shi_hun_he", button_kai_shi_hun_he);
		this.addRenderableWidget(button_kai_shi_hun_he);
	}
}
