package net.mcreator.housearrest.procedures;

import net.minecraft.world.level.LevelAccessor;

public class NonDistructiveTNTRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		NonDistuctutiveExplotionProcedure.execute(world, x, y, z);
	}
}
