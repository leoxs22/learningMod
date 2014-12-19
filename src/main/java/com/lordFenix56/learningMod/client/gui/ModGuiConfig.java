package com.lordFenix56.learningMod.client.gui;

import com.lordFenix56.learningMod.LearningMod;
import com.lordFenix56.learningMod.handler.ConfigurationHandler;
import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
/**
 * Created by Leandro on 10/11/2014.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}
