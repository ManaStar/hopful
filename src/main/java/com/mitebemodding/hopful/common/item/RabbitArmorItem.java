package com.mitebemodding.hopful.common.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class RabbitArmorItem extends ArmorItem implements IAnimatable {
	private final AnimationFactory factory = new AnimationFactory(this);
	public RabbitArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties) {
		super(armorMaterial, equipmentSlot, properties);
	}

	private <P extends IAnimatable> PlayState animations(AnimationEvent<P> event) {
		return PlayState.CONTINUE;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void registerControllers(AnimationData animationData) {
		animationData.addAnimationController(new AnimationController(this, "controller", 20, this::animations));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
}
