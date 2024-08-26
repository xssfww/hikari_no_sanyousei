package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class SkillMarisastardustreverieDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.SKILL_MARISASTARDUSTREVERIE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.SKILL_MARISA_DARK_SPARK.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
