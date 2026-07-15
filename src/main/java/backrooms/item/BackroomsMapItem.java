package backrooms.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import java.util.List;

public class BackroomsMapItem extends Item {

    public BackroomsMapItem(Properties props) {
        super(props);
    }

    // appendHoverText replaces addInformation in 1.21.1 — signature is correct
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("A crude map of the surrounding level.")
            .withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.literal("It doesn't help much.")
            .withStyle(ChatFormatting.DARK_GRAY));
    }
}
