package com.lost.vcooking.item;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.lost.vcooking.VCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBaseMeta extends ItemBase	{
	
	private static ArrayList<metaitem> items = Lists.newArrayList();

	public ItemBaseMeta(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public String getTranslationKey(ItemStack stack)
    {
		int metadata = stack.getMetadata();
		if (metadata > (items.size() - 1) ) {
			return name + ".error";
		} else {
			return name + items.get(metadata).getName();
		}
    }
	
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
        	for (int i = 0; i < (items.size() - 1); i ++) {
        		items.add(new ItemStack(this, 1, i));
        	}
        }
    }
	
	public void registerItemModels() {
		for (int i = 0; i < (items.size() - 1); i ++) {
			VCooking.proxy.registerItemRenderer(this, i, items.get(i).getName());
		}
	}
	
	public ItemBaseMeta addMetaItem(String name) {
		items.add( new metaitem(name) );
		return this;
	}
	
	class metaitem {
		String itemName;
		
		public metaitem(String Name) {
			this.itemName = Name;
		}
		
		public String getName() {
			return itemName;
		}
	}

}
