package com.mitebemodding.hopful.core.mixin;

import com.mitebemodding.hopful.core.registry.HopfulBlocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShearsItem.class)
public class ShearsItemMixin {

	@Inject(method = "getDestroySpeed", at = @At("RETURN"), cancellable = true)
	private void getDestroySpeed(ItemStack stack, BlockState state, CallbackInfoReturnable<Float> cir) {
		if (state.is(HopfulBlocks.RABBIT_TUFT_BLOCK)) {
			cir.setReturnValue(5.0F);
		}
	}
}
