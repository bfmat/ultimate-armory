package com.ethcad.ultimatearmory;

import net.minecraft.block.Block;

import com.ethcad.ultimatearmory.blocks.AdamantiumMetalBlock;
import com.ethcad.ultimatearmory.blocks.AdamantiumOreBlock;
import com.ethcad.ultimatearmory.blocks.RubyGemBlock;
import com.ethcad.ultimatearmory.blocks.RubyOreBlock;
import com.ethcad.ultimatearmory.blocks.VibraniumMetalBlock;
import com.ethcad.ultimatearmory.blocks.VibraniumOreBlock;

public class ModBlocks {
	// Create the blocks
	public static Block adamantiumOreBlock;
	public static Block adamantiumMetalBlock;
	public static Block vibraniumOreBlock;
	public static Block vibraniumMetalBlock;
	public static Block rubyOreBlock;
	public static Block rubyGemBlock;
	
	// And initialize them
	public static void loadBlocks() {
		adamantiumOreBlock = new AdamantiumOreBlock();
		adamantiumMetalBlock = new AdamantiumMetalBlock();
		vibraniumOreBlock = new VibraniumOreBlock();
		vibraniumMetalBlock = new VibraniumMetalBlock();
		rubyOreBlock = new RubyOreBlock();
		rubyGemBlock = new RubyGemBlock();
	}
}
