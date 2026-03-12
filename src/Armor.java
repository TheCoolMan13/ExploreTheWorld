public abstract class Armor extends Item{

    private int Damage;
    private int DamageReduction;

    public Armor(String name , int quantity, int Defense, int Damage , int DamageReduction)
    {
        super(name , quantity);
        this.Damage = Damage;
        this.DamageReduction = DamageReduction;
    }

    @Override
    public String toString()
    {
        return "Armor: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + Damage + ", Damage Reduction: " + DamageReduction;
    }
}
