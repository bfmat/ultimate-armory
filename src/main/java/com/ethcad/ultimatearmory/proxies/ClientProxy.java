package com.ethcad.ultimatearmory.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.ethcad.ultimatearmory.ModBlocks;
import com.ethcad.ultimatearmory.ModItems;
import com.ethcad.ultimatearmory.Reference;
import com.ethcad.ultimatearmory.UltimateArmory;
import com.ethcad.ultimatearmory.blocks.AdamantiumMetalBlock;
import com.ethcad.ultimatearmory.blocks.AdamantiumOreBlock;
import com.ethcad.ultimatearmory.blocks.RubyGemBlock;
import com.ethcad.ultimatearmory.blocks.RubyOreBlock;
import com.ethcad.ultimatearmory.blocks.VibraniumMetalBlock;
import com.ethcad.ultimatearmory.blocks.VibraniumOreBlock;
import com.ethcad.ultimatearmory.entities.EntityBomb;
import com.ethcad.ultimatearmory.entities.EntityInstaBomb;
import com.ethcad.ultimatearmory.items.AutoArrow;
import com.ethcad.ultimatearmory.items.Bomb;
import com.ethcad.ultimatearmory.items.ChainMail;
import com.ethcad.ultimatearmory.items.DiamondBat;
import com.ethcad.ultimatearmory.items.GoldenBat;
import com.ethcad.ultimatearmory.items.GrenadeLauncher;
import com.ethcad.ultimatearmory.items.InstaBomb;
import com.ethcad.ultimatearmory.items.IronBat;
import com.ethcad.ultimatearmory.items.StoneBat;
import com.ethcad.ultimatearmory.items.TeleporterGun;
import com.ethcad.ultimatearmory.items.Wand;
import com.ethcad.ultimatearmory.items.WoodenBat;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumAxe;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumBat;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumClaws;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumHoe;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumIngot;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumPickaxe;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumSpade;
import com.ethcad.ultimatearmory.items.adamantium.AdamantiumSword;
import com.ethcad.ultimatearmory.items.emerald.EmeraldAxe;
import com.ethcad.ultimatearmory.items.emerald.EmeraldBat;
import com.ethcad.ultimatearmory.items.emerald.EmeraldHoe;
import com.ethcad.ultimatearmory.items.emerald.EmeraldPickaxe;
import com.ethcad.ultimatearmory.items.emerald.EmeraldSpade;
import com.ethcad.ultimatearmory.items.emerald.EmeraldSword;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianAxe;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianBat;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianHoe;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianPickaxe;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianSpade;
import com.ethcad.ultimatearmory.items.obsidian.ObsidianSword;
import com.ethcad.ultimatearmory.items.ruby.RubyAxe;
import com.ethcad.ultimatearmory.items.ruby.RubyBat;
import com.ethcad.ultimatearmory.items.ruby.RubyGem;
import com.ethcad.ultimatearmory.items.ruby.RubyHoe;
import com.ethcad.ultimatearmory.items.ruby.RubyPickaxe;
import com.ethcad.ultimatearmory.items.ruby.RubySpade;
import com.ethcad.ultimatearmory.items.ruby.RubySword;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumAxe;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumBat;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumDust;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumHoe;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumIngot;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumPickaxe;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumShield;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumSpade;
import com.ethcad.ultimatearmory.items.vibranium.VibraniumSword;

public class ClientProxy extends CommonProxy {
	// Render all the blocks and items in the inventory
	@Override
	public void renderInventory() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.adamantiumOreBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumOreBlock) ModBlocks.adamantiumOreBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.adamantiumMetalBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumMetalBlock) ModBlocks.adamantiumMetalBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumIngot, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumIngot) ModItems.adamantiumIngot).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumClaws, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumClaws) ModItems.adamantiumClaws).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumHelmet, 0, new ModelResourceLocation(Reference.MODID + ":adamantiumHelmet", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumChestplate, 0, new ModelResourceLocation(Reference.MODID + ":adamantiumChestplate", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumLeggings, 0, new ModelResourceLocation(Reference.MODID + ":adamantiumLeggings", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumBoots, 0, new ModelResourceLocation(Reference.MODID + ":adamantiumBoots", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumSword, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumSword) ModItems.adamantiumSword).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumPickaxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumPickaxe) ModItems.adamantiumPickaxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumSpade, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumSpade) ModItems.adamantiumSpade).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumAxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumAxe) ModItems.adamantiumAxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumHoe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumHoe) ModItems.adamantiumHoe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.chainMail, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ChainMail) ModItems.chainMail).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.woodenBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((WoodenBat) ModItems.woodenBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.stoneBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((StoneBat) ModItems.stoneBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.ironBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((IronBat) ModItems.ironBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.goldenBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((GoldenBat) ModItems.goldenBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.diamondBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((DiamondBat) ModItems.diamondBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldBat) ModItems.emeraldBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.adamantiumBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AdamantiumBat) ModItems.adamantiumBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldPickaxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldPickaxe) ModItems.emeraldPickaxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldSpade, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldSpade) ModItems.emeraldSpade).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldAxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldAxe) ModItems.emeraldAxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldHoe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldHoe) ModItems.emeraldHoe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldSword, 0, new ModelResourceLocation(Reference.MODID + ":" + ((EmeraldSword) ModItems.emeraldSword).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldHelmet, 0, new ModelResourceLocation(Reference.MODID + ":emeraldHelmet", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldChestplate, 0, new ModelResourceLocation(Reference.MODID + ":emeraldChestplate", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldLeggings, 0, new ModelResourceLocation(Reference.MODID + ":emeraldLeggings", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.emeraldBoots, 0, new ModelResourceLocation(Reference.MODID + ":emeraldBoots", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.bomb, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Bomb) ModItems.bomb).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.instaBomb, 0, new ModelResourceLocation(Reference.MODID + ":" + ((InstaBomb) ModItems.instaBomb).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.wand, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Wand) ModItems.wand).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.vibraniumOreBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumOreBlock) ModBlocks.vibraniumOreBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.vibraniumMetalBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumMetalBlock) ModBlocks.vibraniumMetalBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumIngot, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumIngot) ModItems.vibraniumIngot).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumShield, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumShield) ModItems.vibraniumShield).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumHelmet, 0, new ModelResourceLocation(Reference.MODID + ":vibraniumHelmet", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumChestplate, 0, new ModelResourceLocation(Reference.MODID + ":vibraniumChestplate", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumLeggings, 0, new ModelResourceLocation(Reference.MODID + ":vibraniumLeggings", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumBoots, 0, new ModelResourceLocation(Reference.MODID + ":vibraniumBoots", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumSword, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumSword) ModItems.vibraniumSword).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumPickaxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumPickaxe) ModItems.vibraniumPickaxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumSpade, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumSpade) ModItems.vibraniumSpade).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumAxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumAxe) ModItems.vibraniumAxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumHoe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumHoe) ModItems.vibraniumHoe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumBat) ModItems.vibraniumBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.vibraniumDust, 0, new ModelResourceLocation(Reference.MODID + ":" + ((VibraniumDust) ModItems.vibraniumDust).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianPickaxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianPickaxe) ModItems.obsidianPickaxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianSpade, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianSpade) ModItems.obsidianSpade).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianAxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianAxe) ModItems.obsidianAxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianHoe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianHoe) ModItems.obsidianHoe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianSword, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianSword) ModItems.obsidianSword).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianHelmet, 0, new ModelResourceLocation(Reference.MODID + ":obsidianHelmet", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianChestplate, 0, new ModelResourceLocation(Reference.MODID + ":obsidianChestplate", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianLeggings, 0, new ModelResourceLocation(Reference.MODID + ":obsidianLeggings", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianBoots, 0, new ModelResourceLocation(Reference.MODID + ":obsidianBoots", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.obsidianBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ObsidianBat) ModItems.obsidianBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.grenadeLauncher, 0, new ModelResourceLocation(Reference.MODID + ":" + ((GrenadeLauncher) ModItems.grenadeLauncher).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.autoArrow, 0, new ModelResourceLocation(Reference.MODID + ":" + ((AutoArrow) ModItems.autoArrow).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.rubyOreBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyOreBlock) ModBlocks.rubyOreBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.rubyGemBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyGemBlock) ModBlocks.rubyGemBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyGem, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyGem) ModItems.rubyGem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyHelmet, 0, new ModelResourceLocation(Reference.MODID + ":rubyHelmet", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyChestplate, 0, new ModelResourceLocation(Reference.MODID + ":rubyChestplate", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyLeggings, 0, new ModelResourceLocation(Reference.MODID + ":rubyLeggings", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyBoots, 0, new ModelResourceLocation(Reference.MODID + ":rubyBoots", "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubySword, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubySword) ModItems.rubySword).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyPickaxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyPickaxe) ModItems.rubyPickaxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubySpade, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubySpade) ModItems.rubySpade).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyAxe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyAxe) ModItems.rubyAxe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyHoe, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyHoe) ModItems.rubyHoe).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.rubyBat, 0, new ModelResourceLocation(Reference.MODID + ":" + ((RubyBat) ModItems.rubyBat).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.teleporterGun, 0, new ModelResourceLocation(Reference.MODID + ":" + ((TeleporterGun) ModItems.teleporterGun).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.crossBow, 0, new ModelResourceLocation(Reference.MODID + ":crossBow_standby", "inventory"));
		ModelBakery.addVariantName(ModItems.crossBow, Reference.MODID + ":crossBow_standby");
		for (int stage = 0; stage < 3; stage++) { // Add a variant for each
													// stage's model
			ModelBakery.addVariantName(ModItems.crossBow, Reference.MODID + ":crossBow_pulling_" + stage);
		}
		UltimateArmory.registerItemModel(ModItems.crossBow);
	}
	
	@Override
	public void registerRendering() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), ModItems.bomb, renderItem));
		RenderingRegistry.registerEntityRenderingHandler(EntityInstaBomb.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), ModItems.instaBomb, renderItem));
	}
}