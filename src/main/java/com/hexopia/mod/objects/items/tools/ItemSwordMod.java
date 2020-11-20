package com.hexopia.mod.objects.items.tools;

import java.util.Collection;
import java.util.UUID;

import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import com.hexopia.mod.Main;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordMod extends ItemSword implements IHasModel
{
	public ItemSwordMod(String name, ToolMaterial material)
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
