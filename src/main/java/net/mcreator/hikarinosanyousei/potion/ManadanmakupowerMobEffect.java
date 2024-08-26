
package net.mcreator.hikarinosanyousei.potion;

import net.minecraftforge.client.EffectRenderer;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiComponent;

import net.mcreator.hikarinosanyousei.procedures.ManadanmakupowerDangXiaoGuoJieShuShiProcedure;
import net.mcreator.hikarinosanyousei.procedures.DanmakuPowerZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class ManadanmakupowerMobEffect extends MobEffect {
	public ManadanmakupowerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -8060944);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hikari_no_sanyousei.manadanmakupower";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DanmakuPowerZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ManadanmakupowerDangXiaoGuoJieShuShiProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.EffectRenderer> consumer) {
		consumer.accept(new EffectRenderer() {
			@Override
			public boolean shouldRender(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean shouldRenderInvText(MobEffectInstance effect) {
				return false;
			}

			@Override
			public void renderInventoryEffect(MobEffectInstance effect, EffectRenderingInventoryScreen<?> gui, PoseStack mStack, int x, int y, float z) {
			}

			@Override
			public void renderHUDEffect(MobEffectInstance effect, GuiComponent gui, PoseStack mStack, int x, int y, float z, float alpha) {
			}
		});
	}
}
