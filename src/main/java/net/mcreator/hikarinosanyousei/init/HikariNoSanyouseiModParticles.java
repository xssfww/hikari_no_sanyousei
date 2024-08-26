
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.hikarinosanyousei.client.particle.Spellcardsc2Particle;
import net.mcreator.hikarinosanyousei.client.particle.SpellcardParticle;
import net.mcreator.hikarinosanyousei.client.particle.MastersparkyellowParticle;
import net.mcreator.hikarinosanyousei.client.particle.MastersparkredParticle;
import net.mcreator.hikarinosanyousei.client.particle.MastersparkhakeeroParticle;
import net.mcreator.hikarinosanyousei.client.particle.MastersparkblueParticle;
import net.mcreator.hikarinosanyousei.client.particle.CirnofreezeeffectParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HikariNoSanyouseiModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.SPELLCARDSC_2.get(), Spellcardsc2Particle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.SPELLCARD.get(), SpellcardParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get(), MastersparkyellowParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.MASTERSPARKBLUE.get(), MastersparkblueParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.MASTERSPARKRED.get(), MastersparkredParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.MASTERSPARKHAKEERO.get(), MastersparkhakeeroParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HikariNoSanyouseiModParticleTypes.CIRNOFREEZEEFFECT.get(), CirnofreezeeffectParticle::provider);
	}
}
