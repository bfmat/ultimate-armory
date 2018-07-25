package com.ethcad.ultimatearmory.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class RubyGemBlock extends Block {
	public static final String name = "rubyGemBlock";
	
	public RubyGemBlock() {
		super(Material.rock);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(60f);
		setResistance(6000000f);
		setHarvestLevel("pickaxe", 4);
	}
	
	public String getName() {
		return name;
	}
}
