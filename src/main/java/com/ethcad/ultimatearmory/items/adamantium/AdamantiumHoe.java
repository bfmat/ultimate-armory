package com.ethcad.ultimatearmory.items.adamantium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumHoe extends ItemHoe {
	public static final String name = "adamantiumHoe";
	public AdamantiumHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}
