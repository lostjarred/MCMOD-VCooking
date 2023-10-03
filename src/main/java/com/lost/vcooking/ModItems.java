package com.lost.vcooking;

import com.lost.vcooking.item.ItemBase;
import com.lost.vcooking.item.ItemBaseMeta;
import com.lost.vcooking.item.ItemBaseMetaTool;
import com.lost.vcooking.item.ItemBaseTool;
import com.lost.vcooking.item.ItemFoodBase;
import com.lost.vcooking.item.ItemFoodBaseMeta;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBaseMeta ITEMS = new ItemBaseMeta("items").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("flour")
			.addMetaItem("loafpan")
			.addMetaItem("dough")
			.addMetaItem("filledloafpan")
			;
	
	public static ItemStack EMPTYLOAFPAN = new ItemStack(ModItems.ITEMS, 1, 1);
	
	public static ItemBaseMeta CONTAINERITEMS = new ItemBaseMeta("containeritems").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("filledloafpan2", EMPTYLOAFPAN)
			;
	
	
	public static ItemFoodBaseMeta ITEMSFOOD = new ItemFoodBaseMeta("itemfoods").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaFoodItem("flatbread", 3, 0.6f)
			;
	
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
		registry.register(CONTAINERITEMS);
	}
	
	public static void registerModels() {
		System.out.println("registering item models");
		System.out.println("registering meta item models");
		ITEMS.registerItemModels();
		ITEMSFOOD.registerItemModels();
		ITEMSTOOL.registerItemModels();
		CONTAINERITEMS.registerItemModels();
	}
}
