package com.benbenlaw.essence.data;

import com.benbenlaw.essence.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables  extends BlockLoot {
    @Override
    protected void addTables() {

//Add Simple Loot Table

        this.dropSelf(ModBlocks.BASIC_MOB_ESSENCE_BLOCK.get());
        this.dropSelf(ModBlocks.ADVANCED_MOB_ESSENCE_BLOCK.get());





    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
