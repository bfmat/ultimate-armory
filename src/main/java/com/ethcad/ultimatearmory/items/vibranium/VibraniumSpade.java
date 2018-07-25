package com.ethcad.ultimatearmory.items.vibranium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class VibraniumSpade extends ItemSpade {
	public static final String name = "vibraniumSpade";
	public VibraniumSpade(ToolMaterial material){
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}