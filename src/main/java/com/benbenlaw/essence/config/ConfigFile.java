package com.benbenlaw.essence.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ConfigFile {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Double> mobEssenceChance;

    static {
        BUILDER.push("Essence config file");

        mobEssenceChance = BUILDER.comment("Mob essence drop chance 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.75").define("Mob Drop Chance", 0.75);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }



}
