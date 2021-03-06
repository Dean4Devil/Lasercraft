package net.theender.lasercraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.theender.lasercraft.reference.Textures;
import net.theender.lasercraft.utils.LaserTab;

public class ItemLC extends Item {

	public ItemLC() {
		super();
		this.setCreativeTab(LaserTab.instance);
        this.maxStackSize = 1;
	}

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
    public String getUnlocalizedName( ItemStack itemStack) {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Textures.RESOURCE_PREFIX  + getUnwrappedUnlocalizedName(super.getUnlocalizedName()).toLowerCase());
    }

}
