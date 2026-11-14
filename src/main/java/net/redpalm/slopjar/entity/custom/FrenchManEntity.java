package net.redpalm.slopjar.entity.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.redpalm.slopjar.entity.base.BaseAggressiveMonster;

public class FrenchManEntity extends BaseAggressiveMonster {

    @Override
    public boolean isStalkingType() {
        return true;
    }

    @Override
    public boolean initiateChaseSequence() {
        return true;
    }

    @Override
    public void tick() {
        if (timeAlive == 0) {
            saySpeech();
            this.playSound(SoundEvents.AMBIENT_CAVE.get(), 2, 0.8f);
        }
        super.tick();
    }

    public void saySpeech () {
        if (!level().isClientSide)
            level().getServer().getPlayerList().broadcastSystemMessage
                    (Component.literal("FRANCE"), false);
    }

    public FrenchManEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 50D)
                .add(Attributes.FOLLOW_RANGE, 100f)
                .add(Attributes.MOVEMENT_SPEED, 1.2f)
                .add(Attributes.ATTACK_DAMAGE, 8f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f);
    }

    @Override
    public boolean shouldDropExperience() {
        return false;
    }
}
