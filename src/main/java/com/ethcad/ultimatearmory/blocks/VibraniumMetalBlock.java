package com.ethcad.ultimatearmory.blocks;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VibraniumMetalBlock extends Block {
	public static final String name = "vibraniumMetalBlock";
	
	public VibraniumMetalBlock() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 3);
		setHardness(40f);
		setResistance(50f);
	}
	
	public String getName() {
		return name;
	}
}