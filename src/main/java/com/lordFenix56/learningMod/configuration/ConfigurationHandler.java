package com.lordFenix56.learningMod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Leandro on 31/10/2014.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the configuration object from the configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue=false;
        try
        {
            //Load de configuration file
            configuration.load();

            //Read in properties from configuration file
             configValue= configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log de exception
        }
        finally
        {
            //Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
