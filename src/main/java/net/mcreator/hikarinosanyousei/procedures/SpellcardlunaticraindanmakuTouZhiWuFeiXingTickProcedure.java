package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class SpellcardlunaticraindanmakuTouZhiWuFeiXingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle(ParticleTypes.WAX_ON, x, y, z, 0, 0, 0);
		DanmaguTouZhiWuFeiXingTickProcedure.execute(immediatesourceentity);
	}
}
