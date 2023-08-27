package com.lost.vcooking;

import com.lost.vcooking.item.ItemBase;
import com.lost.vcooking.item.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase FLOUR = new ItemBase("flour").setCreativeTab(CreativeTabs.FOOD);
	public static ItemFoodBase FLATBREAD = new ItemFoodBase("flatbread", 0, 0, false).setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase LOAFPAN = new ItemBase("loafpan").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase FILLED_LOAFPAN = new ItemBase("filledloafpan").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase MIXING_BOWL = new ItemBase("mixingbowl").setCreativeTab(CreativeTabs.FOOD);
	
	
	public static void register(IForgeRegistry<Item> registry) {
		System.out.println("registering items");
		registry.register(FLOUR);
		registry.register(FLATBREAD);
		registry.register(LOAFPAN);
		registry.register(FILLED_LOAFPAN);
		registry.register(MIXING_BOWL);
	}
	
	public static void registerModels() {
		System.out.println("registering item models");
		FLOUR.registerItemModel();
		FLATBREAD.registerItemModel();
		LOAFPAN.registerItemModel();
		FILLED_LOAFPAN.registerItemModel();
		MIXING_BOWL.registerItemModel();
	}
}
