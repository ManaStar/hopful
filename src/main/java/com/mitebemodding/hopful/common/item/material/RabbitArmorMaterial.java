package com.mitebemodding.hopful.common.item.material;

import com.mitebemodding.hopful.core.registry.HopfulItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class RabbitArmorMaterial implements ArmorMaterial {
	private static final int[] DURABILITY_VALUES = {0, 0, 0, 8};
	private static final int[] PROTECTION_VALUES = {0, 0, 0, 2};

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return DURABILITY_VALUES[slot.getIndex()];
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return 18;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ARMOR_EQUIP_LEATHER;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.of(HopfulItems.RABBIT_TUFT);
	}

	@Override
	public String getName() {
		return "rabbit";
	}

	@Override
	public float getToughness() {
		return 0;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}
