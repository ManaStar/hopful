package com.mitebemodding.hopful.core.registry;

import com.mitebemodding.hopful.common.item.RabbitArmorItem;
import com.mitebemodding.hopful.common.item.material.RabbitArmorMaterial;
import com.mitebemodding.hopful.core.Hopful;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class HopfulItems {
	public static final Item RABBIT_TUFT = new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));
	public static final RabbitArmorItem RABBIT_MASK = new RabbitArmorItem(new RabbitArmorMaterial(), EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).durability(128));

	public static void register(Item item, String id) {
		Registry.register(Registry.ITEM, new ResourceLocation(Hopful.MOD_ID, id), item);
	}

	public static void init() {
		register(RABBIT_TUFT, "rabbit_tuft");
		register(RABBIT_MASK, "rabbit_mask");
	}
}
