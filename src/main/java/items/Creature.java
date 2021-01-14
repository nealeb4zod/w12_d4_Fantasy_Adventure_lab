package items;

public class Creature extends ItemType{

    private String name;
    private int defence;

    public Creature(String name, int defence){
        super(name);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
