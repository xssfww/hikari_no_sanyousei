
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.hikarinosanyousei.potion.ManadanmakupowerMobEffect;
import net.mcreator.hikarinosanyousei.potion.DrunkMobEffect;
import net.mcreator.hikarinosanyousei.potion.DefendbufMobEffect;
import net.mcreator.hikarinosanyousei.potion.DanmakuPowerMobEffect;
import net.mcreator.hikarinosanyousei.potion.CirnofreezeMobEffect;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

public class HikariNoSanyouseiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HikariNoSanyouseiMod.MODID);
	public static final RegistryObject<MobEffect> DEFENDBUF = REGISTRY.register("defendbuf", () -> new DefendbufMobEffect());
	public static final RegistryObject<MobEffect> DRUNK = REGISTRY.register("drunk", () -> new DrunkMobEffect());
	public static final RegistryObject<MobEffect> DANMAKU_POWER = REGISTRY.register("danmaku_power", () -> new DanmakuPowerMobEffect());
	public static final RegistryObject<MobEffect> MANADANMAKUPOWER = REGISTRY.register("manadanmakupower", () -> new ManadanmakupowerMobEffect());
	public static final RegistryObject<MobEffect> CIRNOFREEZE = REGISTRY.register("cirnofreeze", () -> new CirnofreezeMobEffect());
}
