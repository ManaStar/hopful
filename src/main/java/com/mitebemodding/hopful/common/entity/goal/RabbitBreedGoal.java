package com.mitebemodding.hopful.common.entity.goal;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.animal.Animal;

public class RabbitBreedGoal extends BreedGoal {
	public RabbitBreedGoal(Animal animal, double d) {
		super(animal, d);
	}

	@Override
	protected void breed() {
		int offSpringCount = Mth.clamp(animal.getRandom().nextInt(7), 2, 6);

		for (int i = 0; i < offSpringCount + 1; i++) {
			super.breed();
		}
	}
}
