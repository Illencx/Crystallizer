package dev.illencx.crystallizer;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Crystallizer implements ModInitializer {
    public static final String MOD_ID ="crystallizer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("onInitialize");
        LOGGER.info(MOD_ID);
    }
}
