package com.benbenlaw.essence.events;

import com.benbenlaw.essence.essence;
import com.benbenlaw.essence.events.loot.MobAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = essence.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>event) {
        event.getRegistry().registerAll(

//Basic Mob Essence

                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(essence.MOD_ID,"pig"))
        );
    }
}