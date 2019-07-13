package redempt.cmdmgr2.itemutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemUtils {
	
	/**
	 * Renames an ItemStack
	 * @param item The ItemStack to be renamed
	 * @param name The name to give the ItemStack
	 * @return The renamed ItemStack
	 */
	public static ItemStack rename(ItemStack item, String name) {
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		ItemStack clone = item.clone();
		clone.setItemMeta(meta);
		return clone;
	}
	
	/**
	 * Set a single line of lore for an ItemStack
	 * @param item The ItemStack to be given lore
	 * @param line The line of lore to be given
	 * @return The modified ItemStack
	 */
	public static ItemStack setLore(ItemStack item, String line) {
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		lore.add(line);
		meta.setLore(lore);
		ItemStack clone = item.clone();
		clone.setItemMeta(meta);
		return clone;
	}
	
	/**
	 * Set multiple lines of lore for an ItemStack
	 * @param item The ItemStack to be given lore
	 * @param lore The lines of lore to be given
	 * @return The modified ItemStack
	 */
	public static ItemStack setLore(ItemStack item, List<String> lore) {
		ItemMeta meta = item.getItemMeta();
		meta.setLore(lore);
		ItemStack clone = item.clone();
		clone.setItemMeta(meta);
		return clone;
	}
	
	/**
	 * Add a line of lore to an ItemStack
	 * @param item The ItemStack to be given lore
	 * @param line The line of lore to add
	 * @return The modified ItemStack
	 */
	public static ItemStack addLore(ItemStack item, String line) {
		ItemMeta meta = item.getItemMeta();
		List<String> lore = meta.getLore();
		if (lore == null) {
			lore = new ArrayList<>();
		}
		lore.add(line);
		meta.setLore(lore);
		ItemStack clone = item.clone();
		clone.setItemMeta(meta);
		return clone;
	}
	
	/**
	 * Set multiple lines of lore for an ItemStack
	 * @param item The ItemStack to be given lore
	 * @param lore The lines of lore to be given
	 * @return The modified ItemStack
	 */
	public static ItemStack setLore(ItemStack item, String... lore) {
		return setLore(item, Arrays.asList(lore));
	}
	
	/**
	 * Add an enchantment to an ItemStack
	 * @param item The ItemStack to be enchanted
	 * @param enchant The Enchantment to add to the ItemStack
	 * @param level The level of the Enchantment
	 * @return The enchanted ItemStack
	 */
	public static ItemStack addEnchant(ItemStack item, Enchantment enchant, int level) {
		ItemMeta meta = item.getItemMeta();
		meta.addEnchant(enchant, level, true);
		if (level == 0) {
			meta.removeEnchant(enchant);
		}
		ItemStack clone = item.clone();
		clone.setItemMeta(meta);
		return clone;
	}
	
}
