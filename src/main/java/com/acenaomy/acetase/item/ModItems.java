package com.acenaomy.acetase.item;

import com.acenaomy.acetase.AceTASE;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PURPURITE = registerItem("purpurite",
            new Item(new FabricItemSettings()));
    public static final Item PURPURITE_SHARD = registerItem("purpurite_shard",
            new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PURPURITE);
        entries.add(PURPURITE_SHARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AceTASE.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AceTASE.LOGGER.info("Registering " + AceTASE.MOD_ID + "'s Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
