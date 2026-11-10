package net.redpalm.slopjar.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.ModEntities;
import net.redpalm.slopjar.entity.custom.AyCabronEntity;
import net.redpalm.slopjar.entity.custom.FrenchManEntity;
import net.redpalm.slopjar.entity.custom.HorsEntity;
import net.redpalm.slopjar.entity.custom.SlopperEntity;

@Mod.EventBusSubscriber(modid = SlopJar.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HORS.get(), HorsEntity.createAttributes().build());
        event.put(ModEntities.SLOPPER.get(), SlopperEntity.createAttributes().build());
        event.put(ModEntities.FRENCHMAN.get(), FrenchManEntity.createAttributes().build());
        event.put(ModEntities.AYCABRON.get(), AyCabronEntity.createAttributes().build());
    }

}
