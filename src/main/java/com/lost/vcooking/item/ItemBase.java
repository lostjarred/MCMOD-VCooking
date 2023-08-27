package com.lost.vcooking.item;

import com.lost.vcooking.VCooking;

import net.minecraft.item.Item;

public class ItemBase extends Item {
	protected String name;
	
	public ItemBase(String name){
		this.name = name;
		setTranslationKey(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		VCooking.proxy.registerItemRenderer(this, 0, name);
	}
}