public class Leggins extends Armor{
    private int MagicReduction;
    private double dodgeChance;
    private int staminaBoost;

    public Leggins(String name , int quantity, int Defense, int Damage , int DamageReduction, int MagicReduction , double dodgeChance , int staminaBoost){
        super(name , quantity, Defense, Damage , DamageReduction);
        this.MagicReduction = MagicReduction;
        this.dodgeChance = dodgeChance;
        this.staminaBoost = staminaBoost;
    }


    @Override
    public  String toString()
    {
        return "Leggins: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Defence: " + getDefense() + ", Damage Reduction: " + getDamageReduction() + ", Magic Reduction: " + MagicReduction + ", Dodge Chance: " + dodgeChance + ", Stamina Boost: " + staminaBoost;
    }
}
