
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.entity.SurpriseSpringshootingEntity;
import net.mcreator.hikarinosanyousei.entity.StardanmakuEntity;
import net.mcreator.hikarinosanyousei.entity.SpellcardlunaticraindanmakuEntity;
import net.mcreator.hikarinosanyousei.entity.ShootsapphireEntity;
import net.mcreator.hikarinosanyousei.entity.MinihakkeroDrakSparkEntity;
import net.mcreator.hikarinosanyousei.entity.MinihakeromasterSparkEntity;
import net.mcreator.hikarinosanyousei.entity.MajikaruSanpaisairiyouBomushootEntity;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;
import net.mcreator.hikarinosanyousei.entity.DaiyouseiEntity;
import net.mcreator.hikarinosanyousei.entity.ColdSprinklerShootingEntity;
import net.mcreator.hikarinosanyousei.entity.CirnoEntity;
import net.mcreator.hikarinosanyousei.entity.AmuletEntity;
import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HikariNoSanyouseiModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, HikariNoSanyouseiMod.MODID);
	public static final RegistryObject<EntityType<DanmaguEntity>> DANMAGU = register("projectile_danmagu",
			EntityType.Builder.<DanmaguEntity>of(DanmaguEntity::new, MobCategory.MISC).setCustomClientFactory(DanmaguEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShootsapphireEntity>> SHOOTSAPPHIRE = register("projectile_shootsapphire",
			EntityType.Builder.<ShootsapphireEntity>of(ShootsapphireEntity::new, MobCategory.MISC).setCustomClientFactory(ShootsapphireEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MinihakeromasterSparkEntity>> MINIHAKEROMASTER_SPARK = register("projectile_minihakeromaster_spark",
			EntityType.Builder.<MinihakeromasterSparkEntity>of(MinihakeromasterSparkEntity::new, MobCategory.MISC).setCustomClientFactory(MinihakeromasterSparkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColdSprinklerShootingEntity>> COLD_SPRINKLER_SHOOTING = register("projectile_cold_sprinkler_shooting",
			EntityType.Builder.<ColdSprinklerShootingEntity>of(ColdSprinklerShootingEntity::new, MobCategory.MISC).setCustomClientFactory(ColdSprinklerShootingEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SurpriseSpringshootingEntity>> SURPRISE_SPRINGSHOOTING = register("projectile_surprise_springshooting",
			EntityType.Builder.<SurpriseSpringshootingEntity>of(SurpriseSpringshootingEntity::new, MobCategory.MISC).setCustomClientFactory(SurpriseSpringshootingEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MajikaruSanpaisairiyouBomushootEntity>> MAJIKARU_SANPAISAIRIYOU_BOMUSHOOT = register("projectile_majikaru_sanpaisairiyou_bomushoot",
			EntityType.Builder.<MajikaruSanpaisairiyouBomushootEntity>of(MajikaruSanpaisairiyouBomushootEntity::new, MobCategory.MISC).setCustomClientFactory(MajikaruSanpaisairiyouBomushootEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StardanmakuEntity>> STARDANMAKU = register("projectile_stardanmaku",
			EntityType.Builder.<StardanmakuEntity>of(StardanmakuEntity::new, MobCategory.MISC).setCustomClientFactory(StardanmakuEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmuletEntity>> AMULET = register("projectile_amulet",
			EntityType.Builder.<AmuletEntity>of(AmuletEntity::new, MobCategory.MISC).setCustomClientFactory(AmuletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CirnoEntity>> CIRNO = register("cirno",
			EntityType.Builder.<CirnoEntity>of(CirnoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CirnoEntity::new)

					.sized(0.6f, 3f));
	public static final RegistryObject<EntityType<DaiyouseiEntity>> DAIYOUSEI = register("daiyousei",
			EntityType.Builder.<DaiyouseiEntity>of(DaiyouseiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaiyouseiEntity::new)

					.sized(0.6f, 3f));
	public static final RegistryObject<EntityType<MinihakkeroDrakSparkEntity>> MINIHAKKERO_DRAK_SPARK = register("projectile_minihakkero_drak_spark", EntityType.Builder.<MinihakkeroDrakSparkEntity>of(MinihakkeroDrakSparkEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MinihakkeroDrakSparkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpellcardlunaticraindanmakuEntity>> SPELLCARDLUNATICRAINDANMAKU = register("projectile_spellcardlunaticraindanmaku",
			EntityType.Builder.<SpellcardlunaticraindanmakuEntity>of(SpellcardlunaticraindanmakuEntity::new, MobCategory.MISC).setCustomClientFactory(SpellcardlunaticraindanmakuEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CirnoEntity.init();
			DaiyouseiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CIRNO.get(), CirnoEntity.createAttributes().build());
		event.put(DAIYOUSEI.get(), DaiyouseiEntity.createAttributes().build());
	}
}
