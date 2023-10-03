package com.lost.vcooking.item;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.lost.vcooking.VCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBaseMeta extends ItemBase	{
	
	private static ArrayList<metaitem> metaitems = Lists.newArrayList();

	public ItemBaseMeta(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public String getTranslationKey(ItemStack stack)
    {
		int metadata = stack.getMetadata();
		if (metadata > (metaitems.size() - 1) ) {
			return name + ".error";
		} else {
			return name+ "." + metaitems.get(metadata).getName();
		}
    }
	
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
        	for (int i = 0; i < metaitems.size(); i ++) {
        		items.add(new ItemStack(this, 1, i));
        	}
        }
    }
	
	public void registerItemModels() {
		for (int i = 0; i < metaitems.size(); i ++) {
			VCooking.proxy.registerItemRenderer(this, i, metaitems.get(i).getName());
		}
	}
	
	@Override
	public ItemBaseMeta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public ItemBaseMeta addMetaItem(String name) {
		metaitems.add( new metaitem(name) );
		return this;
	}
	
	class metaitem {
		String itemName;
		ItemStack containerItem;
		
		public metaitem(String Name) {
			this.itemName = Name;
		}
		
		public metaitem(String Name, ItemStack containeritem) {
			this.itemName = Name;
			this.containerItem = containeritem;
		}
		
		public String getName() {
			return this.itemName;
		}
		
		public ItemStack getContainerItem() {
			return this.containerItem;
		}
	}

}
