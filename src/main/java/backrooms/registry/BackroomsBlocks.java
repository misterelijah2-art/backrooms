package backrooms.registry;

import backrooms.Backrooms;
import backrooms.block.WetCarpetkBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BackroomsBlocks {

    // === LEVEL 0 - The Lobby ===
    public static final Block MOIST_CARPET = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CARPET)
            .sound(SoundType.WOOL)
            .mapColor(net.minecraft.world.level.material.MapColor.COLOR_YELLOW)
    );
    public static final Block MONO_WALLPAPER = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
            .sound(SoundType.WOOL)
            .mapColor(net.minecraft.world.level.material.MapColor.COLOR_YELLOW)
    );
    public static final Block FLICKERING_LIGHT = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
            .lightLevel(s -> 12)
            .sound(SoundType.GLASS)
    );
    public static final Block FLUORESCENT_LIGHT = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
            .lightLevel(s -> 15)
            .sound(SoundType.GLASS)
    );

    // === LEVEL 1 - Habitable Zone ===
    public static final Block CONCRETE_PILLAR = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)
            .sound(SoundType.STONE)
    );
    public static final Block INDUSTRIAL_FLOOR = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)
            .sound(SoundType.STONE)
    );
    public static final Block CHAIN_LINK_FENCE_BLOCK = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)
            .sound(SoundType.METAL)
    );

    // === LEVEL 2 - Pipe Dreams ===
    public static final Block RUSTY_PIPE = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            .sound(SoundType.METAL)
            .mapColor(net.minecraft.world.level.material.MapColor.RAW_IRON)
    );
    public static final Block DRIPPING_PIPE = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            .sound(SoundType.METAL)
            .lightLevel(s -> 0)
    );
    public static final Block STEAM_VENT = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            .sound(SoundType.METAL)
    );

    // === LEVEL 3 - Electrical Station ===
    public static final Block ELECTRICAL_BOX = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            .sound(SoundType.METAL)
            .lightLevel(s -> 4)
    );
    public static final Block DARK_CONCRETE = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)
            .sound(SoundType.STONE)
    );

    // === LEVEL 4 - Abandoned Office ===
    public static final Block OFFICE_TILES = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)
            .sound(SoundType.STONE)
    );
    public static final Block OFFICE_CEILING = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
            .sound(SoundType.STONE)
    );
    public static final Block BROKEN_GLASS = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)
            .sound(SoundType.GLASS)
            .noOcclusion()
    );

    // === LEVEL 5 - Terror Hotel ===
    public static final Block HOTEL_WALLPAPER = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)
            .sound(SoundType.WOOL)
            .mapColor(net.minecraft.world.level.material.MapColor.COLOR_RED)
    );
    public static final Block HOTEL_FLOOR = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)
            .sound(SoundType.STONE)
    );

    // === POOLROOMS ===
    public static final Block POOL_TILE = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
            .sound(SoundType.STONE)
    );
    public static final Block POOL_WATER_BLOCK = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
            .sound(SoundType.WATER)
            .lightLevel(s -> 7)
    );

    // === WET CARPET (special) ===
    public static final Block WET_CARPET = new WetCarpetkBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CARPET)
            .sound(SoundType.WOOL)
            .mapColor(net.minecraft.world.level.material.MapColor.COLOR_YELLOW)
    );

    public static void register() {
        reg("moist_carpet", MOIST_CARPET);
        reg("mono_wallpaper", MONO_WALLPAPER);
        reg("flickering_light", FLICKERING_LIGHT);
        reg("fluorescent_light", FLUORESCENT_LIGHT);
        reg("concrete_pillar", CONCRETE_PILLAR);
        reg("industrial_floor", INDUSTRIAL_FLOOR);
        reg("chain_link_fence_block", CHAIN_LINK_FENCE_BLOCK);
        reg("rusty_pipe", RUSTY_PIPE);
        reg("dripping_pipe", DRIPPING_PIPE);
        reg("steam_vent", STEAM_VENT);
        reg("electrical_box", ELECTRICAL_BOX);
        reg("dark_concrete", DARK_CONCRETE);
        reg("office_tiles", OFFICE_TILES);
        reg("office_ceiling", OFFICE_CEILING);
        reg("broken_glass", BROKEN_GLASS);
        reg("hotel_wallpaper", HOTEL_WALLPAPER);
        reg("hotel_floor", HOTEL_FLOOR);
        reg("pool_tile", POOL_TILE);
        reg("pool_water_block", POOL_WATER_BLOCK);
        reg("wet_carpet", WET_CARPET);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.accept(MOIST_CARPET);
            entries.accept(MONO_WALLPAPER);
            entries.accept(FLICKERING_LIGHT);
            entries.accept(FLUORESCENT_LIGHT);
            entries.accept(CONCRETE_PILLAR);
            entries.accept(INDUSTRIAL_FLOOR);
            entries.accept(CHAIN_LINK_FENCE_BLOCK);
            entries.accept(RUSTY_PIPE);
            entries.accept(DRIPPING_PIPE);
            entries.accept(STEAM_VENT);
            entries.accept(ELECTRICAL_BOX);
            entries.accept(DARK_CONCRETE);
            entries.accept(OFFICE_TILES);
            entries.accept(OFFICE_CEILING);
            entries.accept(BROKEN_GLASS);
            entries.accept(HOTEL_WALLPAPER);
            entries.accept(HOTEL_FLOOR);
            entries.accept(POOL_TILE);
            entries.accept(POOL_WATER_BLOCK);
            entries.accept(WET_CARPET);
        });
    }

    private static void reg(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, Backrooms.id(name), block);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id(name),
            new BlockItem(block, new Item.Properties()));
    }
}
