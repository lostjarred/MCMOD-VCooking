package com.lost.vcooking.item;

import net.minecraft.item.ItemStack;

public class ItemBaseMetaTool extends ItemBaseMeta {

	public ItemBaseMetaTool(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack item = itemStack.copy();
        return item;
    }
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

}
