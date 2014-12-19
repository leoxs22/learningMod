package com.lordFenix56.learningMod;

import com.lordFenix56.learningMod.handler.ConfigurationHandler;
import com.lordFenix56.learningMod.init.ModBlocks;
import com.lordFenix56.learningMod.init.ModItems;
import com.lordFenix56.learningMod.proxy.IProxy;
import com.lordFenix56.learningMod.reference.Reference;
import com.lordFenix56.learningMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Leandro on 20/10/2014.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LearningMod {

    @Mod.Instance(Reference.MOD_ID)
    public static LearningMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register((new ConfigurationHandler()));
        LogHelper.info("Pre Initialization Complete");

        ModItems.init();

        ModBlocks.init();
    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }

}
