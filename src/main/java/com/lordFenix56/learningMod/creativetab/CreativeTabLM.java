package com.lordFenix56.learningMod.creativetab;

import com.lordFenix56.learningMod.init.ModItems;
import com.lordFenix56.learningMod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Leandro on 05/12/2014.
 */
public class CreativeTabLM
{
    public static final CreativeTabs LM_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Learning Mod";
        }
    };
}
