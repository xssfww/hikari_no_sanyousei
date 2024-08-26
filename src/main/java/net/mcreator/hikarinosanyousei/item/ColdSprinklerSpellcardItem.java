
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

import net.mcreator.hikarinosanyousei.procedures.ColdSprinklerSpellcardDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

import java.util.List;

public class ColdSprinklerSpellcardItem extends Item {
	public ColdSprinklerSpellcardItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_HIKARISANYOUSEIFIGHT).durability(3).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u4EC5\u742A\u9732\u8BFA\u4F7F\u7528"));
		list.add(new TextComponent("\u4F7F\u7528\u540E\u77ED\u6682\u84C4\u529B\uFF0C\u518D\u6B21\u53F3\u952E\u5C06\u4F7F\u7528\u5F3A\u529B\u51B0\u9525\u5C04\u5411\u524D\u65B9\u3002"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ColdSprinklerSpellcardDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
