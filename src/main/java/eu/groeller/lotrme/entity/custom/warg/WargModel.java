package eu.groeller.lotrme.entity.custom.warg;

import eu.groeller.lotrme.LotrMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WargModel extends GeoModel<WargEntity> {

    @Override
    public Identifier getModelResource(WargEntity animatable) {
        return new Identifier(LotrMod.MOD_ID, "geo/warg.geo.json");
    }

    @Override
    public Identifier getTextureResource(WargEntity animatable) {
        return new Identifier(LotrMod.MOD_ID, "textures/entity/warg.texture.png");
    }

    @Override
    public Identifier getAnimationResource(WargEntity animatable) {
        return new Identifier(LotrMod.MOD_ID, "animations/warg.animations.json");
    }
}
