public abstract class Armor extends Item{

    private int Damage;
    private int DamageReduction;
    private int Defense;

    public Armor(String name , int quantity, int Defense, int Damage , int DamageReduction)
    {
        super(name , quantity);
        this.Defense = Defense;
        this.Damage = Damage;
        this.DamageReduction = DamageReduction;
    }

    public int getDefense()
    {
        return Defense;
    }
    public int getDamage()
    {
        return Damage;
    }
    public int getDamageReduction()
    {
        return DamageReduction;
    }

    @Override
    public String toString()
    {
        return "Armor: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + Damage + ", Defence: " + Defense + ", Damage Reduction: " + DamageReduction;
    }
}
