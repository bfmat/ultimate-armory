package com.ethcad.ultimatearmory.items.obsidian;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class ObsidianSpade extends ItemSpade {
	public static final String name = "obsidianSpade";
	
	public ObsidianSpade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName() {
		return name;
	}
}
