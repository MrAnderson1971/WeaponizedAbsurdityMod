package com.thomas.shampoo.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.thomas.shampoo.entity.Obama;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.thomas.shampoo.ShampooMod.MODID;

public class ObamaRenderer extends LivingEntityRenderer<Obama, PlayerlikeModel<Obama>> {
    private static final ResourceLocation OBAMA_TEXTURE = new ResourceLocation(MODID, "textures/entity/obama.png");

    public ObamaRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerlikeModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Obama entity) {
        return OBAMA_TEXTURE;
    }

    @Override
    protected void renderNameTag(@NotNull Obama entity, @NotNull Component displayName, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        // Do nothing, this will prevent the name tag from rendering
    }
}
