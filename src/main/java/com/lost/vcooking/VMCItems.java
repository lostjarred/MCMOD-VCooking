package com.lost.vcooking;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.registries.IForgeRegistry;

public class VMCItems {
	private static String modname = "minecraft";
	public static final Item BREAD_OVERIDE = new ItemFood(6, 0.6f, false).setTranslationKey("bread").setRegistryName(modname, "bread");
	
	public static void register_Overide(IForgeRegistry<Item> registry) {
		System.out.println("registering Minecraft Item Overrides");
		System.out.println("Overriding Bread");
		registry.register(BREAD_OVERIDE);
	}
}
