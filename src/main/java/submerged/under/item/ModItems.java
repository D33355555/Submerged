package submerged.under.item;

//import classes


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import submerged.under.Submerged;


public class ModItems
{
    //register kraken tooth item
    public static final Item KRAKEN_TOOTH = registerItem("kraken_tooth", new Item(new FabricItemSettings()));

    //Register item method
    private static Item registerItem(String szName, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Submerged.MOD_ID, "kraken_tooth"), item);
    }
    public static void registerModItems()
    {
        Submerged.LOGGER.info("Registering Mod items for " + Submerged.MOD_ID);

        //just dupe this to add items to diff groups (In combat tab as a placeholder)
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }

} //end class

