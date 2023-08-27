package com.lost.vcooking.item;

import com.lost.vcooking.VCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {

	protected String name;
	
	public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		setTranslationKey(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		VCooking.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemFoodBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
