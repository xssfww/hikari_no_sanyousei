package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;

import java.util.Random;

public class DaiyouseiDangShiTiGengXinKeShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("speddtime", entity) >= 300) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("speddtime");
				if (_so == null)
					_so = _sc.addObjective("speddtime", ObjectiveCriteria.DUMMY, new TextComponent("speddtime"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX() + Mth.nextDouble(new Random(), -15, 15)), (entity.getY() + Mth.nextDouble(new Random(), -15, 15)), (entity.getZ() + Mth.nextDouble(new Random(), -15, 15)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX() + Mth.nextDouble(new Random(), -15, 15)), (entity.getY() + Mth.nextDouble(new Random(), -15, 15)), (entity.getZ() + Mth.nextDouble(new Random(), -15, 15)), _ent.getYRot(),
							_ent.getXRot());
			}
		} else {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("speddtime");
				if (_so == null)
					_so = _sc.addObjective("speddtime", ObjectiveCriteria.DUMMY, new TextComponent("speddtime"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("speddtime", entity) + 1));
			}
		}
	}
}
