package com.ethcad.ultimatearmory.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.ModItems;
import com.ethcad.ultimatearmory.Reference;

public class RubyOreBlock extends Block {
	public static final String name = "rubyOreBlock";
	
	public RubyOreBlock() {
		super(Material.rock);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(15f);
		setResistance(40f);
		setHarvestLevel("pickaxe", 4);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		return ModItems.rubyGem;
	}
}
