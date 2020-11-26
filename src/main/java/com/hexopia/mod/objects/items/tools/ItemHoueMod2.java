package com.hexopia.mod.objects.items.tools;

import java.util.Random;

import com.hexopia.mod.Main;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockGrassPath;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemHoueMod2 extends ItemHoe implements IHasModel
{
    public ItemHoueMod2(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TUTO_TAB);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
    
    @SuppressWarnings("incomplete-switch")
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        
        Random rand = new Random();
        ItemStack itemstack = player.getHeldItem(hand);
 
        if(block instanceof BlockCrops && !worldIn.isRemote)
        {
            if(block.equals(Blocks.POTATOES) && ((BlockCrops)block).isMaxAge(iblockstate))
            {
                worldIn.setBlockState(pos, ((BlockCrops)block).withAge(0));
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.POTATO, rand.nextInt(6))));
            }
            else if(block.equals(Blocks.BEETROOTS) && ((BlockCrops)block).isMaxAge(iblockstate))
            {
                worldIn.setBlockState(pos, ((BlockCrops)block).withAge(0));  
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BEETROOT, rand.nextInt(5))));
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BEETROOT_SEEDS, rand.nextInt(3))));
            }
            else if(block.equals(Blocks.CARROTS) && ((BlockCrops)block).isMaxAge(iblockstate))
            {
                worldIn.setBlockState(pos, ((BlockCrops)block).withAge(0));  
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CARROT, rand.nextInt(6))));
            }
            else if(block.equals(Blocks.WHEAT) && ((BlockCrops)block).isMaxAge(iblockstate))
            {
                worldIn.setBlockState(pos, ((BlockCrops)block).withAge(0)); 
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.WHEAT, rand.nextInt(5))));
                worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.WHEAT_SEEDS, rand.nextInt(3))));
            }
            
            itemstack.damageItem(1, player);
            
            return EnumActionResult.SUCCESS;
        }
        
        else if(block instanceof BlockGrass || block instanceof BlockDirt || block instanceof BlockGrassPath)
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
 
            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }
 
                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }
 
            return EnumActionResult.PASS;
        }
        return EnumActionResult.PASS;
    }
}