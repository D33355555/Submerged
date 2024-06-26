package submerged.under;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import submerged.under.item.ModItemGroups;

public class Submerged implements ModInitializer {

	public static final String MOD_ID = "submerged";

    public static final Logger LOGGER = LoggerFactory.getLogger("submerged");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");


	}
}