
package net.mcreator.hikarinosanyousei.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.hikarinosanyousei.procedures.CirnofreezeZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;

public class CirnofreezeMobEffect extends MobEffect {
	public CirnofreezeMobEffect() {
		super(MobEffectCategory.HARMFUL, -6165761);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hikari_no_sanyousei.cirnofreeze";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CirnofreezeZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
