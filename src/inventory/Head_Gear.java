package inventory;

public class Head_Gear extends  Armor{

    private int visionRadius;
    private double manaRegenRate;
    private int headshotImmunity;

    public Head_Gear(String name , int quantity, int Defense, int Damage , int DamageReduction, int visionRadius)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.visionRadius = visionRadius;
        this.manaRegenRate = manaRegenRate;
        this.headshotImmunity = headshotImmunity;
    }

    @Override
    public  String toString()
    {
        return "Head Gear: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Vision Radius: " + visionRadius + ", Mana Regen Rate: " + manaRegenRate + ", , Headshot Immunity: " + headshotImmunity;
    }
}
