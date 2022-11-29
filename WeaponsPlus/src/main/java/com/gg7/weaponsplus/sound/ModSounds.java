package com.gg7.weaponsplus.sound;

import com.gg7.weaponsplus.WeaponsPlus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = 
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WeaponsPlus.MOD_ID);
	
	public static final RegistryObject<SoundEvent> VINE_BOOM = registerSoundEvent("vine_boom");
	
	
	private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(WeaponsPlus.MOD_ID, name)));
	}
	
	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
	
}
