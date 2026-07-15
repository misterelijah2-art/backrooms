package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * When a player has the Noclip effect, they pass through blocks.
 * Injects into Player#isNoGravity as a proxy approach.
 * True noclip (noClip field) needs a separate accessor mixin.
 */
@Mixin(Player.class)
public class NoclipMixin {

    @Inject(method = "isSpectator", at = @At("RETURN"), cancellable = true)
    private void injectNoclipAsSpectator(CallbackInfoReturnable<Boolean> cir) {
        Player self = (Player)(Object)this;
        if (self.hasEffect(BackroomsEffects.NOCLIP_EFFECT)) {
            cir.setReturnValue(true);
        }
    }
}
