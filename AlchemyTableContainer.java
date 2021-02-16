package com.The_Titan_Omega.AlchemyMod.inventory.container;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.CraftingResultSlot;
import net.minecraft.inventory.container.Slot;
import net.minecraft.util.IWorldPosCallable;

public class AlchemyTableContainer extends Container {
	private final CraftingInventory craftMatrix = new CraftingInventory(this, 3, 3);
	private final CraftResultInventory craftResult = new CraftResultInventory();
	private IWorldPosCallable pos;
	private PlayerEntity player;
	public AlchemyTableContainer(int id, PlayerInventory playerInventory) {
		this(id, playerInventory, IWorldPosCallable.DUMMY);
	}

	public AlchemyTableContainer(int id, PlayerInventory playerInventory, IWorldPosCallable pos)
	{
		super(ContainerType.CRAFTING, id);
		this.pos = pos;
		this.player = playerInventory.player;
	      this.addSlot(new CraftingResultSlot(playerInventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));

	      for(int i = 0; i < 3; ++i) {
	         for(int j = 0; j < 3; ++j) {
	            this.addSlot(new Slot(this.craftMatrix, j + i * 3, 30 + j * 18, 17 + i * 18));
	         }
	      }

	      for(int k = 0; k < 3; ++k) {
	         for(int i1 = 0; i1 < 9; ++i1) {
	            this.addSlot(new Slot(playerInventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
	         }
	      }

	      for(int l = 0; l < 9; ++l) {
	         this.addSlot(new Slot(playerInventory, l, 8 + l * 18, 142));
	      }
	}

	public boolean canInteractWith(PlayerEntity playerIn) {
		return isWithinUsableDistance(this.pos, playerIn, Blocks.CRAFTING_TABLE);
	}
	
}
