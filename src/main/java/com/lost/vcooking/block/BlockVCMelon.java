package com.lost.vcooking.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockVCMelon extends BlockMelon {
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.MELON_BLOCK);
	}
	
	@Override
	protected Block setSoundType(SoundType sound) {
		super.blockSoundType = SoundType.WOOD;
		return this;
	}
}
