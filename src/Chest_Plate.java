public class Chest_Plate extends Armor{
    private int Thoughness;

    public Chest_Plate(String name , int quantity, int Defense, int Damage , int DamageReduction, int Thoughness)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.Thoughness = Thoughness;
    }

    @Override
    public  String toString()
    {
        return "Chest Plate: " + getName() + ", Quantity: " + getQuantity() + ", Thoughness: " + Thoughness;
    }
}
