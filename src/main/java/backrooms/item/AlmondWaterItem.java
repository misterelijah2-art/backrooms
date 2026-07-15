package backrooms.item;

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
        if (!level.isClientSide) {
            user.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1));
            user.addEffect(new MobEffectInstance(MobEffects.SATURATION, 100, 0));
            user.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0));
            if (user instanceof Player player) {
                player.getFoodData().eat(4, 0.6f);
            }
        }
        if (user instanceof Player player && !player.getAbilities().instabuild) {
            stack.shrink(1);
        }
        return stack.isEmpty() ? ItemStack.EMPTY : stack;
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
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(Level level,
            Player player, net.minecraft.world.InteractionHand hand) {
        return net.minecraft.world.item.ItemUtils.startUsingInstantly(level, player, hand);
    }
}
