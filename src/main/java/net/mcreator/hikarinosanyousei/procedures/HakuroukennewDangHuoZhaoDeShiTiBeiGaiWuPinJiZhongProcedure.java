package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class HakuroukennewDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 0.5) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("hakurouken").bypassArmor(), 5);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("hakurouken").bypassArmor(), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 5 + 5));
		}
	}
}
