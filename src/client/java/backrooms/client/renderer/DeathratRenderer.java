package backrooms.client.renderer;

import backrooms.Backrooms;
import backrooms.entity.DeathratEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.RatModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

// NOTE: RatModel does not exist in vanilla - replace with a custom GeckoLib model or use a pig/bat model
// This is a placeholder that uses the Bat model layer until a custom model is made
@Environment(EnvType.CLIENT)
public class DeathratRenderer extends MobRenderer<DeathratEntity, net.minecraft.client.model.BatModel> {

    private static final ResourceLocation TEXTURE =
        Backrooms.id("textures/entity/deathrat.png");

    public DeathratRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new net.minecraft.client.model.BatModel(ctx.bakeLayer(ModelLayers.BAT)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(DeathratEntity entity) {
        return TEXTURE;
    }
}
