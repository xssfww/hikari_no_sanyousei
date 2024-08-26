package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.Random;

public class ManapotionemptyDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HikariNoSanyouseiModItems.MUSHROOMMANA.get())) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MUSHROOMMANA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.MANAPOTIONEMPTY.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 5) {
				if (Mth.nextInt(new Random(), 1, 8) == 4) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MANA_POTION.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else {
				if (Mth.nextInt(new Random(), 1, 4) == 4) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MAJIKARU_SANPAISAIRIYOU_BOMU.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MANA_POTION.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
