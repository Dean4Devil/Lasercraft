package net.theender.lasercraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item lens;
	
	public static void init() {
		lens = new ItemLens(ItemInfo.LENS_ID);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(lens, "Lens");
		
		
	}
	
	public static void registerRecipes() {
		GameRegistry.addRecipe(new ItemStack(lens), 
				new Object[] { 	" / ", 
								"/G/", 
								" / ", 
								'G', Block.glass,
								'/', Item.stick	
							 });
	}

}
