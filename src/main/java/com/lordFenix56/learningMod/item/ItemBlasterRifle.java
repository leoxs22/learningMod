package com.lordFenix56.learningMod.item;

import com.lordFenix56.learningMod.creativetab.CreativeTabLM;
import com.lordFenix56.learningMod.entity.EntityBlasterBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Leandro on 27/01/2015.
 */
public class ItemBlasterRifle extends Item {
    public ItemBlasterRifle() {
        super();
        setCreativeTab(CreativeTabLM.LM_TAB);
        setUnlocalizedName("blasterRifle");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
        if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(Items.redstone))
        {
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(new EntityBlasterBolt(par2World, par3EntityPlayer));
            }
        }
        return par1ItemStack;
    }
}

