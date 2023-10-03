package com.lost.vcooking;

import com.lost.vcooking.item.ItemBase;
import com.lost.vcooking.item.ItemBaseMeta;
import com.lost.vcooking.item.ItemBaseMetaTool;
import com.lost.vcooking.item.ItemBaseTool;
import com.lost.vcooking.item.ItemFoodBase;
import com.lost.vcooking.item.ItemFoodBaseMeta;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase FLOUR = new ItemBase("flour").setCreativeTab(VCooking.CREATIVETAB);
	public static ItemFoodBase FLATBREAD = new ItemFoodBase("flatbread", 3, 0.6f).setCreativeTab(VCooking.CREATIVETAB);
	public static ItemBase LOAFPAN = new ItemBase("loafpan").setCreativeTab(VCooking.CREATIVETAB);
	public static ItemBase DOUGH = new ItemBase("dough").setCreativeTab(VCooking.CREATIVETAB);
	public static ItemBase FILLED_LOAFPAN = new ItemBase("filledloafpan").setCreativeTab(VCooking.CREATIVETAB);
	public static ItemBase FILLED_LOAFPAN_2 = new ItemBase("filledloafpan_2").setCreativeTab(VCooking.CREATIVETAB).setContainerItem(LOAFPAN);
	public static ItemBaseTool MIXING_BOWL = new ItemBaseTool("mixingbowl").setCreativeTab(VCooking.CREATIVETAB);
	public static ItemBaseTool MORTAR_PESTILE = new ItemBaseTool("mortarpestile").setCreativeTab(VCooking.CREATIVETAB);
	
	
	public static ItemBaseMeta ITEMS = new ItemBaseMeta("items").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("flour")
			.addMetaItem("loafpan")
			.addMetaItem("dough")
			.addMetaItem("filledloafpan")
			.addMetaItem("filledloafpan2")
			;
	
	public static ItemFoodBaseMeta ITEMSFOOD = new ItemFoodBaseMeta("itemfoods").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaFoodItem("flatbread", 1, 1)
			;
	
	public static ItemBaseMeta ITEMSTOOL = new ItemBaseMetaTool("itemtools").setCreativeTab(VCooking.CREATIVETAB)
			.addMetaItem("mixingbowl")
			.addMetaItem("mortarpestile")
			;
	
	public static void register(IForgeRegistry<Item> registry) {
		System.out.println("registering items");
		registry.register(FLOUR);
		registry.register(FLATBREAD);
		registry.register(LOAFPAN);
		registry.register(DOUGH);
		registry.register(FILLED_LOAFPAN);
		registry.register(MIXING_BOWL);
		registry.register(FILLED_LOAFPAN_2);
		registry.register(MORTAR_PESTILE);
		registry.register(ITEMS);
		registry.register(ITEMSFOOD);
		registry.register(ITEMSTOOL);
	}
	
	public static void registerModels() {
		System.out.println("registering item models");
		FLOUR.registerItemModel();
		FLATBREAD.registerItemModel();
		LOAFPAN.registerItemModel();
		FILLED_LOAFPAN.registerItemModel();
		MIXING_BOWL.registerItemModel();
		DOUGH.registerItemModel();
		FILLED_LOAFPAN_2.registerItemModel();
		MORTAR_PESTILE.registerItemModel();
		System.out.println("registering meta item models");
		ITEMS.registerItemModels();
		ITEMSFOOD.registerItemModels();
		ITEMSTOOL.registerItemModels();
	}
}
