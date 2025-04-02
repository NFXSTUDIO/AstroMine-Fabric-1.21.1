package net.nfxstudio.astromine.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nfxstudio.astromine.Astromine;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Astromine.MODID);

    // ITEMS :
    public static DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
