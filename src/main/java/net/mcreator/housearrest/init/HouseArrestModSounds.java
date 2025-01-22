
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.housearrest.HouseArrestMod;

public class HouseArrestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HouseArrestMod.MODID);
	public static final RegistryObject<SoundEvent> TAKE_ME_BACK = REGISTRY.register("take_me_back", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("house_arrest", "take_me_back")));
	public static final RegistryObject<SoundEvent> HERE_COMES_THE_SUN = REGISTRY.register("here_comes_the_sun", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("house_arrest", "here_comes_the_sun")));
}
