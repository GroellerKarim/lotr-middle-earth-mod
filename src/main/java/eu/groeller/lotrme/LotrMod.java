package eu.groeller.lotrme;

import eu.groeller.lotrme.entity.ModEntities;
import eu.groeller.lotrme.entity.custom.warg.WargEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class LotrMod implements ModInitializer {
	public static final String MOD_ID = "lotrme";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// Needed for Geckolib
		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.WARG, WargEntity.setAttributes());

	}
}
