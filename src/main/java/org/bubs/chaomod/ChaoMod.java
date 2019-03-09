package org.bubs.chaomod;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.bubs.chaomod.init.ModItems;
import org.bubs.chaomod.init.ModRecipes;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ChaoMod {
    private static Logger logger;

    @Mod.Instance
    public static ChaoMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        ModItems.init();
        ModRecipes.init();
        MinecraftForge.EVENT_BUS.register(new org.bubs.chaomod.EventHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }
}
