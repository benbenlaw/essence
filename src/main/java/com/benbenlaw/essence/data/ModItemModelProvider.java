package com.benbenlaw.essence.data;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.block.ModBlocks;
import com.benbenlaw.essence.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Essence.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        customItemModels();
    }

    private void customItemModels() {
        simpleItem(ModItems.ESSENCE_CONVERTER.get());
        simpleItem(ModItems.ACTIVATED_SPAWNER_SHARD.get());
        simpleItem(ModItems.SPAWNER_SHARD_EXTRACTOR.get());

        simpleItem(ModItems.SPAWNER_SHARD.get());
        simpleItem(ModItems.LIGHTNING_WATER_BUCKET.get());
        simpleItem(ModItems.BASIC_MOB_ESSENCE.get());
        simpleItem(ModItems.BASIC_ORE_ESSENCE.get());
        simpleItem(ModItems.ADVANCED_ORE_ESSENCE.get());
        simpleItem(ModItems.ADVANCED_MOB_ESSENCE.get());
        simpleItem(ModItems.ELITE_ORE_ESSENCE.get());
        simpleItem(ModItems.ELITE_MOB_ESSENCE.get());

    //    spawnEgg(ModItems.RESOURCE_SLIME_SPAWN_EGG.get());


        simpleItem(ModItems.LIGHTNING_WATER_BUCKET.get());


        simpleBlock(ModBlocks.ADVANCED_ORE_ESSENCE_BLOCK.get());
        simpleBlock(ModBlocks.ADVANCED_MOB_ESSENCE_BLOCK.get());

        simpleBlock(ModBlocks.ELITE_ORE_ESSENCE_BLOCK.get());
        simpleBlock(ModBlocks.ELITE_MOB_ESSENCE_BLOCK.get());

        simpleBlock(ModBlocks.BASIC_ORE_ESSENCE_BLOCK.get());
        simpleBlock(ModBlocks.BASIC_MOB_ESSENCE_BLOCK.get());

        simpleBlock(ModBlocks.SOLID_LIGHTNING_WATER_BLOCK.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Essence.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleBlock(Block block) {
        return cubeAll(block.getRegistryName().getPath(), new ResourceLocation(Essence.MOD_ID,
                "block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder spawnEgg(Item item) {
        return withExistingParent(item.getRegistryName().getPath(), ITEM_FOLDER + "/template_spawn_egg");
    }
}