package net.mcreator.hikarinosanyousei.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.hikarinosanyousei.item.LoukankenItem;

public class LoukankenItemModel extends AnimatedGeoModel<LoukankenItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(LoukankenItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "animations/loukanken.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LoukankenItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "geo/loukanken.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LoukankenItem animatable) {
		return new ResourceLocation("hikari_no_sanyousei", "textures/items/youmu.png");
	}
}
