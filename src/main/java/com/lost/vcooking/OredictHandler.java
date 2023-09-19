package com.lost.vcooking;

import net.minecraftforge.oredict.OreDictionary;

public class OredictHandler {
	public static void RegisterOreDicts() {
		System.out.println("Registering Ore dicts");
		OreDictionary.registerOre("itemFlour", ModItems.FLOUR);
	}
}
