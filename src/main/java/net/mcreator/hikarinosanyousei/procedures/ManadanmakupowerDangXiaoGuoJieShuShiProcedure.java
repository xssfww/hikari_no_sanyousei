package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ManadanmakupowerDangXiaoGuoJieShuShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 8), (entity.getLookAngle().y * 8), (entity.getLookAngle().z * 8)));
	}
}
