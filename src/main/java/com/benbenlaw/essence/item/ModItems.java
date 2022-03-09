package com.benbenlaw.essence.item;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Essence.MOD_ID);

    public static final RegistryObject<Item> BASIC_MOB_ESSENCE = ITEMS.register("basic_mob_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ADVANCED_MOB_ESSENCE = ITEMS.register("advanced_mob_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ELITE_MOB_ESSENCE = ITEMS.register("elite_mob_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ACTIVATED_SPAWNER_SHARD = ITEMS.register("activated_spawner_shard", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE).fireResistant()));

    public static final RegistryObject<Item> SPAWNER_SHARD = ITEMS.register("spawner_shard", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> LIGHTNING_SUMMONER = ITEMS.register("lighning_summoner", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE).stacksTo(1)));



    public static final RegistryObject<Item> BASIC_ORE_ESSENCE = ITEMS.register("basic_ore_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ADVANCED_ORE_ESSENCE = ITEMS.register("advanced_ore_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> ELITE_ORE_ESSENCE = ITEMS.register("elite_ore_essence", () -> new Item(
            new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    public static final RegistryObject<Item> LIGHTNING_WATER_BUCKET = ITEMS.register("lightning_water_bucket", () -> new BucketItem(
            () -> ModFluids.LIGHTNING_WATER_SOURCE.get(),
            new Item.Properties().tab(ModCreativeModTab.ESSENCE).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
