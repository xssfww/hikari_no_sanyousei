package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModParticleTypes;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class LasernormlDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double run_time = 0;
		double fly_x = 0;
		double fly_y = 0;
		double fly_z = 0;
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:laser_1")), SoundSource.PLAYERS, 5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:laser_1")), SoundSource.PLAYERS, 5, 1, false);
			}
		}
		run_time = 1;
		for (int index0 = 0; index0 < (int) (96); index0++) {
			run_time = run_time + 1;
			world.addParticle((SimpleParticleType) (HikariNoSanyouseiModParticleTypes.MASTERSPARKYELLOW.get()), (entity.getX() + entity.getLookAngle().x * run_time), (entity.getY() + entity.getLookAngle().y * run_time + 1),
					(entity.getZ() + entity.getLookAngle().z * run_time), 0, 0, 0);
			{
				final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * run_time), (entity.getY() + entity.getLookAngle().y * run_time + 1), (entity.getZ() + entity.getLookAngle().z * run_time));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					entityiterator.hurt(DamageSource.GENERIC, 2);
				}
			}
		}
	}
}
