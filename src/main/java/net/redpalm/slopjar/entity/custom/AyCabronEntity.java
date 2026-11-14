package net.redpalm.slopjar.entity.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class AyCabronEntity extends PathfinderMob {
    private int timeAlive = 0;
    private int maxTimeAlive = 1200;

    public AyCabronEntity(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 100f, 1));
    }

    @Override
    public void tick() {
        if (timeAlive == 0) this.playSound(SoundEvents.AMBIENT_CAVE.get(), 2f, 0.8f);

        timeAlive++;
        if (timeAlive == maxTimeAlive) {
            this.remove(RemovalReason.KILLED);
        }
        super.tick();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 15D)
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
