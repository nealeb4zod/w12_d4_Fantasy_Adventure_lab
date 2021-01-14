package items;

public class Spells extends ItemType {

    private int damage;

    public Spells(String name, int damage){
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
