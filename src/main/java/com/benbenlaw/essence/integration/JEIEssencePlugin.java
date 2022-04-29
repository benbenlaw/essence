package com.benbenlaw.essence.integration;

import com.benbenlaw.essence.Essence;
import com.benbenlaw.essence.recipe.EssenceConverterRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import mezz.jei.api.recipe.RecipeType;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIEssencePlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Essence.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                EssenceConverterRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<EssenceConverterRecipe> recipes = rm.getAllRecipesFor(EssenceConverterRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(EssenceConverterRecipeCategory.UID, EssenceConverterRecipe.class), recipes);
    }
}
