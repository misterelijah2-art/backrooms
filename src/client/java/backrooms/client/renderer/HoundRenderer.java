package backrooms.client.renderer;

import backrooms.Backrooms;
import backrooms.entity.HoundEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.WolfModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class HoundRenderer extends MobRenderer<HoundEntity, WolfModel<HoundEntity>> {

    private static final ResourceLocation TEXTURE =
        Backrooms.id("textures/entity/hound.png");

    public HoundRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new WolfModel<>(ctx.bakeLayer(ModelLayers.WOLF)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(HoundEntity entity) {
        return TEXTURE;
    }
}
