
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.housearrest.HouseArrestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HouseArrestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HouseArrestMod.MODID);
	public static final RegistryObject<CreativeModeTab> HOUSE_ARREST_CT = REGISTRY.register("house_arrest_ct",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.house_arrest.house_arrest_ct")).icon(() -> new ItemStack(HouseArrestModBlocks.WORKSHOP_OF_THE_INFERNAL_FLAME.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HouseArrestModItems.FERAL_WOLF_LOONA_SPAWN_EGG.get());
				tabData.accept(HouseArrestModItems.FERAL_WOLF_NOVA_SPAWN_EGG.get());
				tabData.accept(HouseArrestModBlocks.WORKSHOP_OF_THE_INFERNAL_FLAME.get().asItem());
				tabData.accept(HouseArrestModItems.FIREBALL_INFUSED_WOOD.get());
				tabData.accept(HouseArrestModItems.TAKE_ME_BACK.get());
				tabData.accept(HouseArrestModBlocks.NON_DISTRUCTIVE_TNT.get().asItem());
				tabData.accept(HouseArrestModItems.RECPIE_BOOK.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HouseArrestModItems.FERAL_WOLF_LOONA_SPAWN_EGG.get());
			tabData.accept(HouseArrestModItems.FERAL_WOLF_NOVA_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(HouseArrestModBlocks.WORKSHOP_OF_THE_INFERNAL_FLAME.get().asItem());
		}
	}
}
