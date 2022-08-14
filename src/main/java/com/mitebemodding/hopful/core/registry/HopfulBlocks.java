package com.mitebemodding.hopful.core.registry;

import com.mitebemodding.hopful.core.Hopful;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class HopfulBlocks {
	public static final Block RABBIT_TUFT_BLOCK = new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.RAW_IRON).sound(SoundType.WOOL).strength(0.7F));

	public static void registerBlockWithItem(String id, Block block, CreativeModeTab tab) {
		Registry.register(Registry.BLOCK, new ResourceLocation(Hopful.MOD_ID, id), block);
		HopfulItems.register(new BlockItem(block, new Item.Properties().tab(tab)), id);
	}

	public static void init() {
		registerBlockWithItem("rabbit_tuft_block", RABBIT_TUFT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	}
}
