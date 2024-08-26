
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.hikarinosanyousei.world.inventory.PotionmixerGUIMenu;
import net.mcreator.hikarinosanyousei.world.inventory.MarisaminihakkeroskillGUIMenu;
import net.mcreator.hikarinosanyousei.world.inventory.MagicpotguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HikariNoSanyouseiModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MagicpotguiMenu> MAGICPOTGUI = register("magicpotgui", (id, inv, extraData) -> new MagicpotguiMenu(id, inv, extraData));
	public static final MenuType<PotionmixerGUIMenu> POTIONMIXER_GUI = register("potionmixer_gui", (id, inv, extraData) -> new PotionmixerGUIMenu(id, inv, extraData));
	public static final MenuType<MarisaminihakkeroskillGUIMenu> MARISAMINIHAKKEROSKILL_GUI = register("marisaminihakkeroskill_gui", (id, inv, extraData) -> new MarisaminihakkeroskillGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
