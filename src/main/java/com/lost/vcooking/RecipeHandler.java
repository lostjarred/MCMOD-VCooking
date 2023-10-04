package com.lost.vcooking;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class RecipeHandler {
		public static void registerSmeltingRecipes() {
			System.out.println("Registering smelting recipes");
			GameRegistry.addSmelting(new ItemStack(ModItems.ITEMS, 1 ,1), new ItemStack(ModItems.ITEMSFOOD, 1, 0), 0);
			GameRegistry.addSmelting(new ItemStack(ModItems.ITEMS, 1 ,2), new ItemStack(ModItems.ITEMS, 1 ,3), 0);
		}
		
		public static void removeRecipes(IForgeRegistryModifiable<IRecipe> registry) {
			System.out.println("Removing recipes");
			System.out.println("Removing Minecraft Bread recipe");
			registry.remove(new ResourceLocation("minecraft:bread") );
		}
}
