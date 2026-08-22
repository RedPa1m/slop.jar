package net.redpalm.slopjar.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.ModEntities;
import net.redpalm.slopjar.entity.custom.HorsEntity;

@Mod.EventBusSubscriber(modid = SlopJar.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HORS.get(), HorsEntity.createAttributes().build());
    }

}
