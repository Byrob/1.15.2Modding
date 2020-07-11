package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MeteoriteBlock extends Block
{
	
	public MeteoriteBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f, 6.0f)
				
				
				);
	}

}
