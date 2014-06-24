package net.theender.lasercraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;

/**
 * Created by JoshTheEnder on 24/06/2014.
 */
public class ItemGlassLens extends ItemL {

    public ItemGlassLens() {
        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName("glslns");
    }

    @SideOnly(Side.CLIENT)
    private IIcon icon;


}
