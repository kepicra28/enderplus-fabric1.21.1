package kepicra.enderplus.item;

import kepicra.enderplus.Enderplus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TWISTED_ENDER_EYE = registerItem("twisted_ender_eye",new Item(new Item.Settings()));
    public static final Item GLEAM_ENDER_PEARL = registerItem("gleam_ender_pearl",new Item(new Item.Settings()));
    public static final Item BURNED_BLAZE_POWDER = registerItem("burned_blaze_powder", new Item(new Item.Settings()));

    private  static  Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Enderplus.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Enderplus.LOGGER.info("Registring Mod Items for" + Enderplus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TWISTED_ENDER_EYE);
            entries.add(GLEAM_ENDER_PEARL);
            entries.add(BURNED_BLAZE_POWDER);
        });
    }
}
