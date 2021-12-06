package com.benbenlaw.essence.item;

import com.benbenlaw.essence.essence;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, essence.MOD_ID);

    public static final RegistryObject<Item> BASIC_MOB_ESSENCE = ITEMS.register("basic_mob_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ADVANCED_MOB_ESSENCE = ITEMS.register("advanced_mob_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
