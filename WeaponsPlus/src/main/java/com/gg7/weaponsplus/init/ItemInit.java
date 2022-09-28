package com.gg7.weaponsplus.init;

import com.gg7.weaponsplus.WeaponsPlus;
import com.google.common.base.Supplier;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeaponsPlus.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", 
			() -> new Item(new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(64)));
	
	public static final RegistryObject<SwordItem> ECHO_SWORD = ITEMS.register("echo_diamond_sword", 
			() -> new SwordItem(Tiers.Echo, 5, -2.0f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab)));
	
	public static final RegistryObject<AxeItem> ECHO_AXE = ITEMS.register("echo_diamond_axe", 
			() -> new AxeItem(Tiers.Echo, 6, -3.0f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab)));
	
	public static final RegistryObject<PickaxeItem> ECHO_PICKAXE = ITEMS.register("echo_diamond_pickaxe", 
			() -> new PickaxeItem(Tiers.Echo, 2, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab)));
	
	public static final RegistryObject<ShovelItem> ECHO_SHOVEL = ITEMS.register("echo_diamond_shovel", 
			() -> new ShovelItem(Tiers.Echo, 1, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab)));
	
	public static final RegistryObject<HoeItem> ECHO_HOE = ITEMS.register("echo_diamond_hoe", 
			() -> new HoeItem(Tiers.Echo, 0, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
	
	public static class Tiers{
		
		public static final Tier Echo = new ForgeTier(3, 1800, 35.0f, 2.0f, 100, null, () -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));
		
	}
}
