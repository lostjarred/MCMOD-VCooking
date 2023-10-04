package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OredictHandler {
	public static void RegisterOreDicts() {
		System.out.println("Registering Ore dicts");
		OreDictionary.registerOre("itemFlour", ModItems.FLOUR );
		OreDictionary.registerOre("itemDough", ModItems.DOUGH );
		OreDictionary.registerOre("toolMixingBowl", new ItemStack( ModItems.ITEMSTOOL, 1, 0 ));
		OreDictionary.registerOre("toolMortarPestile", new ItemStack( ModItems.ITEMSTOOL, 1, 1 ));
	}
}
