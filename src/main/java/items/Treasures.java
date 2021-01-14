package items;

public class Treasures extends ItemType {

    private int defence;

    public Treasures(String name, int defence){
        super(name);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
