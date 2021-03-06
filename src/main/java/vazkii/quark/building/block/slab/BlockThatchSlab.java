/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 *
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 * File Created @ [20/03/2016, 22:55:17 (GMT)]
 */
package vazkii.quark.building.block.slab;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import vazkii.quark.base.block.BlockModSlab;

public class BlockThatchSlab extends BlockModSlab {

	public BlockThatchSlab(boolean doubleSlab) {
		super("thatch_slab", Material.PLANTS, doubleSlab);
		setHardness(0.5F);
		setSoundType(SoundType.PLANT);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
