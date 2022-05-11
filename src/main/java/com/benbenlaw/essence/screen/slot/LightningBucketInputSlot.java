package com.benbenlaw.essence.screen.slot;

import com.benbenlaw.essence.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class LightningBucketInputSlot extends SlotItemHandler {
    public LightningBucketInputSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }
    @Override
    public boolean mayPlace(ItemStack stack) {
        return stack.is(ModItems.LIGHTNING_WATER_BUCKET.get());
    }
}
