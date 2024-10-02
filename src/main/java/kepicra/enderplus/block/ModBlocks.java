package kepicra.enderplus.block;

import kepicra.enderplus.Enderplus;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Enderplus.MOD_ID, name), block);
    }

    private static void registerBlockItems(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Enderplus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void  registerModBlocks(){
        Enderplus.LOGGER.info("Registering Mod Blocks for " + Enderplus.MOD_ID);
    }
}
