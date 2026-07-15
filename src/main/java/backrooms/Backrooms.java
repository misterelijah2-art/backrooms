package backrooms;

import backrooms.registry.BackroomsBlocks;
import backrooms.registry.BackroomsItems;
import backrooms.registry.BackroomsEntities;
import backrooms.registry.BackroomsDimensions;
import backrooms.registry.BackroomsEffects;
import backrooms.registry.BackroomsSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backrooms implements ModInitializer {
    public static final String MOD_ID = "backrooms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[Backrooms] Initializing...");
        BackroomsSounds.register();
        BackroomsBlocks.register();
        BackroomsItems.register();
        BackroomsEffects.register();
        BackroomsEntities.register();
        BackroomsDimensions.register();
        LOGGER.info("[Backrooms] Initialized.");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
