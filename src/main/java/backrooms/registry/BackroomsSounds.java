package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class BackroomsSounds {

    public static final SoundEvent NOCLIP_ENTER       = reg("misc.noclip_enter");
    public static final SoundEvent NOCLIP_EXIT        = reg("misc.noclip_exit");
    public static final SoundEvent DISTANT_SCRAPE     = reg("misc.distant_scrape");
    public static final SoundEvent FOOTSTEP_CARPET    = reg("misc.footstep_carpet");
    public static final SoundEvent FOOTSTEP_TILE      = reg("misc.footstep_tile");

    public static final SoundEvent LEVEL0_HUM         = reg("ambient.level0_hum");
    public static final SoundEvent LEVEL1_DRIP        = reg("ambient.level1_drip");
    public static final SoundEvent LEVEL2_PIPES       = reg("ambient.level2_pipes");
    public static final SoundEvent LEVEL3_ELECTRIC    = reg("ambient.level3_electric");
    public static final SoundEvent LEVEL4_CREAK       = reg("ambient.level4_creak");
    public static final SoundEvent LEVEL5_HEARTBEAT   = reg("ambient.level5_heartbeat");
    public static final SoundEvent POOLROOMS_WATER    = reg("ambient.poolrooms_water");

    public static final SoundEvent SMILER_IDLE        = reg("entity.smiler_idle");
    public static final SoundEvent SMILER_HURT        = reg("entity.smiler_hurt");
    public static final SoundEvent SMILER_DEATH       = reg("entity.smiler_death");
    public static final SoundEvent PARTYGOER_IDLE     = reg("entity.partygoer_idle");
    public static final SoundEvent PARTYGOER_HURT     = reg("entity.partygoer_hurt");
    public static final SoundEvent PARTYGOER_DEATH    = reg("entity.partygoer_death");
    public static final SoundEvent HOUND_GROWL        = reg("entity.hound_growl");
    public static final SoundEvent HOUND_HURT         = reg("entity.hound_hurt");
    public static final SoundEvent HOUND_DEATH        = reg("entity.hound_death");
    public static final SoundEvent DEATHRAT_IDLE      = reg("entity.deathrat_idle");
    public static final SoundEvent DEATHRAT_HURT      = reg("entity.deathrat_hurt");
    public static final SoundEvent DEATHRAT_DEATH     = reg("entity.deathrat_death");

    private static SoundEvent reg(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name);
        SoundEvent event = SoundEvent.createVariableRangeEvent(id);
        Registry.register(BuiltInRegistries.SOUND_EVENT, id, event);
        return event;
    }

    public static void register() {
        // fields are initialised on class load; calling this method forces that
    }
}
