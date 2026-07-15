package backrooms.client;

import backrooms.registry.BackroomsEntities;
import backrooms.client.renderer.SmilerRenderer;
import backrooms.client.renderer.PartygoerRenderer;
import backrooms.client.renderer.HoundRenderer;
import backrooms.client.renderer.DeathratRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class BackroomsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(BackroomsEntities.SMILER, SmilerRenderer::new);
        EntityRendererRegistry.register(BackroomsEntities.PARTYGOER, PartygoerRenderer::new);
        EntityRendererRegistry.register(BackroomsEntities.HOUND, HoundRenderer::new);
        EntityRendererRegistry.register(BackroomsEntities.DEATHRAT, DeathratRenderer::new);
    }
}
