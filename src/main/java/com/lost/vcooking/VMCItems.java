package com.lost.vcooking;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.registries.IForgeRegistry;

public class VMCItems {
	private static String modname = "minecraft";
	
	public static final Item MUSHROOM_STEW_OVERRIDE = new ItemSoup(6).setTranslationKey("mushroomStew").setRegistryName(modname, "mushroom_stew");
	public static final Item BREAD_OVERIDE = new ItemFood(6, 0.6f, false).setTranslationKey("bread").setRegistryName(modname, "bread");
	public static final Item PORKCHOP = new ItemFood(3, 0.3f, true).setTranslationKey("porkchopRaw").setRegistryName(modname, "porkchop");
	
	public static final Item COOKED_PORKSCHOP = new ItemFood(8, 0.8f, true).setTranslationKey("porkchopCooked").setRegistryName(modname, "cooked_porkchop");
	
	//TODO
	public static final Item FISH = new Item();
	public static final Item FISH_COOKED = new Item();
	//
	
	public static final Item COOKIE_OVERIDE = new ItemFood(2, 0.1f, false).setTranslationKey("cookie").setRegistryName(modname, "cookie");
	public static final Item MELON_OVERIDE = new ItemFood(2, 0.3f, false).setTranslationKey("melon").setRegistryName(modname, "melon");
	public static final Item BEEF_OVERIDE = new ItemFood(3, 0.3f, true).setTranslationKey("beef").setRegistryName(modname, "beefRaw");
	
	public static final Item COOKED_BEEF_OVERIDE = new ItemFood(8, 0.8f, true).setTranslationKey("beefcooked").setRegistryName(modname, "cooked_beef");
	public static final Item CHIECKEN_OVERIDE = new ItemFood(2, 0.3f, true).setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.3f).setTranslationKey("chickenRaw").setRegistryName(modname, "chicken");
	public static final Item COOKED_CHICKEN_OVERIDE = new ItemFood(6, 0.6f, true).setTranslationKey("chickenCooked").setRegistryName(modname, "chickenCooked");
	
	
	
	
	public static void register_Overide(IForgeRegistry<Item> registry) {
		System.out.println("registering Minecraft Item Overrides");
		System.out.println("Overriding Bread");
		registry.register(BREAD_OVERIDE);
	}
}
