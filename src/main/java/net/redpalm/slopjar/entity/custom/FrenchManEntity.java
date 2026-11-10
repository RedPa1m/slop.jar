package net.redpalm.slopjar.entity.custom;

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

    public FrenchManEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 50D)
                .add(Attributes.FOLLOW_RANGE, 100f)
                .add(Attributes.MOVEMENT_SPEED, 1f)
                .add(Attributes.ATTACK_DAMAGE, 8f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f);
    }

    @Override
    public boolean shouldDropExperience() {
        return false;
    }
}
