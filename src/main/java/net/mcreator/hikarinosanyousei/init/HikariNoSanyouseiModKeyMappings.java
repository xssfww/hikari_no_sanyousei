
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.hikarinosanyousei.network.FlyonoffMessage;
import net.mcreator.hikarinosanyousei.network.AbilitytolaunchMessage;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HikariNoSanyouseiModKeyMappings {
	public static final KeyMapping FLYONOFF = new KeyMapping("key.hikari_no_sanyousei.flyonoff", GLFW.GLFW_KEY_X, "key.categories.misc");
	public static final KeyMapping ABILITYTOLAUNCH = new KeyMapping("key.hikari_no_sanyousei.abilitytolaunch", GLFW.GLFW_KEY_G, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(FLYONOFF);
		ClientRegistry.registerKeyBinding(ABILITYTOLAUNCH);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == FLYONOFF.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HikariNoSanyouseiMod.PACKET_HANDLER.sendToServer(new FlyonoffMessage(0, 0));
						FlyonoffMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == ABILITYTOLAUNCH.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HikariNoSanyouseiMod.PACKET_HANDLER.sendToServer(new AbilitytolaunchMessage(0, 0));
						AbilitytolaunchMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
