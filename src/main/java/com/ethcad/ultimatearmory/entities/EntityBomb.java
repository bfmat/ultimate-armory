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

public class EntityBomb extends EntityThrowable {
	public static final String name = "bomb";
	double bounceFactor = 0.8;
	int fuse = 50;
	boolean stopped = false;
	
	@Override
	public void onUpdate() {
		if (fuse-- <= 0) {
			if (!this.worldObj.isRemote) {
				this.explode();
				this.setDead();
			}
		}
		if (!stopped && !this.isDead) {
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
			if (collided) {
				motionX *= bounceFactor;
				motionY *= bounceFactor;
				motionZ *= bounceFactor;
			}
			if (onGround && (Math.abs(motionX) + Math.abs(motionY) + Math.abs(motionZ)) < 0.2) {
				stopped = true;
				motionX = 0;
				motionY = 0;
				motionZ = 0;
			}
		}
	}
	
	public EntityBomb(World worldIn) {
		super(worldIn);
	}
	
	public EntityBomb(World worldIn, EntityLivingBase p_i1780_2_) {
		super(worldIn, p_i1780_2_);
	}
	
	public EntityBomb(World worldIn, double p_i1781_2_, double p_i1781_4_, double p_i1781_6_) {
		super(worldIn, p_i1781_2_, p_i1781_4_, p_i1781_6_);
	}
	
	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(MovingObjectPosition p_70184_1_) {
	}
	
	private void explode() {
		float f = 3.0F;
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
	}
}