package com.lost.vcooking;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.registries.IForgeRegistry;

public class VMCItems {
	public static final Item BREAD_OVERIDE = new ItemFood(6, 0.6f, false).setTranslationKey("bread").setRegistryName("minecraft", "bread");
	
	public static void register_Overide(IForgeRegistry<Item> registry) {
		System.out.println("registering Minecraft Item Overrides");
		registry.register(BREAD_OVERIDE);
	}
}
