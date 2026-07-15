package backrooms.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ParanoiaEffect extends MobEffect {

    public ParanoiaEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    // Random ambient sound triggers handled by ParanoiaMixin.
}
