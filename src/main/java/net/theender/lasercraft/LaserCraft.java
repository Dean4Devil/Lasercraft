package net.theender.lasercraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.theender.lasercraft.items.ItemFile;
import net.theender.lasercraft.proxies.CommonProxy;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class LaserCraft {
	
	@Instance(ModInformation.ID)
	public static LaserCraft instance;
	
	@SidedProxy(clientSide="net.theender.lasercraft.proxies.ClientProxy", serverSide="net.theender.lasercraft.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//stub method apparently
        //should probably stop writing sarcastic comments in the code....
		ItemFile.init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent  event) {
		//Items.addNames();
		
		ItemFile.registerRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//meep
	}

}
