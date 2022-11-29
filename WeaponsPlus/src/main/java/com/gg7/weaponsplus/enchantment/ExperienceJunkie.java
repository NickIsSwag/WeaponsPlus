package com.gg7.weaponsplus.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ExperienceJunkie extends Enchantment {

	public ExperienceJunkie(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... mainhand) {
		super(pRarity, pCategory, mainhand);
		
	}

	@Override
	public int getMaxLevel(){
		
		return 3;
		
	}
	
	@Override
	public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
		
		if (!pAttacker.level.isClientSide()) {
			
			ServerLevel world = ( (ServerLevel) pAttacker.level);
			BlockPos block = pTarget.blockPosition();
			
			if(pLevel == 1) {
				
				int chance = (int) (Math.random() * (5) + 1);
				
				if (chance == 2) {
					EntityType.EXPERIENCE_BOTTLE.spawn(world, null, null, block, 
						MobSpawnType.TRIGGERED, true, true);
				}
				
			}
			if(pLevel == 2) {
			
				int chance = (int) (Math.random() * (4) + 1);
				
				if (chance == 2) {
					EntityType.EXPERIENCE_BOTTLE.spawn(world, null, null, block, 
						MobSpawnType.TRIGGERED, true, true);
				}
				
			}
			if(pLevel == 3) {
				
				int chance = (int) (Math.random() * (3) + 1);
				
				if (chance == 2) {
					EntityType.EXPERIENCE_BOTTLE.spawn(world, null, null, block, 
						MobSpawnType.TRIGGERED, true, true);
				}
			}
			
		}
		
		super.doPostAttack(pAttacker, pTarget, pLevel);
	}
}
