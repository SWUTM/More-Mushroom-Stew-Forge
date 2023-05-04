package net.swutm.moremushroomstew.item.custom;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.moremushroomstew.moremushroomstew;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, moremushroomstew.MOD_ID);

    public static final RegistryObject<Item> CRIMSON_STEW = ITEMS.register("crimson_stew",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CRIMSON_STEW)));

    public static final RegistryObject<Item> WARPED_STEW = ITEMS.register("warped_stew",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.WARPED_STEW)));

    public static final RegistryObject<Item> CRIMSON_WARPED_STEW = ITEMS.register("crimson_warped_stew",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.WARPED_STEW)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
