package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
		public static void registersmeltingrecipes() {
			System.out.println("Registering smelting recipes");
			GameRegistry.addSmelting(ModItems.DOUGH, new ItemStack(ModItems.FLATBREAD), 0);
		}
}
