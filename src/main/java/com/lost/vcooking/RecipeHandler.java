package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
		public static void registerSmeltingRecipes() {
			System.out.println("Registering smelting recipes");
			GameRegistry.addSmelting(ModItems.DOUGH, new ItemStack(ModItems.FLATBREAD), 0);
			GameRegistry.addSmelting(ModItems.FILLED_LOAFPAN, new ItemStack(ModItems.FILLED_LOAFPAN_2), 0);
		}
}
