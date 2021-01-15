package items;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, int value, boolean consumable,int damage){
        super(name, value, consumable);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
