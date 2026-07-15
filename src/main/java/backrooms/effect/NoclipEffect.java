package backrooms.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class NoclipEffect extends MobEffect {

    public NoclipEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    // The actual noclip movement logic is handled by NoclipMixin
    // which checks for this effect each tick.
}
