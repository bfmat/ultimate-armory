package com.ethcad.ultimatearmory.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.ModItems;
import com.ethcad.ultimatearmory.Reference;
import com.ethcad.ultimatearmory.entities.EntityInstaBomb;

public class GrenadeLauncher extends Item {
	public static final String name = "grenadeLauncher";
	public int animationState;
	MovingObjectPosition mop = null;
	
	public GrenadeLauncher() {
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxDamage(127);
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		if (playerIn.inventory.hasItem(ModItems.instaBomb) || playerIn.capabilities.isCreativeMode) {
			if (!playerIn.capabilities.isCreativeMode) {
				playerIn.inventory.consumeInventoryItem(ModItems.instaBomb);
				itemStackIn.damageItem(1, playerIn);
			}
			worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			if (!worldIn.isRemote) {
				worldIn.spawnEntityInWorld(new EntityInstaBomb(worldIn, playerIn));
			}
		}
		return itemStackIn;
	}
	
	public String getName() {
		return name;
	}
}
