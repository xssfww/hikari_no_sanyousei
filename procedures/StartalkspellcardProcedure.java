package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class StartalkspellcardProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say == false) {
			if (Mth.nextInt(new Random(), 1, 5) == 1) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u554A\u5566\u554A\u5566\uFF0C\u6218\u6597\u53D8\u5F97\u6FC0\u70C8\u8D77\u6765\u4E86\u3002"), (true));
					}
				}
			} else {
				if (Mth.nextInt(new Random(), 1, 4) == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u6CA1\u529E\u6CD5\u4E86\u5462\uFF0C\u53EA\u80FD\u901F\u6218\u901F\u51B3\u4E86\u3002"), (true));
						}
					}
				} else {
					if (Mth.nextInt(new Random(), 1, 3) == 1) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u8FD9\u4E9B\u653B\u51FB\u8FD8\u4E0D\u8D56\u561B\u3002\u4E0D\u8FC7\u5BF9\u6211\u6765\u8BF4\u5DF2\u7ECF\u6CA1\u6709\u7528\u4E86\u54E6\uFF1F"), (true));
							}
						}
					} else {
						if (Mth.nextInt(new Random(), 1, 2) == 1) {
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u867D\u7136\u661F\u661F\u4E0D\u8D77\u773C\uFF0C\u4F46\u662F\u5B83\u4EEC\u53EF\u8FD8\u662F\u5728\u53D1\u5149\u54E6\uFF1F"), (true));
								}
							}
						} else {
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u5C31\u7528\u8FD9\u4E00\u5F20\u7B26\u5361\u6765\u89E3\u51B3\u5427\uFF01"), (true));
								}
							}
						}
					}
				}
			}
		}
	}
}
