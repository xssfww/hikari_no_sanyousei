package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class CirnopandingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire() == true) {
			entity.hurt(DamageSource.ON_FIRE, (float) 0.5);
		}
	}
}
