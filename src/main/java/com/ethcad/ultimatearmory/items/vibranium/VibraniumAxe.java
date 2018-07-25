package com.ethcad.ultimatearmory.items.vibranium;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class VibraniumAxe extends ItemAxe {
	public static final String name = "vibraniumAxe";
	public VibraniumAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}
