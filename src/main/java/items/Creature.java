package items;

public class Creature extends Item {


    private int defence;

    public Creature(String name, int value, boolean consumable, int defence) {
        super(name, value, consumable);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
