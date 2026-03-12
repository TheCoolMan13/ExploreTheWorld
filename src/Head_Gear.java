public class Head_Gear extends  Armor{

    private int CoolDownReduction;

    public Head_Gear(String name , int quantity, int Defense, int Damage , int DamageReduction, int CoolDownReduction)
    {
        super(name , quantity, Defense, Damage , DamageReduction);
        this.CoolDownReduction = CoolDownReduction;
    }

    @Override
    public  String toString()
    {
        return "Head Gear: " + getName() + ", Quantity: " + getQuantity() + ", CoolDown Reduction: " + CoolDownReduction;
    }
}
