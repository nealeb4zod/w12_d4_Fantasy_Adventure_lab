package items;

public class Spell extends ItemType {

    private int damage;

    public Spell(String name, int damage){
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
