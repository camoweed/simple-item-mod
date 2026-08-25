package camoweed.exampleblock;

import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.exampleblock.ExampleMod.MOD_ID;

public class ExampleRecipes {

	public static void initializeRecipes() {
		RecipeBuilder.initNameSpace(MOD_ID);
		//shapeless
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ExampleBlocks.CUSTOM_BLOCK)
			.create("custom_block_shapeless", new ItemStack(ExampleBlocks.CUSTOM_BLOCK));
		//shaped
		RecipeBuilder.Shaped(MOD_ID,"CCC","C C","CCC")
			.addInput('C',ExampleBlocks.CUSTOM_BLOCK)
			.create("custom_block_shaped", new ItemStack(ExampleBlocks.CUSTOM_BLOCK, 8));
	}
}
