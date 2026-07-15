package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class BackroomsDimensions {

    // In 1.21.1 Fabric, ResourceLocation is net.minecraft.resources.ResourceLocation
    // (not net.minecraft.resources.ResourceLocation from Identifier — that's the Yarn mapping name)
    // Use ResourceKey.create(Level.DIMENSION_REGISTRY, ...) to define dimension keys.

    public static final ResourceKey<Level> LEVEL_0 = key("level_0");
    public static final ResourceKey<Level> LEVEL_1 = key("level_1");
    public static final ResourceKey<Level> LEVEL_2 = key("level_2");
    public static final ResourceKey<Level> LEVEL_3 = key("level_3");
    public static final ResourceKey<Level> LEVEL_4 = key("level_4");
    public static final ResourceKey<Level> LEVEL_5 = key("level_5");
    public static final ResourceKey<Level> POOLROOMS = key("poolrooms");

    private static ResourceKey<Level> key(String name) {
        return ResourceKey.create(
            net.minecraft.core.registries.Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name)
        );
    }
}
