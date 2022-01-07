package com.benbenlaw.essence.events;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.config.ConfigFile;
import com.benbenlaw.essence.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Essence.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addEssenceToOreDrops1(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().level.isClientSide()) {
//          Block block = event.getState().getBlock();
            BlockPos blockPos = event.getPos();
            Level world = (Level) event.getWorld();


            if (event.getState().is(Tags.Blocks.DIRT))  //CHANGE TO ORES
                if(Math.random() > ConfigFile.oreEssenceChance.get()) {

                    world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(),
                        new ItemStack(ModItems.BASIC_ORE_ESSENCE.get())));


//              event.getPlayer().addItem(new ItemStack(ModItems.ADVANCED_MOB_ESSENCE.get().asItem()));

//              event.getPlayer().setSecondsOnFire(3);
            }
        }
    }
}


//}

//}
