package com.benbenlaw.essence.events;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.events.loot.SpawnerAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Essence.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>event) {
        event.getRegistry().registerAll(

//Basic Mob Essence

        new SpawnerAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"spawner"))

/*
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/cave_spider")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/creeper")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/drowned")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/guardian")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/phantom")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/pillager")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/silverfish")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/skeleton")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/slime")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/spider")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/stray")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/witch")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/zombie")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/endermite")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/husk")),

//Advanced Mob Essence

        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/hoglin")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/evoker")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/enderman")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/blaze")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/magma_cube")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/ghast")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/ravager")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/piglin_brute")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/piglin")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/shulker")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/vex")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/wither_skeleton")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/zoglin")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/zombiefied_piglin")),
        new MobAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"minecraft/vindicator")),




//Ores

        new OreAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"ores/iron")),
        new OreAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"ores/deepslate_iron")),
        new OreAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"ores/copper")),
        new OreAdditionModifier.Serializer().setRegistryName
                (new ResourceLocation(Essence.MOD_ID,"ores/deepslate_copper"))



 */

        );
    }
}














