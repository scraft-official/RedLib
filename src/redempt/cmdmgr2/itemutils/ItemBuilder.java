package redempt.cmdmgr2.itemutils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class ItemBuilder extends ItemStack {
	
	/**
	 * Constructs a new ItemBuilder. An ItemBuilder extends ItemStack, an can be used as such.
	 * @param material The type of the item
	 * @param amount The amount of the item
	 */
	public ItemBuilder(Material material, int amount) {
		super(material, amount);
	}
	
	/**
	 * Constructs a new ItemBuilder. An ItemBuilder extends ItemStack, an can be used as such.
	 * @param material The type of the item
	 */
	public ItemBuilder(Material material) {
		super(material);
	}
	
	/**
	 * Constructs an ItemBuilder using a pre-existing item
	 * @param item The item to copy
	 */
	public ItemBuilder(ItemStack item) {
		super(item);
	}
	
	/**
	 * Adds an enchantment to this ItemBuilder
	 * @param enchant The enchantment to add
	 * @param level The level of the enchantment
	 * @return The enchanted ItemBuilder
	 */
	public ItemBuilder addEnchant(Enchantment enchant, int level) {
		return new ItemBuilder(ItemUtils.addEnchant(this, enchant, level));
	}
	
	/**
	 * Set the lore of this ItemBuilder
	 * @param lore The lines of lore
	 * @return The ItemBuilder with lore added
	 */
	public ItemBuilder setLore(String... lore) {
		return new ItemBuilder(ItemUtils.setLore(this, lore));
	}
	
	/**
	 * Add a line of lore to this ItemBuilder
	 * @param line The line of lore
	 * @return The ItemBuilder with lore added
	 */
	public ItemBuilder addLore(String line) {
		return new ItemBuilder(ItemUtils.addLore(this, line));
	}
	
	/**
	 * Renames this ItemBuilder
	 * @param name The name to set
	 * @return The renamed ItemBuilder
	 */
	public ItemBuilder setName(String name) {
		return new ItemBuilder(ItemUtils.rename(this, name));
	}
	
	/**
	 * Set the durability (damage) of the ItemBuilder
	 * @param durability The durability to set
	 * @return The ItemBuilder with its durability changed
	 */
	public ItemBuilder setDurability(int durability) {
		this.setDurability((short) durability);
		return new ItemBuilder(this);
	}
	
}
