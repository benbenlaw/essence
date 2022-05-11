package com.benbenlaw.essence.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class OreEssenceItem extends Item {
    public OreEssenceItem(Properties pProperties) {
        super(pProperties);

    }
    @Override
    public void appendHoverText(ItemStack pStack, @org.jetbrains.annotations.Nullable Level pLevel, java.util.List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.essence.ore_essence.tooltip.shift"));
        }
        else
            pTooltipComponents.add(new TranslatableComponent("tooltip.essence.ore_essence.tooltip"));
    }
}
