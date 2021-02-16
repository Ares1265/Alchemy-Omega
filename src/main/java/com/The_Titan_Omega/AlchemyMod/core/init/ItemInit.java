package com.The_Titan_Omega.AlchemyMod.core.init;

import com.The_Titan_Omega.AlchemyMod.AlchemyMod;
import com.The_Titan_Omega.AlchemyMod.common.items.SpecialItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemyMod.MOD_ID);
	
	public static final RegistryObject<Item> Example_Item = ITEMS.register("example_item", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> lead_ingot = ITEMS.register("lead_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<SpecialItem> Special = ITEMS.register("special_item", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	//block items
	public static final RegistryObject<BlockItem> lead_ore = ITEMS.register("lead_ore",
			() -> new BlockItem(BlockInit.lead_ore.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> copper_ore = ITEMS.register("copper_ore",
			() -> new BlockItem(BlockInit.copper_ore.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> tin_ore = ITEMS.register("tin_ore",
			() -> new BlockItem(BlockInit.tin_ore.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> alchemy_table = ITEMS.register("alchemy_table",
			() -> new BlockItem(BlockInit.alchemy_table.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> lead_block = ITEMS.register("lead_block",
			() -> new BlockItem(BlockInit.lead_block.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
