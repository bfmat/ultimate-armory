package com.ethcad.ultimatearmory.items.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class EmeraldSpade extends ItemSpade {
	public static final String name = "emeraldSpade";
	
	public EmeraldSpade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName() {
		return name;
	}
}
