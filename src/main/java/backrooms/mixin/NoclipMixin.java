package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class NoclipMixin {

    @Inject(method = "tick", at = @At("HEAD"))
    private void backrooms$noclipTick(CallbackInfo ci) {
        Player self = (Player)(Object)this;
        // hasEffect() requires Holder<MobEffect> in 1.21.1
        if (self.hasEffect(BackroomsEffects.NOCLIP_EFFECT)) {
            // Enable no-clip: set noPhysics = true while effect is active
            self.noPhysics = true;
        } else {
            self.noPhysics = false;
        }
    }
}
