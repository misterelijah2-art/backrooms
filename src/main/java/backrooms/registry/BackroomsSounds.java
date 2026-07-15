package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class BackroomsSounds {

    public static SoundEvent AMBIENT_HUM;
    public static SoundEvent DISTANT_SCRAPE;
    public static SoundEvent ENTITY_SMILER_IDLE;
    public static SoundEvent ENTITY_SMILER_HURT;
    public static SoundEvent ENTITY_SMILER_DEATH;
    public static SoundEvent ENTITY_PARTYGOER_IDLE;
    public static SoundEvent ENTITY_PARTYGOER_HURT;
    public static SoundEvent LEVEL_TRANSITION;
    public static SoundEvent NOCLIP_ENTER;

    public static void register() {
        AMBIENT_HUM         = reg("ambient.hum");
        DISTANT_SCRAPE      = reg("ambient.distant_scrape");
        ENTITY_SMILER_IDLE  = reg("entity.smiler.idle");
        ENTITY_SMILER_HURT  = reg("entity.smiler.hurt");
        ENTITY_SMILER_DEATH = reg("entity.smiler.death");
        ENTITY_PARTYGOER_IDLE  = reg("entity.partygoer.idle");
        ENTITY_PARTYGOER_HURT  = reg("entity.partygoer.hurt");
        LEVEL_TRANSITION    = reg("level.transition");
        NOCLIP_ENTER        = reg("noclip.enter");
    }

    private static SoundEvent reg(String name) {
        ResourceLocation id = Backrooms.id(name);
        SoundEvent event = SoundEvent.createVariableRangeEvent(id);
        Registry.register(BuiltInRegistries.SOUND_EVENT, id, event);
        return event;
    }
}
