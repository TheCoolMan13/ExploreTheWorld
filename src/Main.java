public class Main {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples" , 20);
        Item item2 = new Item("Sword" , 2);

        Head_Gear headGear = new Head_Gear("Helmet" , 1, 10, 0, 5, 2);


        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(headGear);

        inventory.displayInventory();


    }
}