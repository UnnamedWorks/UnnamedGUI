package team.unnamed.gui.item;

import org.bukkit.inventory.ItemStack;
import team.unnamed.gui.button.Button;

public interface ItemClickable {

    int getSlot();

    ItemStack getItem();

    Button getButton();
}