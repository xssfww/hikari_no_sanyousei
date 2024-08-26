
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

public class HikariNoSanyouseiModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HikariNoSanyouseiMod.MODID);
	public static final RegistryObject<ParticleType<?>> SPELLCARDSC_2 = REGISTRY.register("spellcardsc_2", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> SPELLCARD = REGISTRY.register("spellcard", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> MASTERSPARKYELLOW = REGISTRY.register("mastersparkyellow", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> MASTERSPARKBLUE = REGISTRY.register("mastersparkblue", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> MASTERSPARKRED = REGISTRY.register("mastersparkred", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> MASTERSPARKHAKEERO = REGISTRY.register("mastersparkhakeero", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> CIRNOFREEZEEFFECT = REGISTRY.register("cirnofreezeeffect", () -> new SimpleParticleType(true));
}
