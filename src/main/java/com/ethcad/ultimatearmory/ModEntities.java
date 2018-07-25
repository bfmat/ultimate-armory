package com.ethcad.ultimatearmory;

import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.ethcad.ultimatearmory.entities.EntityBomb;
import com.ethcad.ultimatearmory.entities.EntityInstaBomb;

public class ModEntities {
	public static void loadEntities() {
		EntityRegistry.registerGlobalEntityID(EntityBomb.class, Reference.MODID + "_" + EntityBomb.name, EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityInstaBomb.class, Reference.MODID + "_" + EntityInstaBomb.name, EntityRegistry.findGlobalUniqueEntityId());
	}
}
