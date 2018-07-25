package com.ethcad.ultimatearmory;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingRecipes {
	// Add all the crafting recipes to the game
	public static void addRecipes() {
		OreDictionary.registerOre("ingotAdamantium", ModItems.adamantiumIngot);
		OreDictionary.registerOre("oreAdamantium", ModBlocks.adamantiumOreBlock);
		OreDictionary.registerOre("ingotVibranium", ModItems.vibraniumIngot);
		OreDictionary.registerOre("oreVibranium", ModBlocks.vibraniumOreBlock);
		OreDictionary.registerOre("gemRuby", ModItems.rubyGem);
		OreDictionary.registerOre("oreRuby", ModBlocks.rubyOreBlock);
		OreDictionary.registerOre("dustVibranium", ModItems.vibraniumDust);
		OreDictionary.registerOre("materialChainmail", ModItems.chainMail);
		for (ItemStack stack : OreDictionary.getOres("oreAdamantium")) {
			GameRegistry.addSmelting(stack, new ItemStack(ModItems.adamantiumIngot, 1), 1f);
		}
		for (ItemStack stack : OreDictionary.getOres("oreVibranium")) {
			GameRegistry.addSmelting(stack, new ItemStack(ModItems.vibraniumIngot, 1), 2f);
		}
		for (ItemStack stack : OreDictionary.getOres("oreRuby")) {
			GameRegistry.addSmelting(stack, new ItemStack(ModItems.rubyGem, 1), 3f);
		}
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.vibraniumDust, 8), "ingotVibranium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.adamantiumIngot, 9), ModBlocks.adamantiumMetalBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.vibraniumIngot, 9), ModBlocks.vibraniumMetalBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubyGem, 9), ModBlocks.rubyGemBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(ModItems.autoArrow, Items.gunpowder, Items.arrow));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumClaws, new Object[] {
    		"X X",
    		"XX ",
    		" X ",
    		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumHelmet, new Object[] {
    		"XXX",
    		"X X",
    		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumChestplate, new Object[] {
    		"X X",
    		"XXX",
    		"XXX",
    		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumLeggings, new Object[] {
        	"XXX",
        	"X X",
       		"X X",
       		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumBoots, new Object[] {
    		"X X",
    		"X X",
    		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumSword, new Object[] {
    		"X",
    		"X",
    		"L",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.adamantiumMetalBlock, new Object[] {
    		"XXX",
    		"XXX",
    		"XXX",
    		'X', "ingotAdamantium"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumPickaxe, new Object[] {
    		"XXX",
    		" L ",
    		" L ",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumSpade, new Object[] {
    		"X",
    		"L",
    		"L",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumAxe, new Object[] {
    		"XX",
    		"XL",
    		" L",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumHoe, new Object[] {
    		"XX",
    		"L ",
    		"L ",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.iron_horse_armor, new Object[] {
    		"  X",
    		"XLX",
    		"XXX",
    		'X', "ingotIron", 'L', Blocks.wool}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.golden_horse_armor, new Object[] {
    		"  X",
    		"XLX",
    		"XXX",
    		'X', "ingotGold", 'L', Blocks.wool}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.diamond_horse_armor, new Object[] {
    		"  X",
    		"XLX",
    		"XXX",
    		'X', "gemDiamond", 'L', Blocks.wool}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chainMail, 8), new Object[] {
    		"X X",
    		" X ",
    		"X X",
    		'X', "ingotIron"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.chainmail_helmet, new Object[] {
    		"XXX",
    		"X X",
    		'X', "materialChainmail"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.chainmail_chestplate, new Object[] {
    		"X X",
    		"XXX",
    		"XXX",
    		'X', "materialChainmail"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.chainmail_leggings, new Object[] {
    		"XXX",
    		"X X",
    		"X X",
    		'X',"materialChainmail"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(Items.chainmail_boots, new Object[] {
    		"X X",
    		"X X",
    		'X', "materialChainmail"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.woodenBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "plankWood", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.stoneBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "cobblestone", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.ironBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "ingotIron", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.goldenBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "ingotGold", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.diamondBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "gemDiamond", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.adamantiumBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "ingotAdamantium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "gemEmerald", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldPickaxe, new Object[]{
			"eee",
			" s ",
			" s ", 'e', "gemEmerald", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldHoe, new Object[]{
			"ee",
			" s",
			" s", 'e', "gemEmerald", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldAxe, new Object[]{
			"ee",
			"es",
			" s", 'e', "gemEmerald", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldSpade, new Object[]{
			"e",
			"s",
			"s", 'e', "gemEmerald", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldSword, new Object[]{
			"e",
			"e",
			"s", 'e', "gemEmerald", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldHelmet, new Object[]{
			"eee",
			"e e", 'e', "gemEmerald"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldChestplate, new Object[]{
			"e e",
			"eee",
			"eee", 'e', "gemEmerald"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldLeggings, new Object[]{
			"eee",
			"e e",
			"e e", 'e', "gemEmerald"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.emeraldBoots, new Object[]{
			"e e",
			"e e", 'e', "gemEmerald"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.instaBomb, new Object[]{
			" i ",
			"ivi",
			" i ", 'i', "ingotIron", 'v', "dustVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bomb, 5), new Object[]{
			" is",
			"ivi",
			" i ", 'i', "slimeball", 'v', "dustVibranium", 's', Items.string}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumBat, new Object[] {
    		"XX",
    		"XX",
    		"LL",
    		'X', "ingotVibranium", 'L', "stickWood"}));
    	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumPickaxe, new Object[]{
			"eee",
			" s ",
			" s ", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumHoe, new Object[]{
			"ee",
			" s",
			" s", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumAxe, new Object[]{
			"ee",
			"es",
			" s", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumSpade, new Object[]{
			"e",
			"s",
			"s", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumSword, new Object[]{
			"e",
			"e",
			"s", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumHelmet, new Object[]{
			"eee",
			"e e", 'e', "ingotVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumChestplate, new Object[]{
			"e e",
			"eee",
			"eee", 'e', "ingotVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumLeggings, new Object[]{
			"eee",
			"e e",
			"e e", 'e', "ingotVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumBoots, new Object[]{
			"e e",
			"e e", 'e', "ingotVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.vibraniumShield, new Object[]{
			"eee",
			"ese",
			"eee", 'e', "ingotVibranium", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.vibraniumMetalBlock, new Object[]{
			"eee",
			"eee",
			"eee", 'e', "ingotVibranium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyBat, new Object[] {
	    	"XX",
	    	"XX",
	   		"LL",
	   		'X', "gemRuby", 'L', "stickWood"}));
	   	GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyPickaxe, new Object[]{
			"eee",
			" s ",
			" s ", 'e', "gemRuby", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyHoe, new Object[]{
			"ee",
			" s",
			" s", 'e', "gemRuby", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyAxe, new Object[]{
			"ee",
			"es",
			" s", 'e', "gemRuby", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubySpade, new Object[]{
			"e",
			"s",
			"s", 'e', "gemRuby", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubySword, new Object[]{
			"e",
			"e",
			"s", 'e', "gemRuby", 's', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyHelmet, new Object[]{
			"eee",
			"e e", 'e', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyChestplate, new Object[]{
			"e e",
			"eee",
			"eee", 'e', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyLeggings, new Object[]{
			"eee",
			"e e",
			"e e", 'e', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyBoots, new Object[]{
			"e e",
			"e e", 'e', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.rubyGemBlock, new Object[]{
			"eee",
			"eee",
			"eee", 'e', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.grenadeLauncher, new Object[]{
			"iii",
			"il ",
			"i  ", 'i', "ingotAdamantium", 'l', Blocks.lever}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.teleporterGun, new Object[]{
			"iii",
			"il ",
			"ie ", 'i', "ingotVibranium", 'l', Blocks.lever, 'e', Items.ender_eye}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.crossBow, new Object[]{
			" s ",
			"sis",
			"wiw", 's', "stickWood", 'i', "ingotAdamantium", 'w', Items.string}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.crossBow, new Object[]{
			" sw",
			"sii",
			" sw", 's', "stickWood", 'i', "ingotAdamantium", 'w', Items.string}));
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.bow, new Object[]{
			" s ",
			"s s",
			"www", 's', "stickWood", 'w', Items.string}));
    }
	
}