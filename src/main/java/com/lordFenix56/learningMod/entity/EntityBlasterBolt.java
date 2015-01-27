package com.lordFenix56.learningMod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Leandro on 27/01/2015.
 */
public class EntityBlasterBolt extends EntityThrowable
{
    public float explosionRadius = 1.0F;
    public EntityBlasterBolt(World par1World)
    {
        super(par1World);
    }
    public EntityBlasterBolt(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public EntityBlasterBolt(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    @Override
    public void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {

        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
        this.setDead();
    }
}
