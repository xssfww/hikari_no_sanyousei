package net.mcreator.hikarinosanyousei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.hikarinosanyousei.init.HikariNoSanyouseiModEntities;
import net.mcreator.hikarinosanyousei.entity.DanmaguEntity;

public class ShanxingdanmuceshiDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, 5, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(Math.cos(Math.acos(entity.getLookAngle().x / Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2))) + 45 * (Math.PI / 180)), (entity.getLookAngle().y),
					Math.sin(Math.asin(entity.getLookAngle().z / Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2))) + 45 * (Math.PI / 180)), 1, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DanmaguEntity(HikariNoSanyouseiModEntities.DANMAGU.get(), level);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, 5, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(Math.cos(Math.acos(entity.getLookAngle().x / Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2))) - 45 * (Math.PI / 180)), (entity.getLookAngle().y),
					Math.sin(Math.asin(entity.getLookAngle().z / Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2))) - 45 * (Math.PI / 180)), 1, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
