package backrooms.registry;

import backrooms.Backrooms;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class BackroomsEffects {

    public static final Holder<MobEffect> NOCLIP_EFFECT;
    public static final Holder<MobEffect> PARANOIA;
    public static final Holder<MobEffect> BACKROOMS_SICKNESS;

    static {
        NOCLIP_EFFECT = reg("noclip",
            new backrooms.effect.NoclipEffect(MobEffectCategory.NEUTRAL, 0x9966FF));
        PARANOIA = reg("paranoia",
            new backrooms.effect.ParanoiaEffect(MobEffectCategory.HARMFUL, 0x330033));
        BACKROOMS_SICKNESS = reg("backrooms_sickness",
            new MobEffect(MobEffectCategory.HARMFUL, 0x1A0A00) {});
    }

    private static Holder<MobEffect> reg(String name, MobEffect effect) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Backrooms.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, id, effect);
    }

    public static void register() {}
}
