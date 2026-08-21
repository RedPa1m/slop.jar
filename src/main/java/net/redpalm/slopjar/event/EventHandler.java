package net.redpalm.slopjar.event;

import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redpalm.slopjar.SlopJar;
import net.redpalm.slopjar.entity.ModEntities;
import net.redpalm.slopjar.entity.custom.HorsEntity;

@Mod.EventBusSubscriber(modid = SlopJar.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void onHorseKill (LivingDeathEvent event) {
        if (event.getEntity() instanceof Horse horse) {
            double x = horse.getX();
            double y = horse.getY();
            double z = horse.getZ();
            HorsEntity entity = ModEntities.HORS.get().create(horse.level());
            if (entity == null) return;
            horse.level().addFreshEntity(entity);
        }
    }

}
