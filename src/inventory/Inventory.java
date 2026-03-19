package inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory()
    {
        items = new ArrayList<>();
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    public void displayInventory()
    {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public String getInventoryString() {
        if (items.isEmpty()) {
            return "Inventory is empty.";
        }

        StringBuilder sb = new StringBuilder("=== YOUR INVENTORY ===\n");
        for (Item item : items) {
            sb.append(item.toString()).append("\n"); // Adds each item and a line break
        }
        return sb.toString();
    }

}
