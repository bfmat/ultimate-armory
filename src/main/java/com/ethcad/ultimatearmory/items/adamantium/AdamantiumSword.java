package com.ethcad.ultimatearmory.items.adamantium;

import com.ethcad.ultimatearmory.Reference;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumSword extends ItemSword {
	public static final String name = "adamantiumSword";
	public AdamantiumSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	public String getName() {
		return name;
	}
}