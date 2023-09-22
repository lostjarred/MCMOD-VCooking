package com.lost.vcooking.item;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class ItemBaseMeta extends ItemBase	{
	
	private static ArrayList<metaitem> items = Lists.newArrayList();

	public ItemBaseMeta(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public ItemBaseMeta addMetaItem(String name) {
		items.add(new metaitem(name));
		return this;
	}
	
	class metaitem {
		String itemName;
		
		public metaitem(String Name) {
			this.itemName = Name;
		}
	}

}
