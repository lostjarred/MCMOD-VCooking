package com.lost.vcooking.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemBaseTool extends ItemBase {

	public ItemBaseTool(String name) {
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
	
	@Override
	public ItemBaseTool setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
