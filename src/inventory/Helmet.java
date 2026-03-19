package inventory;

public class Helmet extends  Armor{

    private double
            cryptoMiningBonus;
    private double vulnerabilityScan;
    private int manaRegenRate;

    public Helmet(String name , int quantity, int Defense, int Damage , int DamageReduction, int cryptoMiningBonus)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.cryptoMiningBonus = cryptoMiningBonus;
        this.vulnerabilityScan = vulnerabilityScan;
        this.manaRegenRate = manaRegenRate;
    }

    @Override
    public  String toString()
    {
        return "Head Gear: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Crypto Mining Bonus: " + cryptoMiningBonus + ", Vulnerability Scan: " + vulnerabilityScan + ", Mana Regen Rate: " + manaRegenRate;
    }
}
