package com.ethcad.ultimatearmory;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ModFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ModItems.woodenBat) {
			return 200;
		} else {
			return 0;
		}
	}
}
