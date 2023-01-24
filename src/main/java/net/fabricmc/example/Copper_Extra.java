package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Copper_Extra implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Copper_Extra");


	/*public static ToolItem POTATO_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
	public static ToolItem POTATO_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
//implements ToolMaterial
	public static  Copper_Sword implements ToolMaterial=
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_sword"),
					new Item(new FabricItemSettings()));*/

	public class CopperToolMaterial implements ToolMaterial {
		public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

		@Override
		public int getDurability() {
			return 500;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 5.0F;
		}

		@Override
		public float getAttackDamage() {
			return 3.0F;
		}

		@Override
		public int getMiningLevel() {
			return 3;
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.POTATO);
		}
	}



	public static ToolItem Copper_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
	public static ToolItem Copper_Sword = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());



/*
	public class CopperAxeItem extends PickaxeItem {
		public CopperAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
			super(material, attackDamage, attackSpeed, settings);
		}
	}
	public class CopperPickaxeItem extends PickaxeItem {
		public CopperPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
			super(material, attackDamage, attackSpeed, settings);
		}
	}
	public class CopperHoeItem extends PickaxeItem {
		public CopperHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
			super(material, attackDamage, attackSpeed, settings);
		}
	}
	public ToolItem Copper_Pickaxe = new CopperPickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
	public ToolItem Copper_Axe = new CopperAxeItem(CopperToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings());
	public ToolItem Copper_Hoe = new CopperHoeItem(CopperToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings());
*/

/*
	public static final Item Copper_Sword =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_sword"),
					new Item(new FabricItemSettings()));

	public static final Item Copper_Axe =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_axe"),
					new Item(new FabricItemSettings()));

	public static final Item Copper_Pickaxe =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_pickaxe"),
					new Item(new FabricItemSettings()));


	public static final Item Copper_Shovel =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_shovel"),
					new Item(new FabricItemSettings()));

	public static final Item Copper_Hoe =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_hoe"),
					new Item(new FabricItemSettings()));

	public static final Item Copper_Horse_Armor =
			Registry.register(Registries.ITEM, new Identifier("copper_extra", "copper_horse_armor"),
					new Item(new FabricItemSettings()));
*/



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");



	}
}
