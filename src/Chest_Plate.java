public class Chest_Plate extends Armor{
    private int thoughness;
    private int thornsDamage;
    private int extraInventorySlots;
    private String elementalResistance;

    public Chest_Plate(String name , int quantity, int Defense, int Damage , int DamageReduction, int thoughness , int thornsDamage , int extraInventorySlots , String elementalResistance)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.thoughness = thoughness;
        this.thornsDamage = thornsDamage;
        this.extraInventorySlots = extraInventorySlots;
        this.elementalResistance = elementalResistance;
    }

    @Override
    public  String toString()
    {
        return "Chest Plate: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Thoughness" + thoughness + ", Thorns Damage: " + thornsDamage + ", Extra Inventory Slots: " + extraInventorySlots + ", Elemental Resistance: " + elementalResistance;
    }
}
