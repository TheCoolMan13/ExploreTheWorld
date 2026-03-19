package inventory;

public class Weapon extends Item{
    int damage;
    double atackSpeed;
    int memoryLeakDamage; // DOT damage

    public Weapon(String name , int quantity , int damage , double atackSpeed , int memoryLeakDamage)
    {
        super(name , quantity);
        this.damage = damage;
        this.atackSpeed = atackSpeed;
        this.memoryLeakDamage = memoryLeakDamage;
    }

    @Override
    public String toString()
    {
    return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + damage + ", Attack Speed: " + atackSpeed + ", Memory Leak Damage: " + memoryLeakDamage;
    }
}
