package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OredictHandler {
	public static void RegisterOreDicts() {
		System.out.println("Registering Ore dicts");
		OreDictionary.registerOre("itemFlour", ModItems.FLOUR);
		OreDictionary.registerOre("itemFlour", new ItemStack(ModItems.ITEMS, 2) );
		OreDictionary.registerOre("itemDough", new ItemStack(ModItems.ITEMS, 3) );
	}
}
