package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModMobEffects;

public class DrunkZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 5) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, (false), (false)));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.CONFUSION) : false) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 4000, 1, (false), (false)));
			}
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 4) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, (false), (false)));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.CONFUSION) : false) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 4000, 1, (false), (false)));
			}
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 0, (false), (false)));
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 0, (false), (false)));
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()) ? _livEnt.getEffect(HikariNoSanyouseiModMobEffects.DRUNK.get()).getAmplifier() : 0) == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, (false), (false)));
		}
	}
}
