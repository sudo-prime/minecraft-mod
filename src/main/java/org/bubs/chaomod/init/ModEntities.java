package org.bubs.chaomod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.bubs.chaomod.ChaoMod;
import org.bubs.chaomod.Reference;
import org.bubs.chaomod.entities.EntityChao;

public class ModEntities {

    public static void init() {
        registerEntity("chao", EntityChao.class, Reference.ENTITY_CHAO_ID, 50);
    }

    @SubscribeEvent
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, ChaoMod.instance, range, 1, true);
    }
}
