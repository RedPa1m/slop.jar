package net.redpalm.slopjar.entity.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.custom.HorsEntity;
import net.redpalm.slopjar.entity.model.HorsModel;

public class HorsRenderer extends MobRenderer<HorsEntity, HorsModel<HorsEntity>> {
    public HorsRenderer(EntityRendererProvider.Context context) {
        super(context, new HorsModel<>(context.bakeLayer(HorsModel.LAYER_LOCATION)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(HorsEntity horsEntity) {
        return ResourceLocation.fromNamespaceAndPath(SlopJar.MODID, "textures/entity/hors.png");
    }
}
