package com.ethcad.ultimatearmory.items.obsidian;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class ObsidianSword extends ItemSword {
	public static final String name = "obsidianSword";
	
	public ObsidianSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public String getName() {
		return name;
	}
}
