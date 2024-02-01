package net.nicefilms;

import net.fabricmc.api.ModInitializer;

import net.nicefilms.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simplexity implements ModInitializer {
	public static final String ModID = "simplexity";
	public static final String FriendlyModID = "Simplexity";
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}