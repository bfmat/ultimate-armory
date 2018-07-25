package com.ethcad.ultimatearmory.items.adamantium;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AdamantiumArmor extends ItemArmor {
	public AdamantiumArmor(ArmorMaterial material, int renderIndex, int armorType, String name) {
		super(material, renderIndex, armorType);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack stack, Entity e, int slot, String layer) {
		return Reference.MODID + ":textures/models/armor/adamantiumArmorMaterial_layer_" + (slot == 2 ? 2 : 1) + ".png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem() instanceof AdamantiumArmor && armorType == 3) {
			int x = (int) player.posX;
			int y = (int) player.posY - 1;
			int z = (int) player.posZ;
			if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.water || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.flowing_water) {
				world.setBlockState(new BlockPos(x, y, z), Blocks.ice.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x + 1, y, z)).getBlock() == Blocks.water || world.getBlockState(new BlockPos(x + 1, y, z)).getBlock() == Blocks.flowing_water) {
				world.setBlockState(new BlockPos(x + 1, y, z), Blocks.ice.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x - 1, y, z)).getBlock() == Blocks.water || world.getBlockState(new BlockPos(x - 1, y, z)).getBlock() == Blocks.flowing_water) {
				world.setBlockState(new BlockPos(x - 1, y, z), Blocks.ice.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x, y, z + 1)).getBlock() == Blocks.water || world.getBlockState(new BlockPos(x, y, z + 1)).getBlock() == Blocks.flowing_water) {
				world.setBlockState(new BlockPos(x, y, z + 1), Blocks.ice.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x, y, z - 1)).getBlock() == Blocks.water || world.getBlockState(new BlockPos(x, y, z - 1)).getBlock() == Blocks.flowing_water) {
				world.setBlockState(new BlockPos(x, y, z - 1), Blocks.ice.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.lava || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.flowing_lava) {
				world.setBlockState(new BlockPos(x, y, z), Blocks.obsidian.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x + 1, y, z)).getBlock() == Blocks.lava || world.getBlockState(new BlockPos(x + 1, y, z)).getBlock() == Blocks.flowing_lava) {
				world.setBlockState(new BlockPos(x + 1, y, z), Blocks.obsidian.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x - 1, y, z)).getBlock() == Blocks.lava || world.getBlockState(new BlockPos(x - 1, y, z)).getBlock() == Blocks.flowing_lava) {
				world.setBlockState(new BlockPos(x - 1, y, z), Blocks.obsidian.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x, y, z + 1)).getBlock() == Blocks.lava || world.getBlockState(new BlockPos(x, y, z + 1)).getBlock() == Blocks.flowing_lava) {
				world.setBlockState(new BlockPos(x, y, z + 1), Blocks.obsidian.getDefaultState());
			}
			if (world.getBlockState(new BlockPos(x, y, z - 1)).getBlock() == Blocks.lava || world.getBlockState(new BlockPos(x, y, z - 1)).getBlock() == Blocks.flowing_lava) {
				world.setBlockState(new BlockPos(x, y, z - 1), Blocks.obsidian.getDefaultState());
			}
		}
	}
}