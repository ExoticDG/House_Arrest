
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.housearrest.item.TakeMeBackItem;
import net.mcreator.housearrest.item.RecpieBookItem;
import net.mcreator.housearrest.item.FireballInfusedWoodItem;
import net.mcreator.housearrest.HouseArrestMod;

public class HouseArrestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HouseArrestMod.MODID);
	public static final RegistryObject<Item> FERAL_WOLF_LOONA_SPAWN_EGG = REGISTRY.register("feral_wolf_loona_spawn_egg", () -> new ForgeSpawnEggItem(HouseArrestModEntities.FERAL_WOLF_LOONA, -1, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> FERAL_WOLF_NOVA_SPAWN_EGG = REGISTRY.register("feral_wolf_nova_spawn_egg", () -> new ForgeSpawnEggItem(HouseArrestModEntities.FERAL_WOLF_NOVA, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WORKSHOP_OF_THE_INFERNAL_FLAME = block(HouseArrestModBlocks.WORKSHOP_OF_THE_INFERNAL_FLAME);
	public static final RegistryObject<Item> FIREBALL_INFUSED_WOOD = REGISTRY.register("fireball_infused_wood", () -> new FireballInfusedWoodItem());
	public static final RegistryObject<Item> TAKE_ME_BACK = REGISTRY.register("take_me_back", () -> new TakeMeBackItem());
	public static final RegistryObject<Item> NON_DISTRUCTIVE_TNT = block(HouseArrestModBlocks.NON_DISTRUCTIVE_TNT);
	public static final RegistryObject<Item> RECPIE_BOOK = REGISTRY.register("recpie_book", () -> new RecpieBookItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
