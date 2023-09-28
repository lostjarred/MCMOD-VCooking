package com.lost.vcooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class VCookingCreativeTab extends CreativeTabs {

	public VCookingCreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.DOUGH);
	}

}
