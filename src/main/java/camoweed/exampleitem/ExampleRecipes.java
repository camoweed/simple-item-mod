package camoweed.exampleitem;

import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.exampleitem.ExampleMod.MOD_ID;

public class ExampleRecipes {

	public static void initializeRecipes() {
		RecipeBuilder.initNameSpace(MOD_ID);
		//shaped
		RecipeBuilder.Shaped(MOD_ID," S ","XSX","XIX")
			.addInput('I', Items.INGOT_IRON)
			.addInput('X', Items.INGOT_STEEL)
			.addInput('S', Items.STRING)
			.create("guitar_shaped", new ItemStack(ExampleItems.GUITAR));
	}
}
