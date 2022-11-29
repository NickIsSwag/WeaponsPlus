package com.gg7.weaponsplus.enchantment;

import com.gg7.weaponsplus.WeaponsPlus;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {

	public static final DeferredRegister<Enchantment> ENCHANTMENTS = 
			DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WeaponsPlus.MOD_ID);
	
	public static RegistryObject<Enchantment> EXPERIENCE_JUNKIE = ENCHANTMENTS.register("experience_junkie", 
			() -> new ExperienceJunkie(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
	
	public static RegistryObject<Enchantment> BOOMALICIOIUS = ENCHANTMENTS.register("boomalicious", 
			() -> new Boomalicious(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.MAINHAND));
	
	public static void register(IEventBus eventBus) {
		ENCHANTMENTS.register(eventBus);
	}
	
}
