package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class MinihakkeromastersparkDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).spellcard == true) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("masterspark_use", entity) == 1) {
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("masterspark_time", entity) >= 400) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("masterspark_time");
						if (_so == null)
							_so = _sc.addObjective("masterspark_time", ObjectiveCriteria.DUMMY, new TextComponent("masterspark_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					{
						boolean _setval = false;
						entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.spellcard = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("masterspark_use");
						if (_so == null)
							_so = _sc.addObjective("masterspark_use", ObjectiveCriteria.DUMMY, new TextComponent("masterspark_use"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MINIHAKKEROMASTERSPARK.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MINI_HAKEERO.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("masterspark_time");
						if (_so == null)
							_so = _sc.addObjective("masterspark_time", ObjectiveCriteria.DUMMY, new TextComponent("masterspark_time"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.getLevel().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("masterspark_time", entity) + 1));
					}
				}
			}
		}
	}
}
