
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HouseArrestModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> FERAL_CHANCE = GameRules.register("feralChance", GameRules.Category.MOBS, GameRules.IntegerValue.create(20));
	public static final GameRules.Key<GameRules.IntegerValue> PERMADEATH_CHANCE = GameRules.register("permadeathChance", GameRules.Category.PLAYER, GameRules.IntegerValue.create(0));
}
