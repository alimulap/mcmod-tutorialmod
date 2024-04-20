package net.ikan.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.ikan.tutorialmod.item.ModBlocks;
import net.ikan.tutorialmod.item.ModItemGroups;
import net.ikan.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemgGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
