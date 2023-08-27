package com.lost.vcooking;

import com.lost.vcooking.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = VCooking.MODID, name = VCooking.NAME, version = VCooking.VERSION)
public class VCooking {
	public static final String MODID = "vcooking";
	public static final String NAME = "Vanilla Cookings";
	public static final String VERSION = "0.1.0";
	
	@Mod.Instance(MODID)
	public static VCooking instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@SidedProxy(serverSide = "com.lost.vcooking.proxy.CommonProxy", clientSide= "com.lost.vcooking.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			
		}
		
	}
}
