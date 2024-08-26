
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.hikarinosanyousei.client.gui.PotionmixerGUIScreen;
import net.mcreator.hikarinosanyousei.client.gui.MarisaminihakkeroskillGUIScreen;
import net.mcreator.hikarinosanyousei.client.gui.MagicpotguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HikariNoSanyouseiModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HikariNoSanyouseiModMenus.MAGICPOTGUI, MagicpotguiScreen::new);
			MenuScreens.register(HikariNoSanyouseiModMenus.POTIONMIXER_GUI, PotionmixerGUIScreen::new);
			MenuScreens.register(HikariNoSanyouseiModMenus.MARISAMINIHAKKEROSKILL_GUI, MarisaminihakkeroskillGUIScreen::new);
		});
	}
}
