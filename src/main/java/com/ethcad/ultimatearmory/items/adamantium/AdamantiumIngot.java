package com.ethcad.ultimatearmory.items.adamantium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumIngot extends Item {
	public static final String name = "adamantiumIngot";
	public AdamantiumIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	public String getName(){
		return name;
	}
}