package net.mcreator.hikarinosanyousei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.hikarinosanyousei.network.HikariNoSanyouseiModVariables;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModItems;

public class ReimuxuanzeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HikariNoSanyouseiModVariables.PlayerVariables())).sanyousei == 555) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HikariNoSanyouseiModItems.SPELLCARDDREAMSEAL.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 7, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hikari_no_sanyousei:spellcard")), SoundSource.PLAYERS, 7, 1, false);
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
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), 600);
						{
							boolean _setval = true;
							entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.spellcard = _setval;
								capability.syncPlayerVariables(entity);
							});
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
								if (entity instanceof Player _player)
									_player.getCooldowns().addCooldown(itemstack.getItem(), 600);
								{
									boolean _setval = false;
									entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.spellcard = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 400);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 30);
			} else {
				Amulet1DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity, itemstack);
				Amulet2DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity, itemstack);
				Amulet3DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity, itemstack);
			}
		} else {
			{
				double _setval = 555;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sanyousei = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1800;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.flypower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1800;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nenglipower = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.use_sanyousei = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(HikariNoSanyouseiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.use_sanyousei = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u535A\u4E3D\u7684\u5DEB\u5973\uFF0C\u300E\u535A\u4E3D\u7075\u68A6\u300F\u3002"), (false));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u53C8\u662F\u5F02\u53D8\u5417..."), (false));
		}
	}
}
