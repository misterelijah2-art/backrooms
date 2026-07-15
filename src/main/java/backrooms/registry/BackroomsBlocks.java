package backrooms.registry;

import backrooms.Backrooms;
import backrooms.block.WetCarpetkBlock;
import backrooms.block.NoclipPortalBlock;
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

    // === SPECIAL ===
    public static final Block WET_CARPET = new WetCarpetkBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CARPET)
            .sound(SoundType.WOOL)
    );

    // === PORTALS (noclip triggers) ===
    public static final Block PORTAL_LEVEL_0 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 8).noOcclusion(),
        BackroomsDimensions.LEVEL_0
    );
    public static final Block PORTAL_LEVEL_1 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 6).noOcclusion(),
        BackroomsDimensions.LEVEL_1
    );
    public static final Block PORTAL_LEVEL_2 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 4).noOcclusion(),
        BackroomsDimensions.LEVEL_2
    );
    public static final Block PORTAL_LEVEL_3 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 3).noOcclusion(),
        BackroomsDimensions.LEVEL_3
    );
    public static final Block PORTAL_LEVEL_4 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 2).noOcclusion(),
        BackroomsDimensions.LEVEL_4
    );
    public static final Block PORTAL_LEVEL_5 = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 1).noOcclusion(),
        BackroomsDimensions.LEVEL_5
    );
    public static final Block PORTAL_POOLROOMS = new NoclipPortalBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .lightLevel(s -> 5).noOcclusion(),
        BackroomsDimensions.POOLROOMS
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
        reg("portal_level_0", PORTAL_LEVEL_0);
        reg("portal_level_1", PORTAL_LEVEL_1);
        reg("portal_level_2", PORTAL_LEVEL_2);
        reg("portal_level_3", PORTAL_LEVEL_3);
        reg("portal_level_4", PORTAL_LEVEL_4);
        reg("portal_level_5", PORTAL_LEVEL_5);
        reg("portal_poolrooms", PORTAL_POOLROOMS);
    }

    private static void reg(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, Backrooms.id(name), block);
        Registry.register(BuiltInRegistries.ITEM, Backrooms.id(name),
            new BlockItem(block, new Item.Properties()));
    }
}
