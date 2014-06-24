package net.theender.lasercraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.theender.lasercraft.blocks.BlockLC;
import net.theender.lasercraft.blocks.BlockLaserEmitter;
import net.theender.lasercraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockLC laserEmitter = new BlockLaserEmitter();

    public static void init() {
        GameRegistry.registerBlock(laserEmitter, "Laser Emitter");
    }
}
