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

public class SunnytalkspellcardProcedure {
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
							_player.displayClientMessage(new TextComponent("\u73B0\u5728\u662F\u6211\u7684\u56DE\u5408\uFF01"), (true));
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
								_player.displayClientMessage(new TextComponent("\u63A5\u4E0B\u6765\u5C31\u662F\u6211\u7684\u4E3B\u573A\u4E86\uFF01"), (true));
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
									_player.displayClientMessage(new TextComponent("\u53EA\u8981\u4E09\u4EBA\u540C\u5FC3\uFF0C\u6CA1\u6709\u4EC0\u4E48\u653B\u4E0D\u7834\u7684\u654C\u4EBA\uFF01"), (true));
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
										_player.displayClientMessage(new TextComponent("\u5C31\u7528\u8FD9\u5F20\u7B26\u5361\u6765\u7ED3\u675F\u5427\uFF01"), (true));
								}
							}
						} else {
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("\u5149\u8292\u554A\uFF0C\u6298\u5C04\u5427\uFF01"), (true));
								}
							}
						}
					}
				}
			}
		}
	}
}
