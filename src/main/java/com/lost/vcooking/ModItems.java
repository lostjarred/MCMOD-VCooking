package com.lost.vcooking;

import com.lost.vcooking.item.ItemBase;
import com.lost.vcooking.item.ItemBaseTool;
import com.lost.vcooking.item.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase FLOUR = new ItemBase("flour").setCreativeTab(CreativeTabs.FOOD);
	public static ItemFoodBase FLATBREAD = new ItemFoodBase("flatbread", 3, 0.6f, false).setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase LOAFPAN = new ItemBase("loafpan").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase DOUGH = new ItemBase("dough").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase FILLED_LOAFPAN = (ItemBase) new ItemBase("filledloafpan").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase FILLED_LOAFPAN_2 = (ItemBase) new ItemBase("filledloafpan_2").setCreativeTab(CreativeTabs.FOOD).setContainerItem(LOAFPAN);
	public static ItemBaseTool MIXING_BOWL = new ItemBaseTool("mixingbowl").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBaseTool MORTAR_PESTILE = new ItemBaseTool("mortarpestile").setCreativeTab(CreativeTabs.FOOD);
	
	
	
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
	}
}
