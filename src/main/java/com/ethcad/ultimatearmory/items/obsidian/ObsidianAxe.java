package com.ethcad.ultimatearmory.items.obsidian;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class ObsidianAxe extends ItemAxe {
	public static final String name = "obsidianAxe";
	
	public ObsidianAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName() {
		return name;
	}
}
