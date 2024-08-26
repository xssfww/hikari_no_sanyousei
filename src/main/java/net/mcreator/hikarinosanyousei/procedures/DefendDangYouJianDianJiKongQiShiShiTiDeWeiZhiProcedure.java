package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;

public class DefendDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DEFENDBUF.get()) : false) == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(HikariNoSanyouseiModMobEffects.DEFENDBUF.get());
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(HikariNoSanyouseiModMobEffects.DEFENDBUF.get(), 200, 1));
		}
	}
}
