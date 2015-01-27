package com.lordFenix56.learningMod.item;

import com.lordFenix56.learningMod.creativetab.CreativeTabLM;
import com.lordFenix56.learningMod.reference.Material;
import com.lordFenix56.learningMod.reference.Names;
import com.lordFenix56.learningMod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by Leandro on 10/11/2014.
 */
public class ItemTurroDestructor extends ItemSword
{
    public ItemTurroDestructor()
    {
        super(Material.Tools.TURRILIO);
        this.maxStackSize=1;
        this.setUnlocalizedName(Names.Weapons.TURRO_DESTRUCTOR);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
