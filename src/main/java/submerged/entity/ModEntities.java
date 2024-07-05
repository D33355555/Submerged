package submerged.entity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;

public class ModEntities implements ModInitializer
{

    public static final EntityType<CubeEntity> DSF = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("submerged", "death_swarm_fish"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize()
    {
        FabricDefaultAttributeRegistry.register(DSF, CubeEntity.createMobAttributes());
    }// End onInitialize

}// End Class
