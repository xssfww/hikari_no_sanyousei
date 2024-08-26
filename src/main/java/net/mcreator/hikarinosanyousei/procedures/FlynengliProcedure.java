package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

import java.util.Random;

public class FlynengliProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flyon == false) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei >= 1) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flymode == false) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flypower < 1800) {
						{
							double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flypower + 1;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.flypower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flypower > 0) {
						{
							double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flypower - 1;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.flypower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							boolean _setval = false;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.flymode = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							_player.getAbilities().flying = ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).flymode == true);
							_player.onUpdateAbilities();
						}
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.SLOW_FALLING);
						if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
							if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
								if (Mth.nextInt(new Random(), 1, 5) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u6CA1\u529B\u6C14\u63A5\u7740\u98DE\u4E86..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u4E0D\u80FD\u63A5\u7740\u98DE\u4E0B\u53BB\u4E86\uFF0C\u4E5F\u5C31\u662F\u8BF4..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u54C7\u554A\u554A\u554A\u8981\u6389\u4E0B\u53BB\u4E86\u554A\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u65E9\u77E5\u9053\u5C31\u5148\u627E\u4E2A\u843D\u811A\u70B9\u6B47\u4E00\u4E0B\u4E86\u554A\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u6454\u4E86\u8981\u6454\u4E86\u54C7\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								}
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
								if (Mth.nextInt(new Random(), 1, 5) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u7B49\u7B49...\u6CA1\u529B\u6C14\u98DE\u4E86..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u6CA1\u529B\u6C14\u98DE\u4E0B\u53BB\u4E86\uFF0C\u4E5F\u5C31\u662F\u8BF4..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u6389\u4E0B\u53BB\u4E86\u54C7\u554A\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u6B7B\u4E86\uFF0C\u8981\u6B7B\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u65E9\u77E5\u9053\u5C31\u5148\u6B47\u4E00\u4F1A\u513F\u518D\u98DE\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								}
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
								if (Mth.nextInt(new Random(), 1, 5) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u547C...\u6CA1\u529B\u6C14\u4E86...\u7B49\u7B49...\u63A5\u4E0B\u6765\u5C31\u662F..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u98DE\u4E0D\u52A8\u4E86\uFF0C\u4E5F\u5C31\u662F\u8BF4..."), (false));
								} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981...\u8981\u6389\u4E0B\u53BB\u4E86\u554A\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u88AB\u6454\u6210\u5996\u7CBE\u997C\u5E72\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u6454\u4E0B\u53BB\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								}
							} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 4) {
								if (Mth.nextInt(new Random(), 1, 5) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u554A\u554A\u554A\u8981\u6454\u4E0B\u53BB\u4E86\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 4) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u54C7\u554A\u554A\u554A\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 3) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u88AB\u6454\u788E\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								} else if (Mth.nextInt(new Random(), 1, 2) == 1) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u6389\u4E0B\u53BB\u4E86\uFF0C\u6389\u4E0B\u53BB\u4E86\u554A\u554A\u554A\uFF01"), (false));
								} else {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u8981\u6454\u6B7B\u4E86\u554A\u554A\u554A\uFF01\uFF01\uFF01"), (false));
								}
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u56E0\u4E3A\u9B54\u529B\u4E0D\u591F\u6240\u4EE5\u505C\u6B62\u4E86\u98DE\u884C\u3002"), (false));
					}
				}
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglimode == false) {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower < 1800) {
						{
							double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower + 1;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglipower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower < 1) {
						{
							boolean _setval = false;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglimode = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = (entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).nenglipower - 1;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.nenglipower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		} else {
			{
				double _setval = 1800;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.flypower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		ManacheckProcedure.execute(entity);
	}
}
