package net.theender.lasercraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.theender.lasercraft.reference.Textures;
import net.theender.lasercraft.utils.LaserTab;

/**
 * Created by TheAlmightyJoshGreen on 24/06/2014.
 */
public class BlockLC extends Block {

    public BlockLC(Material material) {
        super(material);
        this.setCreativeTab(LaserTab.instance);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons( IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName( String unlocalozedname) {
        return unlocalozedname.substring(unlocalozedname.indexOf(".") + 1);
    }
}
