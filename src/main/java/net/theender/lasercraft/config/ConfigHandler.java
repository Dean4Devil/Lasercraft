package thatjoshgreen.lasercraft.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import thatjoshgreen.lasercraft.blocks.BlockInfo;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.LASERBLOCK_ID = config.getBlock(BlockInfo.LASERBLOCK_KEY, BlockInfo.LASERBLOCK_DEFAULT).getInt();
		
		config.save();
	}

}
