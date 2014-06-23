package net.theender.lasercraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.theender.lasercraft.items.ItemLens;
import net.theender.lasercraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Items {

    public static final Item Lens = new ItemLens();

    public static void init() {
        GameRegistry.registerItem(Lens, "Lens");
    }
}
