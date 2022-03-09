package com.benbenlaw.essence.fluid;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.block.ModBlocks;
import com.benbenlaw.essence.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");


    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, Essence.MOD_ID);

    public static final RegistryObject<FlowingFluid> LIGHTNING_WATER_SOURCE
            = FLUIDS.register("lightning_water_source", () -> new ForgeFlowingFluid.Source(ModFluids.LIGHTNING_WATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LIGHTNING_WATER_FLOWING
            = FLUIDS.register("lightning_water_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LIGHTNING_WATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIGHTNING_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LIGHTNING_WATER_SOURCE.get(), () -> LIGHTNING_WATER_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(5).viscosity(3).sound(SoundEvents.BUBBLE_COLUMN_BUBBLE_POP).overlay(WATER_OVERLAY_RL)
            .color(0xbffed0d0)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LIGHTNING_WATER_BLOCK.get()).bucket(() -> ModItems.LIGHTNING_WATER_BUCKET.get());

    public static final RegistryObject<LiquidBlock> LIGHTNING_WATER_BLOCK = ModBlocks.BLOCKS.register("lightning_water",
            () -> new LiquidBlock(() -> ModFluids.LIGHTNING_WATER_SOURCE.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
