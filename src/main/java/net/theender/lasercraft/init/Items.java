package net.theender.lasercraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.theender.lasercraft.items.ItemL;
import net.theender.lasercraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Items {

    public static final ItemL Lens = new ItemGlassLens();

    public static void init() {
        GameRegistry.registerItem(Lens, "Lens");
    }
}
