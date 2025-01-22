
package net.mcreator.housearrest.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.housearrest.entity.FeralWolfNovaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FeralWolfNovaRenderer extends HumanoidMobRenderer<FeralWolfNovaEntity, HumanoidModel<FeralWolfNovaEntity>> {
	public FeralWolfNovaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<FeralWolfNovaEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<FeralWolfNovaEntity, HumanoidModel<FeralWolfNovaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("house_arrest:textures/entities/temp.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FeralWolfNovaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FeralWolfNovaEntity entity) {
		return new ResourceLocation("house_arrest:textures/entities/temp.png");
	}
}
