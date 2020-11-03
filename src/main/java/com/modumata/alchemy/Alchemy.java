package com.modumata.alchemy;

import com.modumata.alchemy.registry.ModBlocks;
import com.modumata.alchemy.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Alchemy implements ModInitializer
{
    public static final String MOD_ID = "mmalchemy";

    @Override
    public void onInitialize()
    {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
