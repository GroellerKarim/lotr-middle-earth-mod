package eu.groeller.lotrme;

import eu.groeller.lotrme.entity.ModEntities;
import eu.groeller.lotrme.entity.custom.warg.WargRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class LotrModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.WARG, WargRenderer::new);
    }
}
