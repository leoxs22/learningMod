package com.lordFenix56.learningMod.item;

import com.lordFenix56.learningMod.creativetab.CreativeTabLM;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Leandro on 10/11/2014.
 */
public class ItemMapleLeaf extends ItemLM
{
    public ItemMapleLeaf() {
        super();
        this.setUnlocalizedName("mapleLeaf");
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer player)
    {
        player.heal(1.0F);
        return p_77659_1_;
    }




}
