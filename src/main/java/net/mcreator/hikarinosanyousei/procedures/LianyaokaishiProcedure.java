package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModBlocks;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class LianyaokaishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(6) == 1) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x, y, z), "lianzhi")) == false) {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == HikariNoSanyouseiModBlocks.MAGICPOTWATER.get()) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
							.getItem() == HikariNoSanyouseiModItems.MANAPOTIONEMPTY.get()) {
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.CHARCOAL) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(4)).remove(1);
								_player.containerMenu.broadcastChanges();
							}
							ManayaoshuilianzhiProcedure.execute(world, x, y, z, entity);
						} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
								.getItem() == HikariNoSanyouseiModItems.MINI_HAKEERO.get()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(4)).getItem();
								if (stack != null) {
									if (stack.hurt(1, new Random(), null)) {
										stack.shrink(1);
										stack.setDamageValue(0);
									}
									_player.containerMenu.broadcastChanges();
								}
							}
							ManayaoshuilianzhiProcedure.execute(world, x, y, z, entity);
						} else {
							if (entity instanceof Player _player)
								_player.closeContainer();
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("\u6CA1\u6709\u71C3\u6599"), (true));
						}
					} else {
						if (entity instanceof Player _player)
							_player.closeContainer();
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u6CA1\u6709\u5BB9\u5668\u8FDB\u884C\u88C5\u586B"), (true));
					}
				} else {
					if (entity instanceof Player _player)
						_player.closeContainer();
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u6CA1\u6709\u6CE8\u6C34"), (true));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u5DF2\u7ECF\u5728\u70BC\u5236\u4E86"), (false));
			}
		} else {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u8BF7\u5148\u53D6\u51FA\u836F\u6C34"), (true));
		}
	}
}
