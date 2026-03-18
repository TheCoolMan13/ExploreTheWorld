package inventory;

public class Boots extends Armor{
    private int movementSpeed;
    private boolean ignoresTerrainPenalty;
    private int stealthBonus;

    public Boots(String name , int quantity, int Defense, int Damage , int DamageReduction, int movementSpeed , boolean ignoresTerrainPenalty , int stealthBonus)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.movementSpeed = movementSpeed;
        this.ignoresTerrainPenalty = ignoresTerrainPenalty;
        this.stealthBonus = stealthBonus;
    }

    @Override
    public String toString()
    {
        return "Boots: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Movement Speed: " + movementSpeed + ", Ignores Terrain Penalty: " + ignoresTerrainPenalty + ", Stealth Bonus: " + stealthBonus;
    }
}
