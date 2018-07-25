package com.ethcad.ultimatearmory.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class Wand extends Item {
	MovingObjectPosition mop = null;
	public static final String name = "wand";
	
	public Wand() {
		super();
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxDamage(100);
		setMaxStackSize(1);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		if (itemStack.getItemDamage() == 0) {
			if (world.isRemote) {
				// server raytrace doesn't return right value
				mop = entityPlayer.rayTrace(1000.0d, 1.0f);
			}
			if (mop != null) {
				Vec3 vec3 = mop.hitVec;
				int x = MathHelper.floor_double(vec3.xCoord);
				int y = MathHelper.floor_double(vec3.yCoord);
				int z = MathHelper.floor_double(vec3.zCoord);
				EntityLightningBolt lightning = new EntityLightningBolt(world, x, y, z);
				world.spawnEntityInWorld(lightning);
				itemStack.damageItem(99, entityPlayer);
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
