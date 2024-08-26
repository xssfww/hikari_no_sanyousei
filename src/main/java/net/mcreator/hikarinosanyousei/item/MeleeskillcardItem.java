
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.hikarinosanyousei.procedures.MeleeskillcardDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.procedures.MeleeskillcardDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.MeleeskillcardDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure;

import java.util.List;

public class MeleeskillcardItem extends Item {
	public MeleeskillcardItem() {
		super(new Item.Properties().tab(null).durability(200).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5DE6\u952E\u4EE5\u5BF9\u76EE\u6807\u65BD\u5C55\u4F53\u672F\u6253\u51FB\uFF0C\u53F3\u952E\u4EE5\u77ED\u6682\u84C4\u529B\uFF0C\u5411\u524D\u65B9\u51B2\u649E\u3002"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MeleeskillcardDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MeleeskillcardDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MeleeskillcardDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(entity);
	}
}
