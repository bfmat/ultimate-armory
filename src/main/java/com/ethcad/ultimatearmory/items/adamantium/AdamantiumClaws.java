package com.ethcad.ultimatearmory.items.adamantium;

import com.ethcad.ultimatearmory.Reference;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumClaws extends ItemSword {
	public static final String name = "adamantiumClaws";
	public AdamantiumClaws(ToolMaterial material) {
		super(material);
		ToolMaterial accessible = material;
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