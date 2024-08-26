
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HikariNoSanyouseiModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "lunaogg"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "lunaogg")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "spellcard"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "spellcard")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "spell_xuli"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "spell_xuli")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "laser_1"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "laser_1")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "laser_2"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "laser_2")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "bomb"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "bomb")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "damagu_1"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "damagu_1")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "damagu_2"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "damagu_2")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "defnd"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "defnd")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "defend_out"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "defend_out")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "melee"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "melee")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "melee1"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "melee1")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "melee2"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "melee2")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "melee3"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "melee3")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "melle_xuli"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "melle_xuli")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "blade"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "blade")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "xianshizhan"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "xianshizhan")));
		REGISTRY.put(new ResourceLocation("hikari_no_sanyousei", "desk"), new SoundEvent(new ResourceLocation("hikari_no_sanyousei", "desk")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
