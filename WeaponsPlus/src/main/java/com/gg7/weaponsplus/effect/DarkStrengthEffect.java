package com.gg7.weaponsplus.effect;

import com.gg7.weaponsplus.init.ItemInit;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;

public class DarkStrengthEffect extends MobEffect {
	public DarkStrengthEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}
	
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		
		Item heldItem = pLivingEntity.getMainHandItem().getItem();
		Item neededItem = ItemInit.ECHO_DAGGER.get();
		
		if(heldItem == neededItem) {
			
			pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1));
			super.applyEffectTick(pLivingEntity, pAmplifier);
			
		} 
		
	}
	
	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}

}
