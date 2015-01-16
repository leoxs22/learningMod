package com.lordFenix56.learningMod.proxy;

import com.lordFenix56.learningMod.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

import javax.swing.text.JTextComponent;

/**
 * Created by Leandro on 20/10/2014.
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings()
    {

            ClientRegistry.registerKeyBinding(KeyBindings.charge);
            ClientRegistry.registerKeyBinding(KeyBindings.release);

    }
}
