package backrooms;

import backrooms.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backrooms implements ModInitializer {

    public static final String MOD_ID = "backrooms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("You have noclipped into the Backrooms.");

        BackroomsSounds.register();
        BackroomsEffects.register();
        BackroomsBlocks.register();
        BackroomsItems.register();
        BackroomsEntities.register();
        BackroomsEntities.registerAttributes();
        // BackroomsDimensions has no register() — keys are defined as constants only
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
