package items;

import behaviours.IDefend;

public class Creature extends Item implements IDefend {


    private int defence;
    private int defenseModifier;

    public Creature(CreatureType creatureType, int defenseModifier) {
        super(creatureType.getName(), creatureType.getValue(), creatureType.isConsumable());
        this.defence = creatureType.getDefence();
        this.defenseModifier = defenseModifier;
    }

    public int getDefence() {
        return defence;
    }

    public int getDefenseModifier() {
        return defenseModifier;
    }

    public int getTotalDefense() {
        return defence + defenseModifier;
    }
}
