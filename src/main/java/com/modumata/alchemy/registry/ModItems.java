package com.modumata.alchemy.registry;

import com.modumata.alchemy.Alchemy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item TEST_OZONE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, "test_ozone"), TEST_OZONE);
    }
}
