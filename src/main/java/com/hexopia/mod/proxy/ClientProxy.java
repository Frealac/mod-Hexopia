package com.hexopia.mod.proxy;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer(Item item, int meta) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
		// TODO Auto-generated method stub
		super.registerVariantRenderer(item, meta, filename, id);
	}
	
	@Override
	public void registerEntityRenderers() {
		// TODO Auto-generated method stub
		super.registerEntityRenderers();
	}
	
	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		super.preInit();
	}	
}