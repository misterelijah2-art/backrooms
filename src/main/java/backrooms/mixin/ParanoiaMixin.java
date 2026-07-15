package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import backrooms.registry.BackroomsSounds;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * When the Paranoia effect is active, play a distant scrape sound
 * at random intervals to disorient the player.
 */
@Mixin(ServerPlayer.class)
public class ParanoiaMixin {

    @Inject(method = "tick", at = @At("TAIL"))
    private void onTick(CallbackInfo ci) {
        ServerPlayer self = (ServerPlayer)(Object)this;
        if (self.hasEffect(BackroomsEffects.PARANOIA)) {
            if (self.tickCount % 80 == 0 && self.level().random.nextFloat() < 0.35f) {
                self.level().playSound(
                    null,
                    self.blockPosition(),
                    BackroomsSounds.DISTANT_SCRAPE,
                    SoundSource.AMBIENT,
                    0.5f,
                    0.7f + self.level().random.nextFloat() * 0.6f
                );
            }
        }
    }
}
