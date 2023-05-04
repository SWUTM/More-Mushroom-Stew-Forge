package net.swutm.moremushroomstew.item.custom;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CRIMSON_STEW = stew(8).build();
    public static final FoodProperties WARPED_STEW = stew(8).build();
    public static final FoodProperties CRIMSON_WARPED_STEW = stew(16).build();

    private static FoodProperties.Builder stew(int p_150384_) {
        return (new FoodProperties.Builder()).nutrition(p_150384_).saturationMod(1F);
    }
}
