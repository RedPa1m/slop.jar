package net.redpalm.slopjar.event;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
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
            if (horse.level().getRandom().nextInt(2) != 0) return;
            double x = horse.getX();
            double y = horse.getY();
            double z = horse.getZ();
            HorsEntity entity = ModEntities.HORS.get().create(horse.level());
            entity.setPos(x, y, z);
            if (entity == null) return;
            horse.level().addFreshEntity(entity);
        }
    }

    @SubscribeEvent
    public static void levelTickEvent (TickEvent.LevelTickEvent tick) {
        if (tick.phase != TickEvent.Phase.END) return;
        if (!(tick.level instanceof ServerLevel)) return;
        if (tick.level.isClientSide) return;
        if (tick.level.dimension() != Level.OVERWORLD) return;
        if (tick.level.getServer().getPlayerList().getPlayers().isEmpty()) return;

        if (tick.level.getGameTime() % 12000 == 0 && tick.level.random.nextInt(5) == 0) {
            int x = tick.level.random.nextInt(5);
            switch (x) {
                case 0:
                    broadcastMessage(tick, "Geometry Dash");
                    break;
                case 1:
                    broadcastMessage(tick, "Minecraft");
                    break;
                case 2:
                    broadcastMessage(tick, "Videogaem");
                    break;
                case 3:
                    broadcastMessage(tick, "контр страйк");
                    break;
                case 4:
                    broadcastMessage(tick, "RuPaul's Drag Race");
                    break;
            }
        }

    }

    public static void broadcastMessage (TickEvent.LevelTickEvent tick, String speech) {
        tick.level.getServer().getPlayerList().broadcastSystemMessage
                (Component.literal(speech), false);
    }

}
