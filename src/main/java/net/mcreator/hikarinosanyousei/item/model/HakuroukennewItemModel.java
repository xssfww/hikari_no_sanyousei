package net.mcreator.hikarinosanyousei.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.hikarinosanyousei.item.HakuroukennewItem;

public class HakuroukennewItemModel extends AnimatedGeoModel<HakuroukennewItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(HakuroukennewItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "animations/hakurouken.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(HakuroukennewItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "geo/hakurouken.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(HakuroukennewItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "textures/items/youmu.png");
	}
}
