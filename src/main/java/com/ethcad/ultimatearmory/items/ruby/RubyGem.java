package com.ethcad.ultimatearmory.items.ruby;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyGem extends Item {
	public static final String name = "rubyGem";
	
	public RubyGem() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName() {
		return name;
	}
}