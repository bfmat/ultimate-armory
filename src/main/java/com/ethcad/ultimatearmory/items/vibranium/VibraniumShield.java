package com.ethcad.ultimatearmory.items.vibranium;

import com.ethcad.ultimatearmory.Reference;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VibraniumShield extends ItemSword {
	public static final String name = "vibraniumShield";
	public VibraniumShield(ToolMaterial material) {
		super(material);
		ToolMaterial accessible = material;
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
	}
	@Override
	public Multimap getItemAttributeModifiers() {
	Multimap multimap = HashMultimap.create();
	multimap.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double) 1f, 0));
	multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double) 10f, 0));
	return multimap;
	}	
	public String getName() {
		return name;
	}
}