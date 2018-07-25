package com.ethcad.ultimatearmory.items.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class EmeraldPickaxe extends ItemPickaxe {
	public static final String name = "emeraldPickaxe";
	
	public EmeraldPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName() {
		return name;
	}
}