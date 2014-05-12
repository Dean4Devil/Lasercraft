package net.theender.lasercraft;

import net.theender.lasercraft.items.Items;
import net.theender.lasercraft.network.PacketHandler;
import net.theender.lasercraft.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class LaserCraft {
	
	@Instance(ModInformation.ID)
	public static LaserCraft instance;
	
	@SidedProxy(clientSide="net.theender.lasercraft.proxies.ClientProxy", serverSide="net.theender.lasercraft.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//stub method apparently
		Items.init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent  event) {
		Items.addNames();
		
		Items.registerRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//meep
	}

}
