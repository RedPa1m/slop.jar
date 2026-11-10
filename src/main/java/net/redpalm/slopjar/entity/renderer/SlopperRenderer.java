package net.redpalm.slopjar.entity.renderer;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.redpalm.slopjar.entity.custom.SlopperEntity;

public class SlopperRenderer extends HumanoidMobRenderer<SlopperEntity, PlayerModel<SlopperEntity>> {
    public SlopperRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SlopperEntity slopperEntity) {
        return ResourceLocation.fromNamespaceAndPath("slopjar","textures/entity/slopper.png");
    }
}
