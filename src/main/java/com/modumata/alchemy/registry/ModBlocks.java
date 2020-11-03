package com.modumata.alchemy.registry;

import com.modumata.alchemy.Alchemy;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block TEST_STONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(Alchemy.MOD_ID, "test_stone"), TEST_STONE);
        Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, "test_stone"), new BlockItem(TEST_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
