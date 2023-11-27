package com.lost.vcooking;

import com.lost.vcooking.block.BlockVCMelon;

import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class VMCBlocks {
	public static Block MELON_BLOCK = new BlockVCMelon().setHardness(1.0F).setTranslationKey("melon").setRegistryName("minecraft", "melon_block");
	
	public static void register_overrides(IForgeRegistry<Block> registry) {
		System.out.println("registering Minecraft Block Overrides");
		System.out.println("Overriding Melon");
		registry.register(MELON_BLOCK);
	}
}