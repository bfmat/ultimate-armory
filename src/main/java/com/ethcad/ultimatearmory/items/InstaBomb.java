package com.ethcad.ultimatearmory.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;
import com.ethcad.ultimatearmory.entities.EntityInstaBomb;

public class InstaBomb extends Item {
	public static final String name = "instaBomb";
	
	public InstaBomb() {
		super();
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public String getName() {
		return name;
	}
}
