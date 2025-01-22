
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.housearrest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HouseArrestModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == HouseArrestModVillagerProfessions.BLAZESMITH.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.BLAZE_ROD), 10, 5, 0.05f));
		}
	}
}
