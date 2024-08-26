package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class MeleeonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).meleecishu <= 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.MELEESKILLCARD.get(), 300);
		}
	}
}
