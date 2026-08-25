package camoweed.exampleitem;

import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ItemExample extends Item {

	public ItemExample(@NotNull String translationKey, @NotNull String namespaceId, int id) {
		super(translationKey, namespaceId, id);
	}

	public @Nullable ItemStack onUse(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Player player) {
		double x = player.x;
		double y = player.y;
		double z = player.z;
		// we will make it play a sound on right click
		world.playSoundEffect(player, SoundCategory.ENTITY_SOUNDS, x, y, z,"note.guitar_electric",0.5F,0.5F);
		return selfStack;
	}

	public void onUseByActivator(@NotNull ItemStack selfStack, @NotNull World world, @NotNull TileEntityActivator activator, @NotNull Random random, @NotNull TilePosc blockPos, @NotNull Direction direction, double offX, double offY, double offZ) {
		//for fun
		int x = blockPos.x();
		int y = blockPos.y();
		int z = blockPos.z();
		world.playSoundEffectAtTile(world.getClosestPlayer(x,y,z, 1.0),SoundCategory.WORLD_SOUNDS,blockPos,"note.guitar_electric",0.5F,0.5F);
	}

}
