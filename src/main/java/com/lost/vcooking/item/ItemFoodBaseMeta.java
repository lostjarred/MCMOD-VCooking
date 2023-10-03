package com.lost.vcooking.item;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemFoodBaseMeta extends ItemFoodBase {

	private ArrayList<ItemFoodMeta> metaitems = Lists.newArrayList();
	
	public ItemFoodBaseMeta(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, 0, 0, false);
		// TODO Auto-generated constructor stub
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
	
	
	@Override
	public int getHealAmount(ItemStack stack)
    {
		int foodvalue = 0;
        int metadata = stack.getMetadata();
        if ( metadata > this.metaitems.size() ) {
        	return foodvalue;
        } else {
        	foodvalue = this.metaitems.get(metadata).getFoodValue();
        	return foodvalue;
        }
    }
	
	@Override
    public float getSaturationModifier(ItemStack stack)
    {
		int satvalue = 0;
		int metadata = stack.getMetadata();
		
		if ( metadata > this.metaitems.size() ) {
        	return satvalue;
        } else {
        	satvalue = this.metaitems.get(metadata).getSaturation();
        	return satvalue;
        }
    }
	
	//meta food item class stuff
	public ItemFoodBaseMeta addMetaFoodItem(String name, int foodvalue, int saturation) {
		this.metaitems.add( new ItemFoodMeta(name, foodvalue, saturation) );
		return this;
	}
	
	class ItemFoodMeta {
		String name;
		int foodvalue;
		int saturation;
		
		ItemFoodMeta(String itemname, int itemfoodvalue, int itemsaturation){
			this.name = itemname;
			this.foodvalue = itemfoodvalue;
			this.saturation = itemsaturation;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getFoodValue() {
			return this.foodvalue;
		}
		
		public int getSaturation() {
			return this.saturation;
		}
	}

}
