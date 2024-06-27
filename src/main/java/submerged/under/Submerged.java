package submerged.under;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import submerged.item.ModItems;
import submerged.item.ModItemsGroups;

public class Submerged implements ModInitializer {

	public static final String MOD_ID = "submerged";

	public static final Logger LOGGER = LoggerFactory.getLogger("submerged");

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");


	}
}