package net.theender.lasercraft.utils;

import net.minecraft.creativetab.CreativeTabs;

public class LaserTab extends CreativeTabs {
	public static final LaserTab instance = new LaserTab();
	
	public LaserTab(){
		super("LaserCraft");
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return "LaserCraft";
	}

}
