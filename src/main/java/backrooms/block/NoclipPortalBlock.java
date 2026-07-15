package backrooms.block;

import backrooms.registry.BackroomsDimensions;
import backrooms.registry.BackroomsSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.RelativeMovement;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

public class NoclipPortalBlock extends Block {

    private final ResourceKey<Level> destination;

    public NoclipPortalBlock(Properties props, ResourceKey<Level> destination) {
        super(props);
        this.destination = destination;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!level.isClientSide() && entity instanceof ServerPlayer player) {
            ServerLevel dest = ((ServerLevel) level).getServer().getLevel(destination);
            if (dest != null) {
                level.playSound(null, pos, BackroomsSounds.NOCLIP_ENTER,
                        SoundSource.MASTER, 1.0f, 1.0f);
                player.teleportTo(
                        dest,
                        player.getX(),
                        player.getY(),
                        player.getZ(),
                        Set.<RelativeMovement>of(),
                        player.getYRot(),
                        player.getXRot(),
                        false
                );
            }
        }
        super.stepOn(level, pos, state, entity);
    }
}
