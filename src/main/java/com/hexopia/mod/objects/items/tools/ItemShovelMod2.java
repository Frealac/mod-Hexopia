package com.hexopia.mod.objects.items.tools;

import com.hexopia.mod.Main;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemShovelMod2 extends ItemSpade implements IHasModel
{

	public ItemShovelMod2(String name, ToolMaterial material) 
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

}
