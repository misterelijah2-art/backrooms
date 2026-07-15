package backrooms.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import java.util.List;

public class BackroomsMapItem extends Item {

    public BackroomsMapItem(Properties props) {
        super(props);
    }

    @Override
    public void appendHoverText(ItemStack stack,
                                Item.TooltipContext context,
                                List<Component> tooltip,
                                TooltipFlag flag) {
        tooltip.add(Component.literal("A crude map of the surrounding level.")
                .withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.literal("It doesn't help much.")
                .withStyle(ChatFormatting.DARK_GRAY));
    }
}
