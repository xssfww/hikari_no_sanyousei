package net.mcreator.hikarinosanyousei.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.hikarinosanyousei.HikariNoSanyouseiMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HikariNoSanyouseiModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		HikariNoSanyouseiMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		HikariNoSanyouseiMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.sanyousei = original.sanyousei;
			clone.use_sanyousei = original.use_sanyousei;
			clone.shootingsapphirenaijiu = original.shootingsapphirenaijiu;
			clone.other_charater = original.other_charater;
			clone.flyon = original.flyon;
			clone.config_say = original.config_say;
			clone.marisa_skill1 = original.marisa_skill1;
			clone.marisa_skill2 = original.marisa_skill2;
			clone.config_mp = original.config_mp;
			if (!event.isWasDeath()) {
				clone.flypower = original.flypower;
				clone.nenglipower = original.nenglipower;
				clone.flymode = original.flymode;
				clone.nenglimode = original.nenglimode;
				clone.reg = original.reg;
				clone.spellcard_number = original.spellcard_number;
				clone.lnx = original.lnx;
				clone.lny = original.lny;
				clone.lnz = original.lnz;
				clone.niyousei_nengli = original.niyousei_nengli;
				clone.melee = original.melee;
				clone.meleecishu = original.meleecishu;
				clone.meleexuli = original.meleexuli;
				clone.drunk = original.drunk;
				clone.youmu_two_sword = original.youmu_two_sword;
				clone.spellcard = original.spellcard;
				clone.magic = original.magic;
				clone.powertime = original.powertime;
				clone.yin = original.yin;
				clone.zin = original.zin;
				clone.hakkero_laser = original.hakkero_laser;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "hikari_no_sanyousei_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "hikari_no_sanyousei_mapvars";
		public double xin = 0;
		public double player_mp_max = 0;
		public double player_fly_max = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			xin = nbt.getDouble("xin");
			player_mp_max = nbt.getDouble("player_mp_max");
			player_fly_max = nbt.getDouble("player_fly_max");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("xin", xin);
			nbt.putDouble("player_mp_max", player_mp_max);
			nbt.putDouble("player_fly_max", player_fly_max);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("hikari_no_sanyousei", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double sanyousei = 0;
		public double flypower = 0.0;
		public double nenglipower = 0.0;
		public boolean flymode = false;
		public boolean nenglimode = false;
		public double reg = 0;
		public boolean use_sanyousei = false;
		public double spellcard_number = 0;
		public double lnx = 0;
		public double lny = 0;
		public double lnz = 0;
		public double shootingsapphirenaijiu = 5.0;
		public boolean niyousei_nengli = false;
		public boolean other_charater = false;
		public double melee = 0;
		public double meleecishu = 0;
		public boolean meleexuli = false;
		public double drunk = 0;
		public boolean youmu_two_sword = false;
		public boolean spellcard = false;
		public double magic = 0;
		public boolean flyon = false;
		public double powertime = 0;
		public double yin = 0;
		public double zin = 0;
		public boolean hakkero_laser = false;
		public boolean config_say = false;
		public ItemStack marisa_skill1 = ItemStack.EMPTY;
		public ItemStack marisa_skill2 = ItemStack.EMPTY;
		public boolean config_mp = true;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				HikariNoSanyouseiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("sanyousei", sanyousei);
			nbt.putDouble("flypower", flypower);
			nbt.putDouble("nenglipower", nenglipower);
			nbt.putBoolean("flymode", flymode);
			nbt.putBoolean("nenglimode", nenglimode);
			nbt.putDouble("reg", reg);
			nbt.putBoolean("use_sanyousei", use_sanyousei);
			nbt.putDouble("spellcard_number", spellcard_number);
			nbt.putDouble("lnx", lnx);
			nbt.putDouble("lny", lny);
			nbt.putDouble("lnz", lnz);
			nbt.putDouble("shootingsapphirenaijiu", shootingsapphirenaijiu);
			nbt.putBoolean("niyousei_nengli", niyousei_nengli);
			nbt.putBoolean("other_charater", other_charater);
			nbt.putDouble("melee", melee);
			nbt.putDouble("meleecishu", meleecishu);
			nbt.putBoolean("meleexuli", meleexuli);
			nbt.putDouble("drunk", drunk);
			nbt.putBoolean("youmu_two_sword", youmu_two_sword);
			nbt.putBoolean("spellcard", spellcard);
			nbt.putDouble("magic", magic);
			nbt.putBoolean("flyon", flyon);
			nbt.putDouble("powertime", powertime);
			nbt.putDouble("yin", yin);
			nbt.putDouble("zin", zin);
			nbt.putBoolean("hakkero_laser", hakkero_laser);
			nbt.putBoolean("config_say", config_say);
			nbt.put("marisa_skill1", marisa_skill1.save(new CompoundTag()));
			nbt.put("marisa_skill2", marisa_skill2.save(new CompoundTag()));
			nbt.putBoolean("config_mp", config_mp);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			sanyousei = nbt.getDouble("sanyousei");
			flypower = nbt.getDouble("flypower");
			nenglipower = nbt.getDouble("nenglipower");
			flymode = nbt.getBoolean("flymode");
			nenglimode = nbt.getBoolean("nenglimode");
			reg = nbt.getDouble("reg");
			use_sanyousei = nbt.getBoolean("use_sanyousei");
			spellcard_number = nbt.getDouble("spellcard_number");
			lnx = nbt.getDouble("lnx");
			lny = nbt.getDouble("lny");
			lnz = nbt.getDouble("lnz");
			shootingsapphirenaijiu = nbt.getDouble("shootingsapphirenaijiu");
			niyousei_nengli = nbt.getBoolean("niyousei_nengli");
			other_charater = nbt.getBoolean("other_charater");
			melee = nbt.getDouble("melee");
			meleecishu = nbt.getDouble("meleecishu");
			meleexuli = nbt.getBoolean("meleexuli");
			drunk = nbt.getDouble("drunk");
			youmu_two_sword = nbt.getBoolean("youmu_two_sword");
			spellcard = nbt.getBoolean("spellcard");
			magic = nbt.getDouble("magic");
			flyon = nbt.getBoolean("flyon");
			powertime = nbt.getDouble("powertime");
			yin = nbt.getDouble("yin");
			zin = nbt.getDouble("zin");
			hakkero_laser = nbt.getBoolean("hakkero_laser");
			config_say = nbt.getBoolean("config_say");
			marisa_skill1 = ItemStack.of(nbt.getCompound("marisa_skill1"));
			marisa_skill2 = ItemStack.of(nbt.getCompound("marisa_skill2"));
			config_mp = nbt.getBoolean("config_mp");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.sanyousei = message.data.sanyousei;
					variables.flypower = message.data.flypower;
					variables.nenglipower = message.data.nenglipower;
					variables.flymode = message.data.flymode;
					variables.nenglimode = message.data.nenglimode;
					variables.reg = message.data.reg;
					variables.use_sanyousei = message.data.use_sanyousei;
					variables.spellcard_number = message.data.spellcard_number;
					variables.lnx = message.data.lnx;
					variables.lny = message.data.lny;
					variables.lnz = message.data.lnz;
					variables.shootingsapphirenaijiu = message.data.shootingsapphirenaijiu;
					variables.niyousei_nengli = message.data.niyousei_nengli;
					variables.other_charater = message.data.other_charater;
					variables.melee = message.data.melee;
					variables.meleecishu = message.data.meleecishu;
					variables.meleexuli = message.data.meleexuli;
					variables.drunk = message.data.drunk;
					variables.youmu_two_sword = message.data.youmu_two_sword;
					variables.spellcard = message.data.spellcard;
					variables.magic = message.data.magic;
					variables.flyon = message.data.flyon;
					variables.powertime = message.data.powertime;
					variables.yin = message.data.yin;
					variables.zin = message.data.zin;
					variables.hakkero_laser = message.data.hakkero_laser;
					variables.config_say = message.data.config_say;
					variables.marisa_skill1 = message.data.marisa_skill1;
					variables.marisa_skill2 = message.data.marisa_skill2;
					variables.config_mp = message.data.config_mp;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
