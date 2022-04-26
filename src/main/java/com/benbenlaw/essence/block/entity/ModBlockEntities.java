package com.benbenlaw.essence.block.entity;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.block.ModBlocks;
import com.benbenlaw.essence.block.entity.custom.EssenceConverterBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Essence.MOD_ID);

    public static final RegistryObject<BlockEntityType<EssenceConverterBlockEntity>> ESSENCE_CONVERTER_BLOCK_ENTITY =
            BLOCK_ENTITES.register("essence_converter_block_entity", () ->
                    BlockEntityType.Builder.of(EssenceConverterBlockEntity::new,
                            ModBlocks.ESSENCE_CONVERTER_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITES.register(eventBus);
    }
}
