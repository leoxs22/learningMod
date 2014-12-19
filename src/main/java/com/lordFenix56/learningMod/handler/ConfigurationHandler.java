package com.lordFenix56.learningMod.handler;

import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Leandro on 31/10/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue=false;

    public static void init(File configFile)
    {

        //Create the configuration object from the configuration file
        if(configuration==null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }


    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false,"This is an example configuration value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }
    }
}
