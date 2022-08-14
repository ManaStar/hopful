package com.mitebemodding.hopful.core.mixin;

import com.mitebemodding.hopful.common.entity.goal.RabbitBreedGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.GoalSelector;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Rabbit.class)
public abstract class RabbitMixin extends Animal {

	protected RabbitMixin(EntityType<? extends Animal> entityType, Level level) {
		super(entityType, level);
	}

	@Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/goal/GoalSelector;addGoal(ILnet/minecraft/world/entity/ai/goal/Goal;)V", ordinal = 3), method = "registerGoals")
	private void redirectTargetGoal(GoalSelector goalSelector, int priority, Goal goal) {
		Goal newBreedGoal = new RabbitBreedGoal(this, 0);
		goalSelector.addGoal(2, newBreedGoal);
	}
}
