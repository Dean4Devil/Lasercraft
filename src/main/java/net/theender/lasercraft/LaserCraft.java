package net.theender.lasercraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.theender.lasercraft.init.ModBlocks;
import net.theender.lasercraft.init.ModItems;
import net.theender.lasercraft.proxies.ServerProxy;
import net.theender.lasercraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LaserCraft {
	
	@Mod.Instance("lasercraft")
	public static LaserCraft instance;
	
	@SidedProxy(clientSide= Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	public static ServerProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//stub method apparently
        	//should probably stop writing sarcastic comments in the code....
        	//hmm, naa :P
		ModItems.init();
        ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent  event) {

		
		//ItemFile.registerRecipes();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//meep
	}

}
