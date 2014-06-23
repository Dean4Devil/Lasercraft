package net.theender.lasercraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.theender.lasercraft.utils.LaserTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemLens extends Item {
	

	
	public ItemLens() {
		super();
		this.setCreativeTab(LaserTab.instance);
		this.setUnlocalizedName(ItemInfo.LENS_UNLOCALISED_NAME);
	}

    @SideOnly(Side.CLIENT)
    private IIcon icon;

    @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.LENS_ICON);
	}
	

}
