package net.nicefilms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nicefilms.Simplexity;

public class ModItems {
    // Items

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item PHONE = registerItem("phone", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        // You Need To Add All Your Items Here Too
        entries.add(RUBY);
        entries.add(PHONE);
    }

    // ITEM Init Functions
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Simplexity.ModID, name), item);
    }

    public static void registerModItems(){
        Simplexity.LOGGER.info("Registering Mod Items for " + Simplexity.FriendlyModID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
