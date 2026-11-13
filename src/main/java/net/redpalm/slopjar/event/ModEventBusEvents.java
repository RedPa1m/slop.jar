package net.redpalm.slopjar.event;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
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

    @SubscribeEvent
    public static void spawnPlacements (SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.FRENCHMAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.SLOPPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.AYCABRON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}
