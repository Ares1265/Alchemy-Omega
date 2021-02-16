package com.The_Titan_Omega.AlchemyMod.core.init;

import com.The_Titan_Omega.AlchemyMod.AlchemyMod;
import com.The_Titan_Omega.AlchemyMod.blocks.AlchemyTableBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemyMod.MOD_ID);
	
	public static final RegistryObject<Block> lead_ore = BLOCKS.register("lead_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
					.hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE).harvestLevel(2).
					sound(SoundType.METAL).setRequiresTool()));
	
	public static final RegistryObject<Block> alchemy_table = BLOCKS.register("alchemy_table", 
			() -> new AlchemyTableBlock());
 	
	public static final RegistryObject<Block> lead_block = BLOCKS.register("lead_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(6f, 7f).
					harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2).sound(SoundType.METAL)));
}
