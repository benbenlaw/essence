package com.benbenlaw.essence.events;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.config.ConfigFile;
import com.benbenlaw.essence.item.ModItems;
import com.benbenlaw.essence.util.ModTags;
import com.mojang.math.Vector3d;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Essence.MOD_ID)
public class ModEvents {



    @SubscribeEvent
    public static void allOreChance(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().level.isClientSide()) {
            BlockPos blockPos = event.getPos(); //          Block block = event.getState().getBlock();
            Level world = (Level) event.getWorld();

            if (event.getState().is(Tags.Blocks.ORES))  //CHANGE TO ORES
                if (Math.random() > ConfigFile.allOresChance.get()) {

                    world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                            new ItemStack(ModItems.BASIC_ORE_ESSENCE.get())));     //event.getPlayer().addItem(new ItemStack(ModItems.ADVANCED_MOB_ESSENCE.get().asItem()));  //event.getPlayer().setSecondsOnFire(3);
                            //new ItemStack(ModItems.BASIC_ORE_ESSENCE.get())));
                }
        }
    }

    @SubscribeEvent
    public static void summonLightning(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.LIGHTNING_SUMMONER.get())) {
            if (blockState.is(Blocks.LIGHTNING_ROD)) {

                LightningBolt lightning = EntityType.LIGHTNING_BOLT.create(world);
                lightning.setPos(Vec3.upFromBottomCenterOf(blockPos, 1));
                world.addFreshEntity(lightning);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).shrink(1);
                world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }



    /*

    @SubscribeEvent
    public static void addBasicEssenceToBasicOres(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().level.isClientSide) {
//          Block block = event.getState().getBlock();
            BlockPos blockPos = event.getPos();
            Level world = (Level) event.getWorld();

            if (event.getState().is(ModTags.Blocks.ADVANCED_ORES))  //CHANGE TO ORES
                if (Math.random() > ConfigFile.basicOreEssenceChance.get()) {

                    world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                            new ItemStack(ModItems.BASIC_MOB_ESSENCE.get())));
                }
        }
    }

    @SubscribeEvent
    public static void addAdvancedEssenceToAdvancedOres(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().level.isClientSide) {
//          Block block = event.getState().getBlock();
            BlockPos blockPos = event.getPos();
            Level world = (Level) event.getWorld();

            if (event.getState().is(ModTags.Blocks.ADVANCED_ORES))  //CHANGE TO ORES
                if (Math.random() > ConfigFile.advancedOreEssenceChance.get()) {

                    world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                            new ItemStack(ModItems.ADVANCED_ORE_ESSENCE.get())));
                }
        }
    }

    @SubscribeEvent
    public static void addEliteEssenceToEliteOres(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().level.isClientSide()) {

            BlockPos blockPos = event.getPos();
            Level world = (Level) event.getWorld();

            if (event.getState().is(ModTags.Blocks.ELITE_ORES))  //CHANGE TO ORES
                if (Math.random() > ConfigFile.eliteOreEssenceChance.get()) {
                    world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                            new ItemStack(ModItems.ELITE_ORE_ESSENCE.get())));
                }
        }
    }



    @SubscribeEvent
    public static void addMobEssenceToMobs(LivingDeathEvent event) {

        Vec3 entityPos = event.getEntity().position();
        Level world = event.getEntity().getLevel();

        if (Math.random() > ConfigFile.mobEssenceChance.get()) {

            world.addFreshEntity(new ItemEntity(world, entityPos.x(), entityPos.y(), entityPos.z(),
                    new ItemStack(ModItems.BASIC_MOB_ESSENCE.get())));
        }
    }

     */
}

