package net.theender.lasercraft.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.theender.lasercraft.items.ItemL;

public class LaserTab extends CreativeTabs {
	public static final LaserTab instance = new LaserTab();

	public LaserTab(){
		super("LaserCraft");
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return "LaserCraft";
	}

    public Item getTabIconItem() {
        return new ItemL();
    }

}
