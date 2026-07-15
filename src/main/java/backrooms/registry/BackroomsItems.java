package backrooms.registry;

import backrooms.Backrooms;
import backrooms.item.AlmondWaterItem;
import backrooms.item.BackroomsMapItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

public class BackroomsItems {

    public static final Item ALMOND_WATER = new AlmondWaterItem(
        new Item.Properties().stacksTo(16));

    public static final Item BACKROOMS_MAP = new BackroomsMapItem(
        new Item.Properties().stacksTo(1));

    public static final Item ROYAL_RATION = new Item(
        new Item.Properties()
            .food(new net.minecraft.world.food.FoodProperties.Builder()
                .nutrition(6).saturationModifier(0.8f).build()));

    public static final Item LIQUID_PAIN = new Item(
        new Item.Properties().stacksTo(4));

    public static final Item LEVEL_KEY = new Item(
        new Item.Properties().stacksTo(1).rarity(Rarity.RARE));

    // --- Creative Tab ---
    public static final ResourceKey<CreativeModeTab> TAB_KEY = ResourceKey.create(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(),
        ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, "main")
    );

    public static void register() {
        reg("almond_water",   ALMOND_WATER);
        reg("backrooms_map",  BACKROOMS_MAP);
        reg("royal_ration",   ROYAL_RATION);
        reg("liquid_pain",    LIQUID_PAIN);
        reg("level_key",      LEVEL_KEY);

        // Register creative tab
        CreativeModeTab tab = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.backrooms.main"))
            .icon(() -> new ItemStack(ALMOND_WATER))
            .displayItems((params, output) -> {
                output.accept(ALMOND_WATER);
                output.accept(BACKROOMS_MAP);
                output.accept(ROYAL_RATION);
                output.accept(LIQUID_PAIN);
                output.accept(LEVEL_KEY);
                // Add all backrooms blocks
                output.accept(BackroomsBlocks.MOIST_CARPET);
                output.accept(BackroomsBlocks.MONO_WALLPAPER);
                output.accept(BackroomsBlocks.FLICKERING_LIGHT);
                output.accept(BackroomsBlocks.FLUORESCENT_LIGHT);
                output.accept(BackroomsBlocks.CONCRETE_PILLAR);
                output.accept(BackroomsBlocks.INDUSTRIAL_FLOOR);
                output.accept(BackroomsBlocks.RUSTY_PIPE);
                output.accept(BackroomsBlocks.DRIPPING_PIPE);
                output.accept(BackroomsBlocks.STEAM_VENT);
                output.accept(BackroomsBlocks.ELECTRICAL_BOX);
                output.accept(BackroomsBlocks.DARK_CONCRETE);
                output.accept(BackroomsBlocks.OFFICE_TILES);
                output.accept(BackroomsBlocks.OFFICE_CEILING);
                output.accept(BackroomsBlocks.BROKEN_GLASS);
                output.accept(BackroomsBlocks.HOTEL_WALLPAPER);
                output.accept(BackroomsBlocks.HOTEL_FLOOR);
                output.accept(BackroomsBlocks.POOL_TILE);
                output.accept(BackroomsBlocks.WET_CARPET);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_0);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_1);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_2);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_3);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_4);
                output.accept(BackroomsBlocks.PORTAL_LEVEL_5);
                output.accept(BackroomsBlocks.PORTAL_POOLROOMS);
            })
            .build();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_KEY, tab);
    }

    private static void reg(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name), item);
    }
}
