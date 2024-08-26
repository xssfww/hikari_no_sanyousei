package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class PenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.INK_SAC) {
			(new ItemStack(Items.INK_SAC)).shrink(1);
			(new ItemStack(HikariNoSanyouseiModItems.PEN.get())).setDamageValue(0);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.POETRY_RAFT_EMPTY.get()) {
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() >= 9) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u7B14\u6CA1\u6709\u58A8\u4E86\uFF0C\u4F7F\u7528\u58A8\u56CA\u586B\u5145\u5427\u3002"), (true));
			} else {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_EMPTY.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_STAR.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() + 1));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5199\u4E0B\u4E86\u9971\u542B\u5BF9\u661F\u7A7A\u7684\u613F\u671B\u7684\u795D\u8BCD\u3002"), (true));
					} else {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_EMPTY.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.POETRYRAFTSTAR.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() + 1));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u5199\u4E0B\u4E86\u9971\u542B\u5BF9\u548C\u5E73\u7684\u5FC3\u613F\u7684\u8BDD\u8BED\u3002"), (true));
					}
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_EMPTY.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.POETRYRAFTLUNA.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() + 1));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u5199\u4E0B\u4E86\u8574\u542B\u7740\u5BF9\u5206\u4EAB\u7684\u5FC3\u613F\u7684\u8BDD\u8BED\u3002"), (true));
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFT_EMPTY.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.POETRY_RAFTSUN.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() + 1));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u5199\u4E0B\u4E86\u8868\u8FBE\u7740\u590D\u5174\u5996\u7CBE\u7684\u5FC3\u613F\u7684\u8BDD\u8BED\u3002"), (true));
				}
			}
		}
	}
}
