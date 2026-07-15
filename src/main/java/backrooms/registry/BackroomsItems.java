package backrooms.registry;

import backrooms.Backrooms;
import backrooms.item.AlmondWaterItem;
import backrooms.item.BackroomsMapItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class BackroomsItems {

    public static final Item ALMOND_WATER = new AlmondWaterItem(new Item.Properties().stacksTo(16));
    public static final Item BACKROOMS_MAP = new BackroomsMapItem(new Item.Properties().stacksTo(1));
    public static final Item ROYAL_RATION = new Item(new Item.Properties().food(
        new net.minecraft.world.food.FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.8f).build()
    ));
    public static final Item LIQUID_PAIN = new Item(new Item.Properties().stacksTo(1));
    public static final Item LEVEL_KEY = new Item(new Item.Properties().stacksTo(1));

    public static final CreativeModeTab BACKROOMS_TAB = FabricItemGroup.builder()
        .title(Component.translatable("itemGroup.backrooms.main"))
        .icon(() -> new net.minecraft.world.item.ItemStack(ALMOND_WATER))
        .build();

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id("almond_water"), ALMOND_WATER);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id("backrooms_map"), BACKROOMS_MAP);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id("royal_ration"), ROYAL_RATION);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id("liquid_pain"), LIQUID_PAIN);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id("level_key"), LEVEL_KEY);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Backrooms.id("main"), BACKROOMS_TAB);

        ItemGroupEvents.modifyEntriesEvent(Backrooms.id("main")).register(entries -> {
            entries.accept(ALMOND_WATER);
            entries.accept(BACKROOMS_MAP);
            entries.accept(ROYAL_RATION);
            entries.accept(LIQUID_PAIN);
            entries.accept(LEVEL_KEY);
            // blocks
            entries.accept(BackroomsBlocks.MOIST_CARPET);
            entries.accept(BackroomsBlocks.MONO_WALLPAPER);
            entries.accept(BackroomsBlocks.FLICKERING_LIGHT);
            entries.accept(BackroomsBlocks.FLUORESCENT_LIGHT);
            entries.accept(BackroomsBlocks.CONCRETE_PILLAR);
            entries.accept(BackroomsBlocks.INDUSTRIAL_FLOOR);
            entries.accept(BackroomsBlocks.RUSTY_PIPE);
            entries.accept(BackroomsBlocks.DRIPPING_PIPE);
            entries.accept(BackroomsBlocks.STEAM_VENT);
            entries.accept(BackroomsBlocks.ELECTRICAL_BOX);
            entries.accept(BackroomsBlocks.DARK_CONCRETE);
            entries.accept(BackroomsBlocks.OFFICE_TILES);
            entries.accept(BackroomsBlocks.OFFICE_CEILING);
            entries.accept(BackroomsBlocks.BROKEN_GLASS);
            entries.accept(BackroomsBlocks.HOTEL_WALLPAPER);
            entries.accept(BackroomsBlocks.HOTEL_FLOOR);
            entries.accept(BackroomsBlocks.POOL_TILE);
            entries.accept(BackroomsBlocks.WET_CARPET);
        });
    }
}
