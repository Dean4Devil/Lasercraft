package net.theender.lasercraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.theender.lasercraft.items.ItemGlassLens;
import net.theender.lasercraft.items.ItemLC;
import net.theender.lasercraft.items.ItemLaserDiode;
import net.theender.lasercraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemLC Lens = new ItemGlassLens();
    public static final ItemLC Diode = new ItemLaserDiode();

    public static void init() {
        GameRegistry.registerItem(Lens, "Lens");
        GameRegistry.registerItem(Diode, "LaserDiode");
    }
}
