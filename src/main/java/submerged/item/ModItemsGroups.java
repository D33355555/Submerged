package submerged.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import submerged.under.Submerged;

public class ModItemsGroups
{
    public static final ItemGroup SUBMERGED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Submerged.MOD_ID, "kraken_tooth"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.submerged"))
                    .icon(() ->new ItemStack(ModItems.KRAKEN_TOOTH)).entries((displayContext, entries) -> {
                        //ctrl + D to duplicate the line underneath and add the Mod item ID.
                        //This is where the items are registered into the custom item group
                        entries.add(ModItems.KRAKEN_TOOTH);

                    }).build());
    public static void registerItemGroups() {
        Submerged.LOGGER.info("Registering Item Groups for " + Submerged.MOD_ID);
    }

}
