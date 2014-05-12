package net.theender.lasercraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import net.theender.lasercraft.utils.LaserTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemLens extends Item {
	
	@SideOnly(Side.CLIENT)
	private Icon icon;
	
	public ItemLens(int id) {
		super(id);
		setCreativeTab(LaserTab.instance);
		setUnlocalizedName(ItemInfo.LENS_UNLOCALISED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.LENS_ICON);
	}
	

}
