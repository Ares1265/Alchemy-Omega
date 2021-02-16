package com.The_Titan_Omega.AlchemyMod.world;

import com.The_Titan_Omega.AlchemyMod.core.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
	
	public static void generateOres(final BiomeLoadingEvent event) {
		if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))){
			event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.lead_ore.get().getDefaultState(), 9)).
					withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(10, 0, 50)))
					.square().func_242731_b(20));
			event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.copper_ore.get().getDefaultState(), 14)).
					withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(10, 0, 128)))
					.square().func_242731_b(20));
			event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.tin_ore.get().getDefaultState(), 14)).
					withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(10, 0, 128)))
					.square().func_242731_b(20));
		}
	}
	
}