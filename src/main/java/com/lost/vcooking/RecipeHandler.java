package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class RecipeHandler {
		public static void registerSmeltingRecipes() {
			System.out.println("Registering smelting recipes");
			GameRegistry.addSmelting(ModItems.DOUGH, new ItemStack(ModItems.FLATBREAD), 0);
			GameRegistry.addSmelting(ModItems.FILLED_LOAFPAN, new ItemStack(ModItems.FILLED_LOAFPAN_2), 0);
		}
		
		public static void removeRecipes(IForgeRegistryModifiable<IRecipe> registry) {
			System.out.println("Removing recipes");
			System.out.println("Removing Bread recipe");
			registry.remove(new ResourceLocation("minecraft:bread") );
		}
}
