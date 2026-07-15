package backrooms.registry;

import backrooms.Backrooms;
import backrooms.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class BackroomsEntities {

    // In 1.21.1 EntityType.Builder.build() takes a ResourceKey, not a String.
    // Use FabricEntityTypeBuilder which handles this correctly, or
    // use EntityType.Builder and register with the RL directly.

    public static final EntityType<SmilerEntity> SMILER = register("smiler",
        EntityType.Builder.<SmilerEntity>of(SmilerEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.95f)
            .clientTrackingRange(8));

    public static final EntityType<PartygoerEntity> PARTYGOER = register("partygoer",
        EntityType.Builder.<PartygoerEntity>of(PartygoerEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.95f)
            .clientTrackingRange(8));

    public static final EntityType<HoundEntity> HOUND = register("hound",
        EntityType.Builder.<HoundEntity>of(HoundEntity::new, MobCategory.MONSTER)
            .sized(1.4f, 0.85f)
            .clientTrackingRange(8));

    public static final EntityType<DeathratEntity> DEATHRAT = register("deathrat",
        EntityType.Builder.<DeathratEntity>of(DeathratEntity::new, MobCategory.MONSTER)
            .sized(0.4f, 0.3f)
            .clientTrackingRange(8));

    // EntityType.Builder.build() in 1.21.1 takes a ResourceKey<EntityType<T>>
    private static <T extends net.minecraft.world.entity.Entity> EntityType<T> register(
            String name, EntityType.Builder<T> builder) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name);
        EntityType<T> type = builder.build(
            net.minecraft.resources.ResourceKey.create(
                net.minecraft.core.registries.Registries.ENTITY_TYPE, id));
        Registry.register(BuiltInRegistries.ENTITY_TYPE, id, type);
        return type;
    }

    public static void registerAttributes() {
        net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
            .register(SMILER,     SmilerEntity.createAttributes());
        net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
            .register(PARTYGOER,  PartygoerEntity.createAttributes());
        net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
            .register(HOUND,      HoundEntity.createAttributes());
        net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
            .register(DEATHRAT,   DeathratEntity.createAttributes());
    }

    public static void register() {}
}
