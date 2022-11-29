package com.gg7.weaponsplus;

import com.gg7.weaponsplus.effect.ModEffects;
import com.gg7.weaponsplus.enchantment.ModEnchantments;
import com.gg7.weaponsplus.init.BlockInit;
import com.gg7.weaponsplus.init.ItemInit;
import com.gg7.weaponsplus.init.ItemInit.ModPainting;
import com.gg7.weaponsplus.sound.ModSounds;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("weaponsplus")

public class WeaponsPlus {
	
	public static final String MOD_ID = "weaponsplus";
	
	public static final CreativeModeTab WeaponsPlusTab = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public WeaponsPlus() {
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		ModPainting.register(bus);
		ModEffects.register(bus);
		ModSounds.register(bus);
		ModEnchantments.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}


