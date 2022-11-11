package com.gg7.weaponsplus.effect;

import com.gg7.weaponsplus.WeaponsPlus;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
	public static final DeferredRegister<MobEffect> MOB_EFFECTS 
		= DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WeaponsPlus.MOD_ID);

	public static final RegistryObject<MobEffect> DARK_STRENGTH = MOB_EFFECTS.register("dark_strength", 
			() -> new DarkStrengthEffect(MobEffectCategory.BENEFICIAL, 7211158));
	
	public static void register(IEventBus eventBus) {
		MOB_EFFECTS.register(eventBus);
	}
	
}
