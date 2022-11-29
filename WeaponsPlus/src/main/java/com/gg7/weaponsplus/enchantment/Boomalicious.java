package com.gg7.weaponsplus.enchantment;

import com.gg7.weaponsplus.sound.ModSounds;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Boomalicious extends Enchantment  {

	public Boomalicious(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... mainhand) {
		super(pRarity, pCategory, mainhand);
		
	}
	
	@Override
	public int getMaxLevel(){
		
		return 1;
		
	}
	
	
	
	@Override
	public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
		
		ServerLevel world = ( (ServerLevel) pAttacker.level);
		BlockPos block = pTarget.blockPosition();
		Player player = world.getNearestPlayer(pTarget, pLevel);
		
		if (!pAttacker.level.isClientSide()) {
			world.playSound(player, block, ModSounds.VINE_BOOM.get(), SoundSource.AMBIENT, 1f, 1f);
		}
		
		super.doPostHurt(pAttacker, pTarget, pLevel);
		
	}

}
