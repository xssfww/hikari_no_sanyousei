
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

import net.mcreator.hikarinosanyousei.procedures.PenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class PenItem extends Item {
	public PenItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).durability(11).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5199\u5404\u79CD\u4E1C\u897F\u90FD\u9700\u8981\u3002\u5982\u679C\u6CA1\u58A8\u4E86\uFF0C\u7528\u58A8\u56CA\u88C5\u586B\u4E00\u4E0B\u5C31\u53EF\u4EE5\u4E86\u54E6\u3002\u2014\u2014\u65AF\u5854"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
