
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.FluorescentlampDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class FluorescentlampItem extends Item {
	public FluorescentlampItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEI).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"\u4E00\u76F4\u95EA\u95EA\u53D1\u4EAE\u7684\u8367\u5149\u706F\uFF0C\u9B54\u7406\u6C99\u5C0F\u59D0\u4F3C\u4E4E\u5C06\u68EE\u6797\u4E2D\u7684\u5149\u90FD\u96C6\u4E2D\u5230\u8FD9\u91CC\u9762\u4E86\u3002\u2014\u2014\u9732\u5A1C"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FluorescentlampDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
