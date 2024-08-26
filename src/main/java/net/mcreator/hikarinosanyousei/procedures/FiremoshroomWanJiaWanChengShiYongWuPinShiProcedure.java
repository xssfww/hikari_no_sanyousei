package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;

public class FiremoshroomWanJiaWanChengShiYongWuPinShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
