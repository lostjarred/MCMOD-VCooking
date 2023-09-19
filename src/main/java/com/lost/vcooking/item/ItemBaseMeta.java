package com.lost.vcooking.item;

public class ItemBaseMeta extends ItemBase	{

	public ItemBaseMeta(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

}
