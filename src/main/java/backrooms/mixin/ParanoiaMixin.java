package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class ParanoiaMixin {

    @Inject(method = "tick", at = @At("TAIL"))
    private void backrooms_paranoiaTick(CallbackInfo ci) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (!self.level().isClientSide() && self.hasEffect(BackroomsEffects.PARANOIA)) {
            if (self.getRandom().nextInt(80) == 0) {
                // Trigger a fake sound event - just log on server for now
                // Client-side paranoia effects are handled in client mixin
            }
        }
    }
}
