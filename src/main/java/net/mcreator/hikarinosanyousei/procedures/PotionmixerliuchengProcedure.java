package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

import java.util.function.Supplier;
import java.util.Map;

public class PotionmixerliuchengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem() == HikariNoSanyouseiModItems.PROPERTYCHANGESREAGENTS.get()) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(3) >= 2) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == HikariNoSanyouseiModItems.MANA_POTION.get()) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MANAPOWERPOTION.get());
							_setstack.setCount(1);
							((Slot) _slots.get(0)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(3)).remove(2);
							_player.containerMenu.broadcastChanges();
						}
					} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == HikariNoSanyouseiModItems.MANA_POTION.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(3)).remove(2);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ERR_POTION.get());
							_setstack.setCount(1);
							((Slot) _slots.get(0)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == HikariNoSanyouseiModItems.MANA_POTION.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.MANAPOWERPOTION.get());
							_setstack.setCount(1);
							((Slot) _slots.get(0)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(3)).remove(2);
							_player.containerMenu.broadcastChanges();
						}
					} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == HikariNoSanyouseiModItems.POWERPOTION.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(3)).remove(2);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.ERR_POTION.get());
							_setstack.setCount(1);
							((Slot) _slots.get(0)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}
}
