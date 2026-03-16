public class Main {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples" , 20);
        Item item2 = new Item("Sword" , 2);

        Head_Gear headGear = new Head_Gear("Helmet" , 1, 10, 0, 5, 2);
        Chest_Plate chestplate = new Chest_Plate("Iron plate" , 2 , 30 , 0, 3, 100);
        Leggins leggins = new Leggins("Iron Leggings" , 1 , 20 , 0 , 5 , 10);




        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(headGear);
        inventory.addItem(chestplate);
        inventory.addItem(leggins);

        inventory.displayInventory();


    }
}