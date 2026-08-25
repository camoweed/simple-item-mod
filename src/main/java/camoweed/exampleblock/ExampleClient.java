package camoweed.exampleblock;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.dependency.Key;

import static net.minecraft.client.render.block.model.BlockModelDispatcher.loadDataModel;
import static camoweed.exampleblock.ExampleMod.MOD_ID;

public class ExampleClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientEvents.BEFORE_CLIENT_START.listen(Key.of(MOD_ID), ExampleClient::beforeClientStart);
		ClientEvents.BLOCK_MODEL_RELOAD.listen(Key.of(MOD_ID), ExampleClient::initBlockModels);
	}

	public static void beforeClientStart() {
		ExampleClient.registerTextures();
	}

	public static void registerTextures() {
		for (final AtlasStitcher stitcher : TextureRegistry.stitcherMap.values()) {
			TextureHelper.initializeAllFiles(MOD_ID, stitcher, true);
		}
	}

	public static void initBlockModels(BlockModelDispatcher dispatcher) {
		dispatcher.addDispatch(new BlockModelGeneric<>(ExampleBlocks.CUSTOM_BLOCK,loadDataModel("exampleblock:block/custom_block")));
	}

}
