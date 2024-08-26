package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class ShootsapphireTouZhiWuFeiXingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		DanmaguTouZhiWuFeiXingTickProcedure.execute(immediatesourceentity);
		world.addParticle(ParticleTypes.ELECTRIC_SPARK, x, y, z, 0, 0, 0);
	}
}
