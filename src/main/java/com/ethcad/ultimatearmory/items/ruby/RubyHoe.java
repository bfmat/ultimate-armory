package com.ethcad.ultimatearmory.items.ruby;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyHoe extends ItemHoe {
	public static final String name = "rubyHoe";
	
	public RubyHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}
}
