package com.lordFenix56.learningMod.block;

import com.lordFenix56.learningMod.creativetab.CreativeTabLM;
import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by Leandro on 04/12/2014.
 */
public class BlockLM extends Block
{
    public BlockLM(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabLM.LM_TAB);

    }

    public BlockLM()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabLM.LM_TAB);

    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+ ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
