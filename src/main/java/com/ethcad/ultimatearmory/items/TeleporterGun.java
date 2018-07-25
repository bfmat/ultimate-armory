package com.ethcad.ultimatearmory.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class TeleporterGun extends Item {
	MovingObjectPosition mop = null;
	public static final String name = "teleporterGun";
	
	public TeleporterGun() {
		super();
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabTransport);
		setMaxDamage(100);
		setMaxStackSize(1);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		int x, y, z;
		if (itemStack.getItemDamage() == 0) {
			if (world.isRemote) {
				// server ray trace doesn't return right value
				mop = entityPlayer.rayTrace(1000.0d, 1.0f);
			}
			if (mop != null) {
				Vec3 vec3 = mop.hitVec;
				x = MathHelper.floor_double(vec3.xCoord);
				y = MathHelper.floor_double(vec3.yCoord);
				z = MathHelper.floor_double(vec3.zCoord);
				itemStack.damageItem(99, entityPlayer);
				entityPlayer.setPositionAndUpdate(x, y, z);
			}
		}
		return itemStack;
	}
	
	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int parInt, boolean parBoolean) {
		itemStack.setItemDamage(itemStack.getItemDamage() - 1);
	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
}
