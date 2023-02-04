package eu.groeller.lotrme.entity.custom.warg;

import eu.groeller.lotrme.LotrMod;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WargRenderer extends GeoEntityRenderer<WargEntity> {
    public WargRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WargModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(WargEntity animatable) {
        return new Identifier(LotrMod.MOD_ID, "textures/entity/warg.texture.png");
    }


    @Override
    public RenderLayer getRenderType(WargEntity animatable, Identifier texture,
                                     @Nullable VertexConsumerProvider bufferSource,
                                     float partialTick) {

        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
