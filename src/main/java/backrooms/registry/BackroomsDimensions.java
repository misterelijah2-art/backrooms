package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class BackroomsDimensions {

    public static final ResourceKey<Level> LEVEL_0    = key("level_0");
    public static final ResourceKey<Level> LEVEL_1    = key("level_1");
    public static final ResourceKey<Level> LEVEL_2    = key("level_2");
    public static final ResourceKey<Level> LEVEL_3    = key("level_3");
    public static final ResourceKey<Level> LEVEL_4    = key("level_4");
    public static final ResourceKey<Level> LEVEL_5    = key("level_5");
    public static final ResourceKey<Level> POOLROOMS  = key("poolrooms");

    private static ResourceKey<Level> key(String name) {
        return ResourceKey.create(
            Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name)
        );
    }

    // Called from Backrooms.java to force static init
    public static void register() {}
}
