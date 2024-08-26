package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

public class OnoffnengliProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.hasPermissions(3)) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode == true) {
				{
					boolean _setval = false;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.nenglimode = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u5173\u95ED\u80FD\u529B\u6A21\u5F0F"), (false));
			} else {
				{
					boolean _setval = true;
					entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.nenglimode = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u5F00\u542F\u80FD\u529B\u6A21\u5F0F"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u6CA1\u6709\u6743\u9650"), (false));
		}
	}
}
