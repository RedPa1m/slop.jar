package net.redpalm.slopjar.entity.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.redpalm.slopjar.entity.base.BaseAggressiveMonster;

public class SlopperEntity extends BaseAggressiveMonster {

    public SlopperEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        if (timeAlive == 0)
        if (timeAlive % 20 == 0) playNoise();
        super.tick();
    }

    public void playNoise () {
        int x = random.nextInt(5);
        switch (x) {
            case 0: this.playSound(SoundEvents.CHICKEN_HURT, 2, 1);
            case 1: this.playSound(SoundEvents.COW_HURT, 2, 1);
            case 2: this.playSound(SoundEvents.PIG_DEATH, 2, 1);
            case 3: this.playSound(SoundEvents.HORSE_DEATH, 2, 1);
            case 4: this.playSound(SoundEvents.SHEEP_HURT, 2, 1);
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 100D)
                .add(Attributes.FOLLOW_RANGE, 100f)
                .add(Attributes.MOVEMENT_SPEED, 0.9f)
                .add(Attributes.ATTACK_DAMAGE, 8f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f);
    }

    @Override
    public boolean shouldDropExperience() {
        return false;
    }
}
