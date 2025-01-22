
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.housearrest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.housearrest.entity.FeralWolfNovaEntity;
import net.mcreator.housearrest.entity.FeralWolfLoonaEntity;
import net.mcreator.housearrest.HouseArrestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HouseArrestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HouseArrestMod.MODID);
	public static final RegistryObject<EntityType<FeralWolfLoonaEntity>> FERAL_WOLF_LOONA = register("feral_wolf_loona", EntityType.Builder.<FeralWolfLoonaEntity>of(FeralWolfLoonaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FeralWolfLoonaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FeralWolfNovaEntity>> FERAL_WOLF_NOVA = register("feral_wolf_nova", EntityType.Builder.<FeralWolfNovaEntity>of(FeralWolfNovaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FeralWolfNovaEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FeralWolfLoonaEntity.init();
			FeralWolfNovaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FERAL_WOLF_LOONA.get(), FeralWolfLoonaEntity.createAttributes().build());
		event.put(FERAL_WOLF_NOVA.get(), FeralWolfNovaEntity.createAttributes().build());
	}
}
