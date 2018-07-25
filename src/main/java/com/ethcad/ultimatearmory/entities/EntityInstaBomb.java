package com.ethcad.ultimatearmory.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityInstaBomb extends EntityThrowable {
	public static final String name = "instaBomb";
	
	@Override
	public void onUpdate() {
		if (!this.isDead) {
			double prevVelX = motionX;
			double prevVelY = motionY;
			double prevVelZ = motionZ;
			moveEntity(motionX, motionY, motionZ);
			boolean collided = false;
			if (motionX != prevVelX) {
				motionX = -prevVelX;
				collided = true;
			}
			if (motionY != prevVelY) {
				motionY = -prevVelY;
				collided = true;
			} else {
				// gravity
				motionY -= 0.03;
			}
			if (motionZ != prevVelZ) {
				motionZ = -prevVelZ;
				collided = true;
			}
			// slowing it down
			motionX *= 0.99;
			motionY *= 0.99;
			motionZ *= 0.99;
			if (collided && !this.worldObj.isRemote) {
				this.explode();
				this.setDead();
			}
		}
	}
	
	public EntityInstaBomb(World worldIn) {
		super(worldIn);
	}
	
	public EntityInstaBomb(World worldIn, EntityLivingBase p_i1780_2_) {
		super(worldIn, p_i1780_2_);
	}
	
	public EntityInstaBomb(World worldIn, double p_i1781_2_, double p_i1781_4_, double p_i1781_6_) {
		super(worldIn, p_i1781_2_, p_i1781_4_, p_i1781_6_);
	}
	
	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
	}
	
	private void explode() {
		float f = 10.0F;
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
	}
	
	@Override
	protected float getVelocity() {
		return 4;
	}
}