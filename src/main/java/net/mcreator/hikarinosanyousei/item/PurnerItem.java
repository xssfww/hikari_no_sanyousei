
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.PurnerDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class PurnerItem extends Item {
	public PurnerItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5982\u679C\u9700\u8981\u8611\u83C7\u7684\u8BDD\u5C31\u53EF\u4EE5\u7528\u8FD9\u628A\u526A\u5B50\u6765\u4FEE\u526A\u8611\u83C7\u76C6\u683D\u5566\u3002\u2014\u2014\u65AF\u5854"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PurnerDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
