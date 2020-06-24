package com.example.examplemod.util;

import com.example.examplemod.lol;
import com.example.examplemod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


public class RegistryHandler 
{
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, lol.MOD_ID);
	
	public static void init() 
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//Items
	public static final RegistryObject<Item> METEORITE = ITEMS.register("meteorite", ItemBase::new);

}
