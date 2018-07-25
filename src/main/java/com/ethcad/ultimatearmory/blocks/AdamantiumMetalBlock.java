package com.ethcad.ultimatearmory.blocks;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumMetalBlock extends Block {
	public static final String name = "adamantiumMetalBlock";
	
	public AdamantiumMetalBlock() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setHardness(15f);
		setResistance(40f);
	}
	
	public String getName() {
		return name;
	}
}