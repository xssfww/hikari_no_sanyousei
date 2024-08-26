
package net.mcreator.hikarinosanyousei.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.hikarinosanyousei.procedures.DefendbufZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;
import net.mcreator.hikarinosanyousei.procedures.DefendbufDangXiaoGuoJieShuShiProcedure;

public class DefendbufMobEffect extends MobEffect {
	public DefendbufMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711694);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hikari_no_sanyousei.defendbuf";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DefendbufZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DefendbufDangXiaoGuoJieShuShiProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
