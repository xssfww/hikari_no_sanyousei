
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.SCMoonstillnessDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.SCMoonstillnessDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.MoonstillnessshiyongProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class SCMoonstillnessItem extends Item {
	public SCMoonstillnessItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).durability(3).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4EC5\u9732\u5A1C\u5207\u9732\u5FB7\u4F7F\u7528"));
		list.add(new TextComponent("\u4F7F\u7528\u5C06\u6BCF\u9694\u4E00\u6BB5\u65F6\u95F4\u4F7F\u7528\u6FC0\u5149\u8F70\u51FB\u524D\u65B9\u533A\u57DF"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MoonstillnessshiyongProcedure.execute(world, x, y, z, entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MoonstillnessshiyongProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SCMoonstillnessDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		SCMoonstillnessDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
	}
}
