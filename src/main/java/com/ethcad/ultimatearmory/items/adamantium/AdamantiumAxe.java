package com.ethcad.ultimatearmory.items.adamantium;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class AdamantiumAxe extends ItemAxe {
	public static final String name = "adamantiumAxe";
	public AdamantiumAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}
