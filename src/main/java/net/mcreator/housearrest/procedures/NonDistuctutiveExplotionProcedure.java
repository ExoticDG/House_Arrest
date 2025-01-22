package net.mcreator.housearrest.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.core.BlockPos;

public class NonDistuctutiveExplotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean griefing = false;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == true) {
			world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(false, world.getServer());
			griefing = true;
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			if (griefing == true) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(true, world.getServer());
			} else if (griefing == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(false, world.getServer());
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == false) {
			world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(false, world.getServer());
			griefing = false;
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			if (griefing == true) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(true, world.getServer());
			} else if (griefing == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).set(false, world.getServer());
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
