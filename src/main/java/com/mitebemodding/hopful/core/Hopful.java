package com.mitebemodding.hopful.core;

import com.mitebemodding.hopful.core.registry.HopfulBlocks;
import com.mitebemodding.hopful.core.registry.HopfulItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hopful implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Hopful");
	public static final String MOD_ID = "hopful";

	@Override
	public void onInitialize(ModContainer mod) {
		HopfulBlocks.init();
		HopfulItems.init();

		FlammableBlockRegistry.getDefaultInstance().add(HopfulBlocks.RABBIT_TUFT_BLOCK, 40, 20);
		FuelRegistry.INSTANCE.add(HopfulItems.RABBIT_TUFT, 150);
		FuelRegistry.INSTANCE.add(HopfulBlocks.RABBIT_TUFT_BLOCK.asItem(), 1400);
	}
}
