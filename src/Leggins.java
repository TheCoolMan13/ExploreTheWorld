public class Leggins extends Armor{
    private int MagicReduction;

    public Leggins(String name , int quantity, int Defense, int Damage , int DamageReduction, int MagicReduction){
        super(name , quantity, Defense, Damage , DamageReduction);
        this.MagicReduction = MagicReduction;
    }


    @Override
    public  String toString()
    {
        return "Leggings: " + getName() + ", Quantity: " + getQuantity() + ", MagicReduction " + MagicReduction;
    }
}
