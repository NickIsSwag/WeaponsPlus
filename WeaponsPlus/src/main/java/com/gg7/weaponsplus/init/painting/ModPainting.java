package com.gg7.weaponsplus.init.painting;

import com.gg7.weaponsplus.WeaponsPlus;

import net.minecraft.world.entity.decoration.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPainting {
    public static final DeferredRegister<PaintingVariant> PAINTING_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, WeaponsPlus.MOD_ID);


    public static final RegistryObject<PaintingVariant> MARATHON =
            PAINTING_MOVTIES.register("rock", () -> new PaintingVariant(96, 64));

    public static void register(IEventBus eventBus) {
        PAINTING_MOVTIES.register(eventBus);
    }
}