
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.housearrest.block.entity.WorkshopoftheInfernalFlameBlockEntity;
import net.mcreator.housearrest.HouseArrestMod;

public class HouseArrestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HouseArrestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WORKSHOP_OF_THE_INFERNAL_FLAME = register("workshop_of_the_infernal_flame", HouseArrestModBlocks.WORKSHOP_OF_THE_INFERNAL_FLAME, WorkshopoftheInfernalFlameBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
