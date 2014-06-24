package net.theender.lasercraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.theender.lasercraft.utils.LaserTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemL extends Item {

	public ItemL() {
		super();
		this.setCreativeTab(LaserTab.instance);
        this.maxStackSize = 1;
	}

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", ItemInfo.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
    public String getUnlocalizedName( ItemStack itemStack) {
        return String.format("item.%s%s", ItemInfo.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.LENS_ICON);
	}

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}