package backrooms.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.Level;

public class AlmondWaterItem extends Item {

    public AlmondWaterItem(Properties props) {
        super(props);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        if (!level.isClientSide()) {
            // Speed (MOVEMENT_SPEED holder) for 15s
            user.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1));
            user.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
            if (user instanceof Player player) {
                player.getFoodData().eat(4, 1.2f);
            }
        }
        if (!(user instanceof Player player && player.getAbilities().instabuild)) {
            stack.shrink(1);
        }
        return stack;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 32;
    }

    // ItemUseAnimation replaces UseAnim in some versions; in 1.21.1 Mojmap
    // the correct return type is net.minecraft.world.item.ItemUseAnimation
    @Override
    public net.minecraft.world.item.ItemUseAnimation getUseAnimation(ItemStack stack) {
        return net.minecraft.world.item.ItemUseAnimation.DRINK;
    }

    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(
            Level level, Player player,
            net.minecraft.world.InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, player, hand);
    }
}
