package com.benbenlaw.essence.screen;

import com.benbenlaw.essence.Essence;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Essence.MOD_ID);

    public static final RegistryObject<MenuType<EssenceConverterBlockMenu>> ESSENCE_CONVERTER_BLOCK_MENU =
            registerMenuType(EssenceConverterBlockMenu::new,"essence_converter_block_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {

        return MENUS.register(name, () -> IForgeMenuType.create(factory));

    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
