package items;

public class Spell extends Item {

    private int damage;

    public Spell(String name, int value, boolean consumable, int damage){
        super(name, value, consumable);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
