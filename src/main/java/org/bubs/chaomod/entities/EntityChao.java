package org.bubs.chaomod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityChao extends EntityAnimal {
    public EntityChao(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable){
        return new EntityChao(this.world);
    }
}
