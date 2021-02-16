package com.The_Titan_Omega.AlchemyMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;

import com.The_Titan_Omega.AlchemyMod.inventory.container.AlchemyTableContainer;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.block.material.*;
import net.minecraftforge.common.ToolType;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;

public class AlchemyTableBlock extends Block {
	private static final ITextComponent CONTAINER_NAME = new TranslationTextComponent("container.alchemy_table");
	
	public AlchemyTableBlock()
	{
		super(
				AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 5f).
				harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2).sound(SoundType.METAL)
		);
	}
	
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
	{
		player.openContainer(state.getContainer(worldIn, pos));
		return ActionResultType.CONSUME;
	}
	
	public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
	      return new SimpleNamedContainerProvider((id, inventory, player) -> {
	         return new AlchemyTableContainer(id, inventory, IWorldPosCallable.of(worldIn, pos));
	      }, CONTAINER_NAME);
	   }
}
