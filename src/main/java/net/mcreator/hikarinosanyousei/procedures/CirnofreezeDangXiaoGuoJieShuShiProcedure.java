package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class CirnofreezeDangXiaoGuoJieShuShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.FREEZE, 3);
	}
}
