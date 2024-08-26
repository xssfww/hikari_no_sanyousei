
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

import net.mcreator.hikarinosanyousei.procedures.ChahufangzhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class TeacupemptyitemItem extends Item {
	public TeacupemptyitemItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u5BF9\u4E86\uFF0C\u7ED9\u8336\u58F6\u52A0\u8336\u7684\u8BDD\u76F4\u63A5\u5012\u6C34\u5C31\u884C\u4E86\u3002\u91CC\u9762\u6709\u5185\u7F6E\u7684\u8336\u53F6\u683C\uFF0C\u5F88\u65B9\u4FBF\u5427\uFF1F\u2014\u2014\u65AF\u5854"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChahufangzhiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
