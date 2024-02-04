package net.nicefilms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nicefilms.Simplexity;
import net.nicefilms.blocks.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SIMPLEXITY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Simplexity.ModID, "simplexity"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.simplexity"))
                    .icon(()  -> new ItemStack(ModItems.ICON)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CORRUPTEDEYE);
                        entries.add(ModBlocks.VOIDSTONE);
                    }).build());


    public static void registerItemGroups(){
        Simplexity.LOGGER.info("Registering Item Groups for" +Simplexity.FriendlyModID);
    }

}
