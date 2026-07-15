package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class BackroomsDimensions {

    public static final ResourceKey<Level> LEVEL_0 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_0"));
    public static final ResourceKey<Level> LEVEL_1 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_1"));
    public static final ResourceKey<Level> LEVEL_2 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_2"));
    public static final ResourceKey<Level> LEVEL_3 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_3"));
    public static final ResourceKey<Level> LEVEL_4 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_4"));
    public static final ResourceKey<Level> LEVEL_5 =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("level_5"));
    public static final ResourceKey<Level> POOLROOMS =
        ResourceKey.create(Registries.DIMENSION, Backrooms.id("poolrooms"));

    public static void register() {
        // Dimensions are registered via datapack JSON in data/backrooms/dimension/
        Backrooms.LOGGER.info("[Backrooms] Dimension keys registered.");
    }
}
