package net.theender.lasercraft.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemFile {
	
	public static Item lens;
	
	public static void init() {
		lens = new ItemLens();
	}
	/*
	public static void addNames() {
		LanguageRegistry.addName(lens, "Lens");
		
		
	}*/
	
	public static void registerRecipes() {
		GameRegistry.addRecipe(new ItemStack(lens), 
				new Object[] { 	" / ", 
								"/G/", 
								" / ", 
								'G', Blocks.glass,
								'/', Items.stick
							 });
	}

}
