package com.hexopia.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.hexopia.mod.objects.items.ItemBase;
import com.hexopia.mod.objects.items.ItemSpecial;
import com.hexopia.mod.objects.items.armor.ArmorMod;
import com.hexopia.mod.objects.items.armor.ArmorMod2;
import com.hexopia.mod.objects.items.tools.ItemAdminMod;
import com.hexopia.mod.objects.items.tools.ItemAxeMod;
import com.hexopia.mod.objects.items.tools.ItemAxeMod2;
import com.hexopia.mod.objects.items.tools.ItemHammer;
import com.hexopia.mod.objects.items.tools.ItemKatanaMod;
import com.hexopia.mod.objects.items.tools.ItemPickaxeMod;
import com.hexopia.mod.objects.items.tools.ItemPickaxeMod2;
import com.hexopia.mod.objects.items.tools.ItemShovelMod;
import com.hexopia.mod.objects.items.tools.ItemShovelMod2;
import com.hexopia.mod.objects.items.tools.ItemSwordMod;
import com.hexopia.mod.objects.items.tools.ItemSwordMod2;
import com.hexopia.mod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

public class ItemInit 
{
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	//ToolsMaterials
    public static final ToolMaterial TOOL_XURANIUM = EnumHelper.addToolMaterial("xuranium tool", 5, 2500, 20.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_XURANIUM = EnumHelper.addToolMaterial("xuranium2 tool2", 5, 2500, 20.0f, 4.0f, 18);
    public static final ToolMaterial TOOL1_PIKARIUM = EnumHelper.addToolMaterial("pikarium1 tool", 5, 2800, 20.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_PIKARIUM = EnumHelper.addToolMaterial("pikarium2 tool2", 5, 2800, 20.0f, 8.0f, 18);
    public static final ToolMaterial KATANA = EnumHelper.addToolMaterial("katana", 8, 800, 20.0f, 4.0f, 500);
    public static final ToolMaterial TOOL_ADMIN = EnumHelper.addToolMaterial("admin", 10000000, 1000000, 20.0f, 100000.0f, 500);
	//0 = bois
    //1 = or & pierre
    //2 = fer
    //3 = diams
    //4 etc
    
    //AmorMaterials
    public static final ArmorMaterial ARMOR_XURANIUM = EnumHelper.addArmorMaterial("armor xuranium", Reference.MODID + ":hexopiamod", 75, new int [] {5, 7, 6, 5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
    public static final ArmorMaterial ARMOR_PIKARIUM = EnumHelper.addArmorMaterial("armor pikarium", Reference.MODID + ":hexopiamod2", 75, new int [] {6, 8, 7, 6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f);
    
    
	//Materiaux
	public static final Item XURANIUM = new ItemBase("xuranium");
	public static final Item PIKARIUM = new ItemBase("pikarium");
	
	//Tools XURANIUM
	public static final Item XURANIUM_PICKAXE = new ItemPickaxeMod2("xuranium_pickaxe", TOOL2_XURANIUM);
	public static final Item XURANIUM_SHOVEL = new ItemShovelMod2("xuranium_shovel", TOOL2_XURANIUM);
	public static final Item XURANIUM_SWORD = new ItemSwordMod2("xuranium_sword", TOOL_XURANIUM);
	public static final Item XURANIUM_AXE = new ItemAxeMod2("xuranium_axe", TOOL_XURANIUM);
	//HAMMER
    public static final Item HAMMER_XURANIUM = new ItemHammer("hammer_xuranium", TOOL_XURANIUM);
	//KATANA
	public static final Item KATANA1 = new ItemKatanaMod("katana", KATANA);
	
	//Tools PIKARIUM
	public static final Item PIKARIUM_PICKAXE = new ItemPickaxeMod2("pikarium_pickaxe", TOOL1_PIKARIUM);
	public static final Item PIKARIUM_SHOVEL = new ItemShovelMod2("pikarium_shovel", TOOL1_PIKARIUM);
	public static final Item PIKARIUM_SWORD = new ItemSwordMod2("pikarium_sword", TOOL2_PIKARIUM);
	public static final Item PIKARIUM_AXE = new ItemAxeMod2("pikarium_axe", TOOL2_PIKARIUM);
	
	//SPECIALS
	public static final Item HEAL_STICK = new ItemSpecial("heal_stick");

	
	//Armors XURANIUM
	public static final Item XURANIUM_HELMET = new ArmorMod("xuranium_helmet", ARMOR_XURANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item XURANIUM_CHESPLATE = new ArmorMod("xuranium_chesplate", ARMOR_XURANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item XURANIUM_LEGGINGS = new ArmorMod("xuranium_leggins", ARMOR_XURANIUM, 1, EntityEquipmentSlot.LEGS);
	public static final Item XURANIUM_BOOTS = new ArmorMod("xuranium_boots", ARMOR_XURANIUM, 1, EntityEquipmentSlot.FEET);
	
	//Armors PIKARIUM
	public static final Item PIKARIUM_HELMET = new ArmorMod2("pikarium_helmet", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PIKARIUM_CHESPLATE = new ArmorMod2("pikarium_chesplate", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PIKARIUM_LEGGINGS = new ArmorMod2("pikarium_leggins", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.LEGS);
	public static final Item PIKARIUM_BOOTS = new ArmorMod2("pikarium_boots", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.FEET);
	
	//ADMIN
	public static final Item ADMIN = new ItemAdminMod("admin", TOOL_ADMIN);

	//Herbes
}
