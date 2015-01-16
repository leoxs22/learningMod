package com.lordFenix56.learningMod.init;

import com.lordFenix56.learningMod.item.ItemEggplant;
import com.lordFenix56.learningMod.item.ItemLM;
import com.lordFenix56.learningMod.item.ItemMapleLeaf;
import com.lordFenix56.learningMod.item.ItemTurroDestructor;
import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Leandro on 10/11/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLM mapleLeaf = new ItemMapleLeaf();
    public static final ItemLM eggplant = new ItemEggplant();
    public static final ItemLM turroDestructor = new ItemTurroDestructor();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(eggplant, "eggplant");
        GameRegistry.registerItem(turroDestructor, "turroDestructor" );
    }
}
