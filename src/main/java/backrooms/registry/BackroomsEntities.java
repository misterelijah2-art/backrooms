package backrooms.registry;

import backrooms.Backrooms;
import backrooms.entity.SmilerEntity;
import backrooms.entity.PartygoerEntity;
import backrooms.entity.HoundEntity;
import backrooms.entity.DeathratEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class BackroomsEntities {

    public static final EntityType<SmilerEntity> SMILER = EntityType.Builder
        .<SmilerEntity>of(SmilerEntity::new, MobCategory.MONSTER)
        .sized(0.8f, 1.8f)
        .clientTrackingRange(16)
        .build(Backrooms.id("smiler").toString());

    public static final EntityType<PartygoerEntity> PARTYGOER = EntityType.Builder
        .<PartygoerEntity>of(PartygoerEntity::new, MobCategory.MONSTER)
        .sized(0.9f, 2.0f)
        .clientTrackingRange(16)
        .build(Backrooms.id("partygoer").toString());

    public static final EntityType<HoundEntity> HOUND = EntityType.Builder
        .<HoundEntity>of(HoundEntity::new, MobCategory.MONSTER)
        .sized(1.4f, 0.85f)
        .clientTrackingRange(24)
        .build(Backrooms.id("hound").toString());

    public static final EntityType<DeathratEntity> DEATHRAT = EntityType.Builder
        .<DeathratEntity>of(DeathratEntity::new, MobCategory.MONSTER)
        .sized(0.4f, 0.4f)
        .clientTrackingRange(12)
        .build(Backrooms.id("deathrat").toString());

    public static void register() {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, Backrooms.id("smiler"), SMILER);
        Registry.register(BuiltInRegistries.ENTITY_TYPE, Backrooms.id("partygoer"), PARTYGOER);
        Registry.register(BuiltInRegistries.ENTITY_TYPE, Backrooms.id("hound"), HOUND);
        Registry.register(BuiltInRegistries.ENTITY_TYPE, Backrooms.id("deathrat"), DEATHRAT);

        FabricDefaultAttributeRegistry.register(SMILER, SmilerEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(PARTYGOER, PartygoerEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(HOUND, HoundEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(DEATHRAT, DeathratEntity.createAttributes());
    }
}
