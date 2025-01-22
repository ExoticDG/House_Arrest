
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.housearrest.block.WorkshopoftheInfernalFlameBlock;
import net.mcreator.housearrest.block.NonDistructiveTNTBlock;
import net.mcreator.housearrest.HouseArrestMod;

public class HouseArrestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HouseArrestMod.MODID);
	public static final RegistryObject<Block> WORKSHOP_OF_THE_INFERNAL_FLAME = REGISTRY.register("workshop_of_the_infernal_flame", () -> new WorkshopoftheInfernalFlameBlock());
	public static final RegistryObject<Block> NON_DISTRUCTIVE_TNT = REGISTRY.register("non_distructive_tnt", () -> new NonDistructiveTNTBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
