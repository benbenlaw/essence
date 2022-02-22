package com.benbenlaw.essence.config;

import com.benbenlaw.essence.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ConfigFile {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Double> mobEssenceChance;
    public static final ForgeConfigSpec.ConfigValue<Double> spawnerShardChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> spawnerShardAmount;

    public static final ForgeConfigSpec.ConfigValue<Double> allOresChance;
//    public static final ForgeConfigSpec.ConfigValue<Integer> allOresDropSpecificOreEssence;

    public static final ForgeConfigSpec.ConfigValue<Double> basicOreEssenceChance;
    public static final ForgeConfigSpec.ConfigValue<Double> advancedOreEssenceChance;
    public static final ForgeConfigSpec.ConfigValue<Double> eliteOreEssenceChance;

    static {
        BUILDER.push("Essence config file");

        mobEssenceChance = BUILDER.comment("Mob essence drop chance 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.75").define("Mob Drop Chance", 0.75);
        spawnerShardChance = BUILDER.comment("Chance that spawner shards drop from spawners, default = 0.0").define("Spawner Shard Drop Chance", 0.0);
        spawnerShardAmount = BUILDER.comment("Amount of shards that drop from spawners, default = 1").define("Spawner Shard Amount Dropped", 1);

        allOresChance = BUILDER.comment("Essence drop chance from all ores with the forge/ores tag; 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.75").define("All ore drop chance", 0.75);
//        allOresDropSpecificOreEssence = BUILDER.comment("Change what tier of essence is dropped from all ores with forge/ores tag; basic, advanced, elite, default = basic").define("All ore drop what essence?", 1);

        basicOreEssenceChance = BUILDER.comment("Ore essence drop from ores with the essence:basic_ore tag chance; 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.75").define("Basic Ore Drop Chance", 0.75);
        advancedOreEssenceChance = BUILDER.comment("Ore essence drop from ores with the essence:advanced_ore tag chance; 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.80").define("Advanced Ore Drop Chance", 0.80);
        eliteOreEssenceChance = BUILDER.comment("Ore essence drop from ores with the essence:elite_ore tag chance; 0.0 = always, 1.0 = never, 0.5 = 50% chance, default = 0.85").define("Elite Ore Drop Chance", 0.85);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }



}
