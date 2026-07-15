package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import backrooms.registry.BackroomsSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class ParanoiaMixin {

    @Inject(method = "tick", at = @At("HEAD"))
    private void backrooms$paranoiaTick(CallbackInfo ci) {
        Player self = (Player)(Object)this;
        // hasEffect() requires Holder<MobEffect> in 1.21.1
        if (self.hasEffect(BackroomsEffects.PARANOIA)) {
            if (!self.level().isClientSide() && self.level().getGameTime() % 80 == 0) {
                if (Math.random() < 0.3) {
                    self.level().playSound(null, self.blockPosition(),
                        BackroomsSounds.DISTANT_SCRAPE,
                        SoundSource.MASTER,
                        0.6f + (float)Math.random() * 0.4f,
                        0.8f + (float)Math.random() * 0.4f);
                }
            }
        }
    }
}
