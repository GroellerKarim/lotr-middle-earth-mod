package eu.groeller.lotrme.entity;

import eu.groeller.lotrme.LotrMod;
import eu.groeller.lotrme.entity.custom.warg.WargEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WargEntity> WARG =  Registry.register(
            Registries.ENTITY_TYPE, new Identifier(LotrMod.MOD_ID, "warg"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WargEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
}
