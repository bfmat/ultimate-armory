package com.ethcad.ultimatearmory;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModEventHandler implements IWorldGenerator {
	// Differentiate between the surface (overworld), nether, and end
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
			case 0:
				generateSurface(world, random, new BlockPos(chunkX * 16, 64, chunkZ * 16));
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	// Add the ore spawn for each dimension
	private void generateEnd(World world, Random random, int x, int y) {
	}
	
	private void generateSurface(World world, Random random, BlockPos pos) {
		addOreSpawn(ModBlocks.adamantiumOreBlock, world, random, pos, 16, 16, 4, 4, 0, 16);
		addOreSpawn(ModBlocks.vibraniumOreBlock, world, random, pos, 16, 16, 4, 4, 0, 10);
		addOreSpawn(ModBlocks.rubyOreBlock, world, random, pos, 16, 16, 4, 4, 0, 10);
	}
	
	private void generateNether(World world, Random random, int x, int y) {
	}
	
	// Actually create the ore spawns
	private void addOreSpawn(Block block, World world, Random random, BlockPos pos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		WorldGenMinable mine = new WorldGenMinable(block.getDefaultState(), maxVeinSize);
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = pos.getX() + random.nextInt(maxX);
			int y = minY + random.nextInt(maxY - minY);
			int z = pos.getZ() + random.nextInt(maxZ);
			mine.generate(world, random, new BlockPos(x, y, z));
		}
	}
}