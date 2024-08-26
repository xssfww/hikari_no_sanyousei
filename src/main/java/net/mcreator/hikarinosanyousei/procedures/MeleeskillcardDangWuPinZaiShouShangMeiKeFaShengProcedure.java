package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

public class MeleeskillcardDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).meleecishu - 1;
			entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.meleecishu = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
