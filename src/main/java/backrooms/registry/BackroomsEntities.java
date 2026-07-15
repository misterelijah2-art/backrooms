package backrooms.registry;

import backrooms.Backrooms;
import backrooms.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class BackroomsEntities {

    public static final EntityType<SmilerEntity> SMILER = register("smiler",
        EntityType.Builder.<SmilerEntity>of(SmilerEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.95f).clientTrackingRange(8));

    public static final EntityType<PartygoerEntity> PARTYGOER = register("partygoer",
        EntityType.Builder.<PartygoerEntity>of(PartygoerEntity::new, MobCategory.MONSTER)
            .sized(0.6f, 1.95f).clientTrackingRange(8));

    public static final EntityType<HoundEntity> HOUND = register("hound",
        EntityType.Builder.<HoundEntity>of(HoundEntity::new, MobCategory.MONSTER)
            .sized(1.4f, 0.85f).clientTrackingRange(8));

    public static final EntityType<DeathratEntity> DEATHRAT = register("deathrat",
        EntityType.Builder.<DeathratEntity>of(DeathratEntity::new, MobCategory.MONSTER)
            .sized(0.4f, 0.3f).clientTrackingRange(8));

    private static <T extends net.minecraft.world.entity.Entity> EntityType<T> register(
            String name, EntityType.Builder<T> builder) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name);
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, id);
        EntityType<T> type = builder.build(key);
        Registry.register(BuiltInRegistries.ENTITY_TYPE, id, type);
        return type;
    }

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(SMILER,    SmilerEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(PARTYGOER, PartygoerEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(HOUND,     HoundEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(DEATHRAT,  DeathratEntity.createAttributes());
    }

    public static void register() {}
}
