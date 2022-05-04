package com.benbenlaw.essence.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SpawnerShardExtractorItem extends Item {
    public SpawnerShardExtractorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @org.jetbrains.annotations.Nullable Level pLevel, java.util.List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.essence.spawner_shard_extractor.tooltip.shift"));
        }
        else
            pTooltipComponents.add(new TranslatableComponent("tooltip.essence.spawner_shard_extractor.tooltip"));
    }
}
