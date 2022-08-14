package com.mitebemodding.hopful.client;

import com.mitebemodding.hopful.client.renderer.armor.RabbitArmorRenderer;
import com.mitebemodding.hopful.core.registry.HopfulItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HopfulClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		GeoArmorRenderer.registerArmorRenderer(new RabbitArmorRenderer(), HopfulItems.RABBIT_MASK);
	}
}
