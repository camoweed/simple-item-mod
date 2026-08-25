package camoweed.exampleitem;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static camoweed.exampleitem.ExampleMod.MOD_ID;

public class ExampleItems {
	public static Item GUITAR;

	public static void aftterItemInit() {
		GUITAR = new ItemBuilder(MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.WAND_NBT))
			.setStackSize(1)
			.build(new ItemExample("guitar","exampleitem:item/guitar",1743));
	}
}
