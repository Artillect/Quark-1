/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 * 
 * File Created @ [19/06/2016, 22:33:48 (GMT)]
 */
package vazkii.quark.decoration.feature;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.quark.base.Quark;
import vazkii.quark.base.handler.RecipeHandler;
import vazkii.quark.base.lib.LibEntityIDs;
import vazkii.quark.base.module.Feature;
import vazkii.quark.decoration.client.render.RenderColoredItemFrame;
import vazkii.quark.decoration.entity.EntityColoredItemFrame;
import vazkii.quark.decoration.item.ItemColoredItemFrame;

public class ColoredItemFrames extends Feature {
	
	public static Item colored_item_frame;

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		colored_item_frame = new ItemColoredItemFrame();

		EntityRegistry.registerModEntity(EntityColoredItemFrame.class, "quark:colored_item_frame", LibEntityIDs.COLORED_ITEM_FRAME, Quark.instance, 256, 64, false);
		
        String[] dyes = {
            "Black",
            "Red",
            "Green",
            "Brown",
            "Blue",
            "Purple",
            "Cyan",
            "LightGray",
            "Gray",
            "Pink",
            "Lime",
            "Yellow",
            "LightBlue",
            "Magenta",
            "Orange",
            "White"
        };
		
		for(int i = 0; i < 16; i++)
			RecipeHandler.addShapelessOreDictRecipe(new ItemStack(colored_item_frame, 1, i), new ItemStack(Items.ITEM_FRAME), "dye" + dyes[15 - i]);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void preInitClient(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityColoredItemFrame.class, RenderColoredItemFrame.FACTORY);
	}

}
