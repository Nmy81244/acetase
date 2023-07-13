package com.acenaomy.acetase.item;

import com.acenaomy.acetase.AceTASE;
import com.acenaomy.acetase.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ACETASE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AceTASE.MOD_ID, "acetase"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.acetase"))
                    .icon(() -> new ItemStack(ModItems.PURPURITE)).entries((displayContext, entries) -> {
                        // Blocks
                        entries.add(ModBlocks.PURPURITE_BLOCK);

                        // Ingredients
                        entries.add(ModItems.PURPURITE);
                        entries.add(ModItems.PURPURITE_SHARD);
                    }).build());

    public static void registerItemGroups() {
        AceTASE.LOGGER.info("Registering Item Groups for " + AceTASE.MOD_ID + "...");
    }
}
