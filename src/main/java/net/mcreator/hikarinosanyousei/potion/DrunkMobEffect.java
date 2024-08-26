
package net.mcreator.hikarinosanyousei.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.hikarinosanyousei.procedures.DrunkZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;

public class DrunkMobEffect extends MobEffect {
	public DrunkMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hikari_no_sanyousei.drunk";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DrunkZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
