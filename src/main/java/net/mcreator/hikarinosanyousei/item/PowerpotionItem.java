
package net.mcreator.hikarinosanyousei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.hikarinosanyousei.procedures.PowerpotionDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;
import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModTabs;

public class PowerpotionItem extends Item {
	public PowerpotionItem() {
		super(new Item.Properties().tab(HikariNoSanyouseiModTabs.TAB_POTION).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PowerpotionDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z, entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PowerpotionDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
