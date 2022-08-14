package com.mitebemodding.hopful.client.renderer.armor;

import com.mitebemodding.hopful.client.model.armor.RabbitArmorModel;
import com.mitebemodding.hopful.common.item.RabbitArmorItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RabbitArmorRenderer extends GeoArmorRenderer<RabbitArmorItem> {
	public RabbitArmorRenderer() {
		super(new RabbitArmorModel());

		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.leftArmBone = "armorLeftArm";
		this.rightArmBone = "armorRightArm";
		this.leftLegBone = "armorLeftLeg";
		this.rightLegBone =  "armorRightLeg";
		this.leftBootBone = "armorLeftBoot";
		this.rightBootBone = "armorRightBoot";
	}

	@Override
	public RenderType getRenderType(RabbitArmorItem animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		return RenderType.entityCutoutNoCull(textureLocation);
	}
}
