package net.theender.lasercraft.blocks;

import net.minecraft.block.material.Material;

/**
 * Created by TheAlmightyJoshGreen on 24/06/2014.
 */
public class BlockLaserEmitter extends BlockLC {

    public BlockLaserEmitter() {
        super(Material.iron);
        this.setHardness(2.5f);
        this.setBlockName("laserEmitter");
    }
}
