
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.housearrest.world.inventory.WOTIFGUIMenu;
import net.mcreator.housearrest.world.inventory.RecipeBookGUIMenu;
import net.mcreator.housearrest.HouseArrestMod;

public class HouseArrestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HouseArrestMod.MODID);
	public static final RegistryObject<MenuType<WOTIFGUIMenu>> WOTIFGUI = REGISTRY.register("wotifgui", () -> IForgeMenuType.create(WOTIFGUIMenu::new));
	public static final RegistryObject<MenuType<RecipeBookGUIMenu>> RECIPE_BOOK_GUI = REGISTRY.register("recipe_book_gui", () -> IForgeMenuType.create(RecipeBookGUIMenu::new));
}
