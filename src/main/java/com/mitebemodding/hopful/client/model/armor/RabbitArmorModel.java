package com.mitebemodding.hopful.client.model.armor;

import com.mitebemodding.hopful.common.item.RabbitArmorItem;
import com.mitebemodding.hopful.core.Hopful;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RabbitArmorModel extends AnimatedGeoModel<RabbitArmorItem> {
	@Override
	public ResourceLocation getModelResource(RabbitArmorItem object) {
		return new ResourceLocation(Hopful.MOD_ID, "geo/rabbit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RabbitArmorItem object) {
		return new ResourceLocation(Hopful.MOD_ID, "textures/item/rabbit_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(RabbitArmorItem animatable) {
		return new ResourceLocation(Hopful.MOD_ID, "animations/rabbit_armor.animation.json");
	}
}
