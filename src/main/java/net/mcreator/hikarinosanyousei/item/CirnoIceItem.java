
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.CirnoicedangyoujianProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class CirnoIceItem extends Item {
	public CirnoIceItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4EE3\u8868\u7740\u7EDD\u5BF9\u96F6\u5EA6\u7684\u51B0"));
		list.add(new TextComponent("\u53F3\u952E\u6D88\u8017\u4EE5\u53D8\u4E3A\u51B0\u4E4B\u5996\u7CBE\u6A21\u5F0F"));
		list.add(new TextComponent("\u51B0\u4E4B\u5996\u7CBE\u300E\u742A\u9732\u8BFA\u300F\u80FD\u529B\u4ECB\u7ECD\uFF1A"));
		list.add(new TextComponent("\u64CD\u7EB5\u51B0\u7A0B\u5EA6\u7684\u80FD\u529B\uFF0C\u80FD\u591F\u521B\u9020\u51FA\u51B0\u3002"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CirnoicedangyoujianProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CirnoicedangyoujianProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
