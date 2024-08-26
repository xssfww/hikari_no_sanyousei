package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class MinihakkeroblazingstarDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(HikariNoSanyouseiModItems.MINIHAKKEROBLAZINGSTAR.get(), 50);
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getLookAngle().y * 2), (entity.getLookAngle().z * 2)));
		{
			double _setval = entity.getLookAngle().x * 2;
			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lnx = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getLookAngle().y * 2;
			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lny = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getLookAngle().z * 2;
			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lnz = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
