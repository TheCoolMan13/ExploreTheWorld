import inventory.*;

public class Main {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples" , 20);
        Item item2 = new Item("Sword" , 2);

        Helmet headGear = new Helmet("Helmet" , 1, 10, 0, 5, 2);
        Chestplate chestplate = new Chestplate("Iron plate" , 2 , 30 , 0, 3, 100, 1 , 2 , "Fire Resistance");
        Leggins leggins = new Leggins("Iron Leggings" , 1 , 20 , 0 , 5 , 10 , 5 , 2);
        Boots boots = new Boots("Leather inventory.Boots" , 1 , 5 , 0 , 2 , 1 , true , 1);
        Weapon weapon = new Weapon("Excaliburg" , 1 , 100 , 0.2 , 100);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(headGear);
        inventory.addItem(chestplate);
        inventory.addItem(leggins);
        inventory.addItem(boots);
        inventory.addItem(weapon);

        inventory.displayInventory();


    }
}