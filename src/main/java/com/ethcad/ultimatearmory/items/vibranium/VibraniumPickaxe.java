package com.ethcad.ultimatearmory.items.vibranium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class VibraniumPickaxe extends ItemPickaxe {
	public static final String name = "vibraniumPickaxe";
	public VibraniumPickaxe(ToolMaterial material){
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}