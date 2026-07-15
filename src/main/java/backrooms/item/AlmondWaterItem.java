package backrooms.item;

import backrooms.registry.BackroomsEffects;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class AlmondWaterItem extends Item {

    public AlmondWaterItem(Properties props) {
        super(props);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        if (!level.isClientSide()) {
            // Speed II for 15s
            user.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1));
            // Regeneration I for 10s
            user.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
            // Saturation
            if (user instanceof Player player) {
                player.getFoodData().eat(4, 1.2f);
            }
        }
        // consume one bottle
        if (!( user instanceof Player player && player.getAbilities().instabuild)) {
            stack.shrink(1);
        }
        return stack;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return net.minecraft.world.item.ItemUtils.startUsingInstantly(level, player, hand);
    }
}
