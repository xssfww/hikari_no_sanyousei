package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;

public class WatermoshroomWanJiaWanChengShiYongWuPinShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setAirSupply(0);
	}
}
