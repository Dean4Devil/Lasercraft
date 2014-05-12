package thatjoshgreen.lasercraft;

import thatjoshgreen.lasercraft.items.Items;
import thatjoshgreen.lasercraft.network.PacketHandler;
import thatjoshgreen.lasercraft.proxies.CommonProxy;
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
	
	@SidedProxy(clientSide="thatjoshgreen.lasercraft.proxies.ClientProxy", serverSide="thatjoshgreen.lasercraft.proxies.CommonProxy")
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
