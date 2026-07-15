package backrooms.client.renderer;

import backrooms.Backrooms;
import backrooms.entity.PartygoerEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class PartygoerRenderer extends HumanoidMobRenderer<PartygoerEntity, HumanoidModel<PartygoerEntity>> {

    private static final ResourceLocation TEXTURE =
        Backrooms.id("textures/entity/partygoer.png");

    public PartygoerRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.ZOMBIE)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PartygoerEntity entity) {
        return TEXTURE;
    }
}
