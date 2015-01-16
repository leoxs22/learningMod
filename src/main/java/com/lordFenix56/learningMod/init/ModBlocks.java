package com.lordFenix56.learningMod.init;

import com.lordFenix56.learningMod.block.BlockCompressedEggplant;
import com.lordFenix56.learningMod.block.BlockFlag;
import com.lordFenix56.learningMod.block.BlockLM;
import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Leandro on 04/12/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLM flag =  new BlockFlag();
    public static final BlockLM compressedEggplant =  new BlockCompressedEggplant();

    public static void init()
    {

        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(compressedEggplant, "compressedEggplant");
    }

}
