package net.redpalm.slopjar.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.ModEntities;
import net.redpalm.slopjar.entity.model.AyCabronModel;
import net.redpalm.slopjar.entity.model.HorsModel;
import net.redpalm.slopjar.entity.renderer.AyCabronRenderer;
import net.redpalm.slopjar.entity.renderer.FrenchManRenderer;
import net.redpalm.slopjar.entity.renderer.HorsRenderer;
import net.redpalm.slopjar.entity.renderer.SlopperRenderer;

@Mod.EventBusSubscriber(modid = SlopJar.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModBusClientEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(HorsModel.LAYER_LOCATION, HorsModel::createBodyLayer);
        event.registerLayerDefinition(AyCabronModel.LAYER_LOCATION, AyCabronModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.HORS.get(), HorsRenderer::new);
        event.registerEntityRenderer(ModEntities.SLOPPER.get(), SlopperRenderer::new);
        event.registerEntityRenderer(ModEntities.FRENCHMAN.get(), FrenchManRenderer::new);
        event.registerEntityRenderer(ModEntities.AYCABRON.get(), AyCabronRenderer::new);
    }
}
