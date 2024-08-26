
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

import net.mcreator.hikarinosanyousei.procedures.StarlasershiyongProcedure;
import net.mcreator.hikarinosanyousei.procedures.SpellcardstarlaserDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.SpellcardstarlaserDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class SpellcardstarlaserItem extends Item {
	public SpellcardstarlaserItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).durability(3).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4EC5\u65AF\u5854\u8428\u83F2\u96C5\u4F7F\u7528"));
		list.add(new TextComponent("\u4F7F\u7528\u540E\u77ED\u6682\u84C4\u529B\uFF0C\u518D\u6B21\u53F3\u952E\u5C06\u4F7F\u7528\u6FC0\u5149\u8F70\u51FB\u524D\u65B9\u533A\u57DF\u3002"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		StarlasershiyongProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		StarlasershiyongProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SpellcardstarlaserDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		SpellcardstarlaserDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
	}
}
