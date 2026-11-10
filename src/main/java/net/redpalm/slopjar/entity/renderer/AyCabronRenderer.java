package net.redpalm.slopjar.entity.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.custom.AyCabronEntity;
import net.redpalm.slopjar.entity.model.AyCabronModel;

public class AyCabronRenderer extends MobRenderer<AyCabronEntity, AyCabronModel <AyCabronEntity>> {
    public AyCabronRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AyCabronModel<>(pContext.bakeLayer(AyCabronModel.LAYER_LOCATION)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(AyCabronEntity ayCabronEntity) {
        return ResourceLocation.fromNamespaceAndPath(SlopJar.MODID, "textures/entity/aycabron.png");
    }
}
