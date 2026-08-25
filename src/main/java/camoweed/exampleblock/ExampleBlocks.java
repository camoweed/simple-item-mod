package camoweed.exampleblock;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static camoweed.exampleblock.ExampleMod.MOD_ID;

public class ExampleBlocks {
	public static Block<?> CUSTOM_BLOCK;

	public static void afterBlockInit() {
		CUSTOM_BLOCK = new BlockBuilder(MOD_ID)
			// you need to tell it where to go in the inventory
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Blocks.BASALT))
			.setTags(BlockTags.PLANTABLE_IN_JAR,BlockTags.MINEABLE_BY_HOE,BlockTags.INFINITE_BURN)
			.setBlockSound(BlockSounds.CRYSTAL)
			.setHardness(1.0F)
			.setLuminance(15)
			.build("custom_block",15678, block -> new BlockLogic(block, Materials.BASALT));
	}
}

