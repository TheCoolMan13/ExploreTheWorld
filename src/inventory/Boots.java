package inventory;

public class Boots extends Armor{
    private int movementSpeed;
    private boolean cacheSize;
    private int stealthBonus;

    public Boots(String name , int quantity, int Defense, int Damage , int DamageReduction, int movementSpeed , boolean cacheSize, int stealthBonus)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.movementSpeed = movementSpeed;
        this.cacheSize = cacheSize;
        this.stealthBonus = stealthBonus;
    }

    @Override
    public String toString()
    {
        return "Boots: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Movement Speed: " + movementSpeed + ", Cache Size: " + cacheSize + ", Stealth Bonus: " + stealthBonus;
    }
}
