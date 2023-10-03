package com.lost.vcooking.item;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.lost.vcooking.VCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBaseMeta extends ItemBase	{
	
	private ArrayList<metaitem> metaitems = Lists.newArrayList();

	public ItemBaseMeta(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public String getTranslationKey(ItemStack stack)
    {
		int metadata = stack.getMetadata();
		if (metadata > this.metaitems.size() ) {
			return name + ".error";
		} else {
			return name+ "." + this.metaitems.get(metadata).getName();
		}
    }
	
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
        	for (int i = 0; i < this.metaitems.size(); i ++) {
        		items.add(new ItemStack(this, 1, i));
        	}
        }
    }
	
	public void registerItemModels() {
		for (int i = 0; i < this.metaitems.size(); i ++) {
			VCooking.proxy.registerItemRenderer(this, i, this.metaitems.get(i).getName());
		}
	}
	
	@Override
	public ItemBaseMeta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack)
    {
		int metadata = stack.getMetadata();
		if (metadata > this.metaitems.size()) {
			return false;
		} else {
			if (this.metaitems.get(metadata).getContainerItem() == null) {
				return false;
			} else {
				return true;
			}
		}
    }
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (!this.hasContainerItem(itemStack))
        {
            return ItemStack.EMPTY;
        }
        int metadata = itemStack.getMetadata();
        ItemStack item = this.metaitems.get(metadata).getContainerItem().copy();
        return item;
    }
	
	
	//Meta item stuff
	public ItemBaseMeta addMetaItem(String name) {
		this.metaitems.add( new metaitem(name) );
		return this;
	}
	
	public ItemBaseMeta addMetaItem(String name, ItemStack containeritem) {
		this.metaitems.add( new metaitem(name, containeritem) );
		return this;
	}
	
	class metaitem {
		String itemName;
		ItemStack containerItem;
		
		public metaitem(String Name) {
			this.itemName = Name;
			this.containerItem = null;
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
