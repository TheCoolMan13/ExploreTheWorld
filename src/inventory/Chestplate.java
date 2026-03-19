package inventory;

public class Chestplate extends Armor{
    private int firewallRegen;
    private int packetReflection;
    private int extraInventorySlots;
    private String elementalResistance;

    public Chestplate(String name , int quantity, int Defense, int Damage , int DamageReduction, int firewallRegen, int packetReflection, int extraInventorySlots , String elementalResistance)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.firewallRegen = firewallRegen;
        this.packetReflection = packetReflection;
        this.extraInventorySlots = extraInventorySlots;
        this.elementalResistance = elementalResistance;
    }

    @Override
    public  String toString()
    {
        return "Chest Plate: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Firewall Regen: " + firewallRegen + ", Pocket Reflection: " + packetReflection + ", Extra Inventory Slots: " + extraInventorySlots + ", Elemental Resistance: " + elementalResistance;
    }
}
