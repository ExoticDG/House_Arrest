
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.housearrest.client.gui.WOTIFGUIScreen;
import net.mcreator.housearrest.client.gui.RecipeBookGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HouseArrestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HouseArrestModMenus.WOTIFGUI.get(), WOTIFGUIScreen::new);
			MenuScreens.register(HouseArrestModMenus.RECIPE_BOOK_GUI.get(), RecipeBookGUIScreen::new);
		});
	}
}
