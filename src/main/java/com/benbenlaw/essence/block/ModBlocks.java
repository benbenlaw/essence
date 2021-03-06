package com.benbenlaw.essence.block;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.item.ModCreativeModTab;
import com.benbenlaw.essence.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Essence.MOD_ID);



//New Blocks

    public static final RegistryObject<Block> BASIC_MOB_ESSENCE_BLOCK = registerBlock("basic_mob_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(2f)));

    public static final RegistryObject<Block> ADVANCED_MOB_ESSENCE_BLOCK = registerBlock("advanced_mob_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.5f)));

    public static final RegistryObject<Block> ELITE_MOB_ESSENCE_BLOCK = registerBlock("elite_mob_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f)));

    public static final RegistryObject<Block> BASIC_ORE_ESSENCE_BLOCK = registerBlock("basic_ore_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(2f)));

    public static final RegistryObject<Block> ADVANCED_ORE_ESSENCE_BLOCK = registerBlock("advanced_ore_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.5f)));

    public static final RegistryObject<Block> ELITE_ORE_ESSENCE_BLOCK = registerBlock("elite_ore_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f)));

    public static final RegistryObject<Block> SOLID_LIGHTNING_WATER_BLOCK = registerBlock("solid_lightning_water_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).sound(SoundType.GLASS)),
            "tooltip.essence.block.solid_lightning_water_block");

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.ESSENCE)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });

    }






    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.ESSENCE)));

    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
