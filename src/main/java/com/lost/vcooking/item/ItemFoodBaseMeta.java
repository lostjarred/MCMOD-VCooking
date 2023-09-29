package com.lost.vcooking.item;

public class ItemFoodBaseMeta extends ItemFoodBase {

	public ItemFoodBaseMeta(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, 0, 0, false);
		// TODO Auto-generated constructor stub
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
