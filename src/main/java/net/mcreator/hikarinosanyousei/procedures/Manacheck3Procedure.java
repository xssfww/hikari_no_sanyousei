package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

public class Manacheck3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower >= 540
				&& (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_mp == true) {
			Manacheck4Procedure.execute(entity);
			return true;
		}
		return false;
	}
}
