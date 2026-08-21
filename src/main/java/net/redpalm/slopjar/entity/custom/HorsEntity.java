package net.redpalm.slopjar.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.redpalm.slopjar.entity.base.BaseAggressiveMonster;

public class HorsEntity extends BaseAggressiveMonster {

    public HorsEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }


}
