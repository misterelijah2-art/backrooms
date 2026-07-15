package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class BackroomsEffects {

    public static final MobEffect NOCLIP_EFFECT = new MobEffect(
        MobEffectCategory.HARMFUL, 0x1a1a2e
    ) {};

    public static final MobEffect PARANOIA = new MobEffect(
        MobEffectCategory.HARMFUL, 0x4a0e0e
    ) {};

    public static final MobEffect BACKROOMS_SICKNESS = new MobEffect(
        MobEffectCategory.HARMFUL, 0x2e4a0e
    ) {};

    public static void register() {
        Registry.register(BuiltInRegistries.MOB_EFFECT, Backrooms.id("noclip"), NOCLIP_EFFECT);
        Registry.register(BuiltInRegistries.MOB_EFFECT, Backrooms.id("paranoia"), PARANOIA);
        Registry.register(BuiltInRegistries.MOB_EFFECT, Backrooms.id("backrooms_sickness"), BACKROOMS_SICKNESS);
    }
}
