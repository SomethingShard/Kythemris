package com.shard.kythemris.item;

import com.shard.kythemris.Kythemris;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kythemris.MODID);
    // Deferred wants to add items under our Mod ID

    public static final DeferredItem<Item> SUNLIGHT1 = ITEMS.register("sunlight1", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
