package net.redpalm.slopjar.entity.renderer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.custom.ScaryFaceEntity;
import net.redpalm.slopjar.entity.model.ScaryFaceModel;

public class ScaryFaceRenderer extends MobRenderer<ScaryFaceEntity, ScaryFaceModel<ScaryFaceEntity>> {
    public ScaryFaceRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ScaryFaceModel<>(pContext.bakeLayer(ScaryFaceModel.LAYER_LOCATION)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ScaryFaceEntity scaryFaceEntity) {
        return ResourceLocation.fromNamespaceAndPath(SlopJar.MODID, "textures/entity/scaryface.png");
    }

}
