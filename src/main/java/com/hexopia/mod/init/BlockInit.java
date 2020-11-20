package com.hexopia.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.hexopia.mod.objects.blocks.BlockBasic;
import com.hexopia.mod.objects.blocks.BlockOreMod;
import com.hexopia.mod.objects.blocks.BlockOreMod2;
import com.hexopia.mod.objects.blocks.BlockSpecial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block XURANIUM_BLOCK = new BlockBasic("xuranium_block", Material.ROCK);
	public static final Block TNT_BLOCK_SPECIAL = new BlockSpecial("tnt_block_special", Material.TNT);

	//Ores
	public static final Block ORE_XURANIUM = new BlockOreMod("ore_xuranium", Material.ROCK);
	public static final Block ORE_PIKARIUM = new BlockOreMod2("ore_pikarium", Material.ROCK);
}
