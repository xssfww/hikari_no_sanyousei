package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class MilkemptyDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET) {
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u563F\u54BB\uFF0C\u5C31\u7528\u6211\u7684\u9633\u5149\u704C\u6CE8\u8FDB\u8FD9\u4E9B\u725B\u5976\u91CC\u5427\u3002"), (false));
				}
				if ((new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get())).getCount() >= 4) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 4, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.SUNNYMILK.get());
						_setstack.setCount(4);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.SUNNYMILK.get());
						_setstack.setCount((new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get())).getCount());
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get())).getCount(), _player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u4E2A\u74F6\u5B50...\u8BA9\u6851\u5C3C\u6765\u5427\u3002"), (false));
				}
			} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u5514...\u5F80\u91CC\u9762\u5012\u725B\u5976\u8FD8\u9700\u8981\u501F\u52A9\u6851\u5C3C\u7684\u9633\u5149\u5462\u3002"), (false));
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.CHERRYBLOSSOMBRANCHES.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HikariNoSanyouseiModItems.SUNNYMILKEMPTY.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).config_say) {
				if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u628A\u6A31\u82B1\u679D\u63D2\u8FDB\u53BB\u5C31\u884C\u4E86\uFF0C\u63A5\u4E0B\u6765\u5C31\u662F\u7B49\u5F85\u4E86\u3002"), (false));
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 2) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u53EA\u8981\u8FD9\u6839\u679D\u6761\u5F00\u653E\u4E86\uFF0C\u8BF4\u4E0D\u5B9A\u5C31\u80FD\u9884\u793A\u5230\u6625\u5929\u7684\u5230\u6765\u4E86\u5462\u3002"), (false));
				} else if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 3) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u8FD9\u6837\u5C31\u884C\u4E86\u5462\uFF0C\u7B49\u5230\u5F00\u653E\u5427\u3002"), (false));
				}
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(HikariNoSanyouseiModItems.INSERTA_SUNNYMILKBOTTLEINTOACHERRYBLOSSOMBRANCH.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue(9600);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 1);
		}
	}
}
