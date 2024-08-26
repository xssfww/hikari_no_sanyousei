
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hikarinosanyousei.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HikariNoSanyouseiModTabs {
	public static CreativeModeTab TAB_HIKARISANYOUSEI;
	public static CreativeModeTab TAB_HIKARISANYOUSEITEST;
	public static CreativeModeTab TAB_HIKARISANYOUSEIFIGHT;
	public static CreativeModeTab TAB_OTHER;
	public static CreativeModeTab TAB_POTION;

	public static void load() {
		TAB_HIKARISANYOUSEI = new CreativeModeTab("tabhikarisanyousei") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HikariNoSanyouseiModItems.STARGEMSTONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_HIKARISANYOUSEITEST = new CreativeModeTab("tabhikarisanyouseitest") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HikariNoSanyouseiModItems.LUNAGEMSTONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_HIKARISANYOUSEIFIGHT = new CreativeModeTab("tabhikarisanyouseifight") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HikariNoSanyouseiModItems.SUNGEMSTONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_OTHER = new CreativeModeTab("tabother") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HikariNoSanyouseiModItems.MINI_HAKEERO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POTION = new CreativeModeTab("tabpotion") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HikariNoSanyouseiModItems.ERR_POTION.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
