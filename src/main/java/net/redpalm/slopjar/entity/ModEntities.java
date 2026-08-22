package net.redpalm.slopjar.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.custom.HorsEntity;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlopJar.MODID);

    public static final RegistryObject<EntityType<HorsEntity>> HORS =
            ENTITY_TYPES.register("hors", () -> EntityType.Builder.of(HorsEntity::new, MobCategory.MONSTER)
                    .sized(1.75f, 1.75f).build("hors"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
