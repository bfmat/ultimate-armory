package com.ethcad.ultimatearmory;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ethcad.ultimatearmory.entities.EntityBomb;
import com.ethcad.ultimatearmory.entities.EntityInstaBomb;
import com.ethcad.ultimatearmory.proxies.CommonProxy;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class UltimateArmory {
	// Create the proxies
	@SidedProxy(clientSide = "com.ethcad.ultimatearmory.proxies.ClientProxy", serverSide = "com.ethcad.ultimatearmory.proxies.CommonProxy")
	public static CommonProxy proxy;
	// Declare the event handler / ore spawner
	ModEventHandler handler = new ModEventHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Initialize all items and blocks, and entities
		ModItems.loadItems();
		ModBlocks.loadBlocks();
		ModEntities.loadEntities();
		// Register ore generator and entities
		GameRegistry.registerWorldGenerator(handler, 0);
		EntityRegistry.registerModEntity(EntityBomb.class, Reference.MODID + "_" + EntityBomb.name, 1, this, 80, 1, true);
		EntityRegistry.registerModEntity(EntityInstaBomb.class, Reference.MODID + "_" + EntityInstaBomb.name, 2, this, 80, 1, true);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Add crafting recipes
		CraftingRecipes.addRecipes();
		GameRegistry.registerFuelHandler(new ModFuelHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Render items and blocks in the inventory
		proxy.renderInventory();
		proxy.registerRendering();
	}
	
	public static void registerItemModel(Item item) {
		final ModelResourceLocation modelLocation = new ModelResourceLocation((ResourceLocation) Item.itemRegistry.getNameForObject(item), "inventory");
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("textures/items/crossBow_standby.png");
			}
		});
	}
}