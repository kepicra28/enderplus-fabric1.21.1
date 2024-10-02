package kepicra.enderplus;

import kepicra.enderplus.block.ModBlocks;
import kepicra.enderplus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// test comment
public class Enderplus implements ModInitializer {
	public static final String MOD_ID = "enderplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}