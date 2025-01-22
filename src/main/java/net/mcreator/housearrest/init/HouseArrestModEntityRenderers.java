
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.housearrest.client.renderer.FeralWolfNovaRenderer;
import net.mcreator.housearrest.client.renderer.FeralWolfLoonaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HouseArrestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HouseArrestModEntities.FERAL_WOLF_LOONA.get(), FeralWolfLoonaRenderer::new);
		event.registerEntityRenderer(HouseArrestModEntities.FERAL_WOLF_NOVA.get(), FeralWolfNovaRenderer::new);
	}
}
