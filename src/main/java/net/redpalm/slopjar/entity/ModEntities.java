package net.redpalm.slopjar.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.custom.*;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlopJar.MODID);

    public static final RegistryObject<EntityType<HorsEntity>> HORS =
            ENTITY_TYPES.register("hors", () -> EntityType.Builder.of(HorsEntity::new, MobCategory.MONSTER)
                    .sized(1.75f, 1.75f).build("hors"));
    public static final RegistryObject<EntityType<SlopperEntity>> SLOPPER =
            ENTITY_TYPES.register("slopper", () -> EntityType.Builder.of(SlopperEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.75f).build("slopper"));
    public static final RegistryObject<EntityType<FrenchManEntity>> FRENCHMAN =
            ENTITY_TYPES.register("frenchman", () -> EntityType.Builder.of(FrenchManEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.75f).build("frenchman"));
    public static final RegistryObject<EntityType<AyCabronEntity>> AYCABRON =
            ENTITY_TYPES.register("aycabron", () -> EntityType.Builder.of(AyCabronEntity::new, MobCategory.CREATURE)
                    .sized(1.75f, 1.75f).build("aycabron"));
    public static final RegistryObject<EntityType<ScaryFaceEntity>> SCARYFACE =
            ENTITY_TYPES.register("scaryface", () -> EntityType.Builder.of(ScaryFaceEntity::new, MobCategory.CREATURE)
                    .sized(1.75f, 1.75f).build("scaryface"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
