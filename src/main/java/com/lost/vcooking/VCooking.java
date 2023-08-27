package com.lost.vcooking;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = VCooking.MODID, name = VCooking.NAME, version = VCooking.VERSION)
public class VCooking {
	public static final String MODID = "vcooking";
	public static final String NAME = "Vanilla Cookings";
	public static final String VERSION = "0.1.0";
	
	@Mod.Instance(MODID)
	public static VCooking instance;
}
