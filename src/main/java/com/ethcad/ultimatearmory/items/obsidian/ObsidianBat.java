package com.ethcad.ultimatearmory.items.obsidian;

import com.ethcad.ultimatearmory.Reference;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianBat extends ItemSword {
	public static final String name = "obsidianBat";
	public ObsidianBat(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	@Override
	public Multimap getItemAttributeModifiers() {
	Multimap multimap = HashMultimap.create();
	multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double) 8f, 0));
	return multimap;
	}
	public String getName() {
		return name;
	}
}
