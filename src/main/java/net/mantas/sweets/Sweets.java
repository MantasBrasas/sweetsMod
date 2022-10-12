package net.mantas.sweets;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sweets implements ModInitializer {
	public static final String MOD_ID = "sweets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("watsupp bros :3");
	}
}
