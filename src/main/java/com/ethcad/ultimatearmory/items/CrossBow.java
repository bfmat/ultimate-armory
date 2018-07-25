package com.ethcad.ultimatearmory.items;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagLong;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.Reference;

public class CrossBow extends Item {
	public static final String name = "crossBow";
	
	public CrossBow() {
		setUnlocalizedName(Reference.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setMaxDamage(511);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
		long ticksSinceLastUse = player.worldObj.getTotalWorldTime() - getLastUseTime(stack);
		if (player.inventory.hasItem(Items.arrow) || player.capabilities.isCreativeMode) {
			if (ticksSinceLastUse >= 200) {
				return new ModelResourceLocation(Reference.MODID + ":crossBow_pulling_2", "inventory");
			} else if (ticksSinceLastUse >= 120) {
				return new ModelResourceLocation(Reference.MODID + ":crossBow_pulling_1", "inventory");
			} else if (ticksSinceLastUse >= 40) {
				return new ModelResourceLocation(Reference.MODID + ":crossBow_pulling_0", "inventory");
			}
			if (ticksSinceLastUse > 200) {
				ticksSinceLastUse = 200;
			}
		}
		return new ModelResourceLocation(Reference.MODID + ":crossBow_standby", "inventory");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer entityPlayer) {
		if (entityPlayer.inventory.hasItem(Items.arrow) || entityPlayer.capabilities.isCreativeMode) {
			long ticksSinceLastUse = worldIn.getTotalWorldTime() - getLastUseTime(itemStack);
			entityPlayer.setItemInUse(itemStack, 1000);
			float charge = (float) ticksSinceLastUse / 25;
			fireArrow(itemStack, entityPlayer, worldIn, charge);
		}
		setLastUseTime(itemStack, worldIn.getTotalWorldTime());
		return itemStack;
	}
	
	private void setLastUseTime(ItemStack stack, long time) {
		stack.setTagInfo("LastUse", new NBTTagLong(time));
	}
	
	private long getLastUseTime(ItemStack stack) {
		return stack.hasTagCompound() ? stack.getTagCompound().getLong("LastUse") : 0;
	}
	
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BOW;
	}
	
	public void fireArrow(ItemStack stack, EntityPlayer playerIn, World worldIn, float charge) {
		boolean flag = playerIn.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;
		if (flag || playerIn.inventory.hasItem(Items.arrow)) {
			if ((double) charge < 0.1D) {
				return;
			}
			EntityArrow entityarrow = new EntityArrow(worldIn, playerIn, charge);
			if (charge >= 3.0F) {
				entityarrow.setIsCritical(true);
			}
			stack.damageItem(1, playerIn);
			worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + charge / 4);
			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				playerIn.inventory.consumeInventoryItem(Items.arrow);
			}
			if (!worldIn.isRemote) {
				worldIn.spawnEntityInWorld(entityarrow);
			}
		}
	}
	
	public int getItemEnchantability() {
		return 20;
	}
}
