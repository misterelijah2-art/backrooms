package backrooms.mixin;

import backrooms.registry.BackroomsEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class NoclipMixin {

    @Inject(method = "getBoundingBox", at = @At("RETURN"), cancellable = true)
    private void backrooms_noclipBB(CallbackInfoReturnable<AABB> cir) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self.hasEffect(BackroomsEffects.NOCLIP_EFFECT)) {
            AABB tiny = new AABB(
                self.getX() - 0.01, self.getY() - 0.01, self.getZ() - 0.01,
                self.getX() + 0.01, self.getY() + 0.01, self.getZ() + 0.01
            );
            cir.setReturnValue(tiny);
        }
    }
}
