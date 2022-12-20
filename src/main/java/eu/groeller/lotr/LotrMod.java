package eu.groeller.lotr;

import eu.groeller.lotr.items.GondorShieldItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LotrMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("lotrme");


	public static final Item GONDOR_SHIELD = new GondorShieldItem(new FabricItemSettings().maxDamage(2500), 10, 13, Items.NETHERITE_INGOT);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.ITEM, new Identifier("lotrme", "gondor_shield"), GONDOR_SHIELD);


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->
				entries.add(GONDOR_SHIELD));
	}
}
