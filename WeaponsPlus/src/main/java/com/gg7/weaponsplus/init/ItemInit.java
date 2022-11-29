package com.gg7.weaponsplus.init;

import com.gg7.weaponsplus.ModArmorItem;
import com.gg7.weaponsplus.ModArmorMaterials;
import com.gg7.weaponsplus.WeaponsPlus;
import com.google.common.base.Supplier;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeaponsPlus.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", 
			() -> new Item(new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(64)));
	
	public static final RegistryObject<Item> FROST_CORE = register("frost_core", 
			() -> new Item(new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1).rarity(Rarity.RARE).stacksTo(1)));
	
	public static final RegistryObject<SwordItem> FROST_SWORD = register("frost_sword",
			() -> new SlownessSwordItem(Tiers.FROST, 4, -2.4f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<SwordItem> VAMPIRIC_BLADE = register("vampiric_blade",
			() -> new VampiricSwordItem(Tiers.VAMPIRIC, 4, -2.4f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<SwordItem> ECHO_SWORD = ITEMS.register("echo_diamond_sword", 
			() -> new SwordItem(Tiers.Echo, 5, -2.4f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<SwordItem> ECHO_DAGGER = ITEMS.register("echo_diamond_dagger", 
			() -> new SwordItem(Tiers.Echo, 8, -3.5f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<AxeItem> ECHO_AXE = ITEMS.register("echo_diamond_axe", 
			() -> new AxeItem(Tiers.Echo, 6, -3.0f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<PickaxeItem> ECHO_PICKAXE = ITEMS.register("echo_diamond_pickaxe", 
			() -> new PickaxeItem(Tiers.Echo, 2, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<ShovelItem> ECHO_SHOVEL = ITEMS.register("echo_diamond_shovel", 
			() -> new ShovelItem(Tiers.Echo, 1, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<HoeItem> ECHO_HOE = ITEMS.register("echo_diamond_hoe", 
			() -> new HoeItem(Tiers.Echo, 0, -2.8f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<Item> ECHO_HELMET = ITEMS.register("echo_diamond_helmet", 
			() -> new ModArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.HEAD, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<Item> ECHO_CHESTPLATE = ITEMS.register("echo_diamond_chestplate", 
			() -> new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.CHEST, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<Item> ECHO_LEGGINGS = ITEMS.register("echo_diamond_leggings", 
			() -> new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.LEGS, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<Item> ECHO_BOOTS = ITEMS.register("echo_diamond_boots", 
			() -> new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.FEET, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1)));
	
	public static final RegistryObject<SwordItem> POISON_STAFF = ITEMS.register("poison_staff", 
			() -> new PoisonSwordItem(Tiers.STAFF, 0, -3.5f, new Item.Properties().tab(WeaponsPlus.WeaponsPlusTab).stacksTo(1).rarity(Rarity.RARE)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
	
	public static class Tiers{
		
		public static final Tier Echo = new ForgeTier(3, 1800, 35.0f, 2.0f, 100, null, () -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));
		public static final Tier VAMPIRIC = new ForgeTier(3, 1000, 5.0f, 0.0f, 100, null, () -> Ingredient.of(Items.ROTTEN_FLESH));
		public static final Tier FROST = new ForgeTier(3, 1000, 5.0f, 0.0f, 100, null, () -> Ingredient.of(ItemInit.FROST_CORE.get()));
		public static final Tier STAFF = new ForgeTier(3, 100, 0.0f, 0.0f, 0, null, () -> Ingredient.of(Items.STICK));
		
	}
	
	public class ModPainting{
		
		public static final DeferredRegister<PaintingVariant> PAINTING_MOTIVES = 
				DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, WeaponsPlus.MOD_ID);
		
		
		public static final RegistryObject<PaintingVariant> the_rock = PAINTING_MOTIVES.register("the_rock", () -> new PaintingVariant(96, 64));
		
		public static void register(IEventBus eventBus) {
			
			PAINTING_MOTIVES.register(eventBus);
			
		}
		
	}
	
	public static class SlownessSwordItem extends SwordItem{
		
		public SlownessSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
			
			super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
			
		}
		
		@Override
		public boolean hurtEnemy(ItemStack p_43278_, LivingEntity pTarget, LivingEntity pAttacker) {

			int chance = (int) (Math.random() * (4) + 1);
			
			if (chance == 2) {	
				pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100), pAttacker);
			}
			return super.hurtEnemy(p_43278_, pTarget, pAttacker);
		}
		
	}
	
	public static class VampiricSwordItem extends SwordItem{
		
		public VampiricSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
			
			super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
			
		}
		
		@Override
		public boolean hurtEnemy(ItemStack p_43278_, LivingEntity pTarget, LivingEntity pAttacker) {

			
			
			if (pTarget.isAlive() && !pTarget.isInvertedHealAndHarm()) {	
				pAttacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, 40), pAttacker);
			}
			return super.hurtEnemy(p_43278_, pTarget, pAttacker);
		}
		
	}
	
	public static class PoisonSwordItem extends SwordItem{
		
		public PoisonSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
			
			super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
			
		}
		
		@Override
		public boolean hurtEnemy(ItemStack p_43278_, LivingEntity pTarget, LivingEntity pAttacker) {

			pAttacker.addEffect(new MobEffectInstance(MobEffects.POISON, 100), pAttacker);
			pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, 180), pAttacker);
			
			return super.hurtEnemy(p_43278_, pTarget, pAttacker);
		}
		
	}
	
}




