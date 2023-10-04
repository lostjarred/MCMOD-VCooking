package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class RecipeHandler {
		public static void registerSmeltingRecipes() {
			System.out.println("Registering smelting recipes");
			GameRegistry.addSmelting(ModItems.DOUGH, ModItems.FLATBREAD, 0);
			GameRegistry.addSmelting(ModItems.FILLEDLOAFPAN, ModItems.COOKEDLOAFPAN, 0);
		}
		
		public static void removeRecipes(IForgeRegistryModifiable<IRecipe> registry) {
			System.out.println("Removing recipes");
			System.out.println("Removing Minecraft Bread recipe");
			registry.remove(new ResourceLocation("minecraft:bread") );
		}
}
