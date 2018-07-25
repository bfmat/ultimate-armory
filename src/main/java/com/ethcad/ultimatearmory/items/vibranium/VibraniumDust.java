package com.ethcad.ultimatearmory.items.vibranium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VibraniumDust extends Item {
	public static final String name = "vibraniumDust";
	
	public VibraniumDust() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName() {
		return name;
	}
}