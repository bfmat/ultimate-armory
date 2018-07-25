package com.ethcad.ultimatearmory.blocks;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumOreBlock extends Block {
	public static final String name = "adamantiumOreBlock";
	
	public AdamantiumOreBlock() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setHardness(5f);
		setResistance(20f);
	}
	
	public String getName() {
		return name;
	}
}