package net.nicefilms.blocks;

import com.mojang.serialization.Decoder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nicefilms.Simplexity;

public class ModBlocks {
    public static final Block CAT_BLOCK = registerBlock("cat_block",
        new Block(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).luminance(9).jumpVelocityMultiplier(10)));
    public static final Block VOIDSTONE = registerBlock("voidstone",
        new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).luminance(0).notSolid()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Simplexity.ModID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Simplexity.ModID, name),
            new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Simplexity.LOGGER.info("Registering ModBlocks for" + Simplexity.FriendlyModID);
    }
}
