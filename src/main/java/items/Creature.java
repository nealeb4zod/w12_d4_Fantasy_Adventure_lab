package items;

public class Creature extends Item {


    private int defence;

    public Creature(CreatureType creatureType) {
        super(creatureType.getName(), creatureType.getValue(), creatureType.isConsumable());
        this.defence = creatureType.getDefence();
    }

    public int getDefence() {
        return defence;
    }
}
