package camoweed.exampleitem;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.util.dependency.Key;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = HalpLibe.registerMod("exampleitem", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommonEvents.BEFORE_GAME_START.listen(Key.of(MOD_ID), this::beforeGameStart);
		CommonEvents.AFTER_GAME_START.listen(Key.of(MOD_ID), this::afterGameStart);

		// you need to initialise your items and models
		CommonEvents.AFTER_ITEM_INIT.listen(Key.of(MOD_ID), ExampleItems::aftterItemInit);
		//recipes too
		CommonEvents.RECIPES_READY.listen(Key.of(MOD_ID), ExampleRecipes::initializeRecipes);

		LOGGER.info("u did item ☻");
	}

	public void beforeGameStart() {

	}

	public void afterGameStart() {

	}
}
