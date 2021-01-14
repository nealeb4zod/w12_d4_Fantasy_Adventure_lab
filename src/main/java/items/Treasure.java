package items;

public class Treasure extends ItemType {

    private int defence;

    public Treasure(String name, int defence){
        super(name);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
