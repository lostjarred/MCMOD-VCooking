package com.lost.vcooking;

import com.lost.vcooking.item.meta.ItemBaseMeta;
import com.lost.vcooking.item.meta.ItemBaseMetaTool;
import com.lost.vcooking.item.meta.ItemFoodBaseMeta;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBaseMeta ITEMCONTAINERS = new ItemBaseMeta("itemcontainers").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("loafpan")
			;
	
	public static ItemStack EMPTYLOAFPAN = new ItemStack(ModItems.ITEMCONTAINERS, 1, 0);
	
	public static ItemBaseMeta ITEMS = new ItemBaseMeta("items").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("flour")
			.addMetaItem("dough")
			.addMetaItem("filledloafpan")
			.addMetaItem("filledloafpan2", EMPTYLOAFPAN)
			;
	
	public static ItemStack FILLEDLOAFPAN = new ItemStack(ModItems.ITEMS, 1, 2);
	public static ItemStack COOKEDLOAFPAN = new ItemStack(ModItems.ITEMS, 1, 3);
	public static ItemStack DOUGH = new ItemStack(ModItems.ITEMS, 1, 1);
	public static ItemStack FLOUR = new ItemStack(ModItems.ITEMS, 1, 0);
	
	public static ItemFoodBaseMeta ITEMSFOOD = new ItemFoodBaseMeta("itemfoods").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaFoodItem("flatbread", 3, 0.6f)
			;
	
	public static ItemStack FLATBREAD = new ItemStack(ModItems.ITEMSFOOD, 1, 0);
	
	public static ItemBaseMeta ITEMSTOOL = new ItemBaseMetaTool("itemtools").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("mixingbowl")
			.addMetaItem("mortarpestile")
			;
	
	
	
	public static void register(IForgeRegistry<Item> registry) {
		System.out.println("registering items");
		System.out.println("registering meta items");
		registry.register(ITEMS);
		registry.register(ITEMSFOOD);
		registry.register(ITEMSTOOL);
		registry.register(ITEMCONTAINERS);
	}
	
	public static void registerModels() {
		System.out.println("registering item models");
		System.out.println("registering meta item models");
		ITEMS.registerItemModels();
		ITEMSFOOD.registerItemModels();
		ITEMSTOOL.registerItemModels();
		ITEMCONTAINERS.registerItemModels();
	}
}
