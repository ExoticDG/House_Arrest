package net.mcreator.housearrest.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.AnimalTameEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.housearrest.init.HouseArrestModGameRules;
import net.mcreator.housearrest.init.HouseArrestModEntities;
import net.mcreator.housearrest.init.HouseArrestModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeralWolfSpawnProcedure {
	@SubscribeEvent
	public static void onEntityTamed(AnimalTameEvent event) {
		execute(event, event.getAnimal().level(), event.getAnimal().getX(), event.getAnimal().getY(), event.getAnimal().getZ(), event.getAnimal());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(HouseArrestModAttributes.FEARL_WOLF_CHANCE.get())) {
			if (Math.random() < (world.getLevelData().getGameRules().getInt(HouseArrestModGameRules.FERAL_CHANCE)) / 100) {
				if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HouseArrestModEntities.FERAL_WOLF_LOONA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
					if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HouseArrestModEntities.FERAL_WOLF_NOVA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
					if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
