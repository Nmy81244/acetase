package com.acenaomy.acetase;

import com.acenaomy.acetase.item.ModItemGroups;
import com.acenaomy.acetase.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AceTASE implements ModInitializer {
	public static final String MOD_ID = "acetase";
    public static final Logger LOGGER = LoggerFactory.getLogger("acetase");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}