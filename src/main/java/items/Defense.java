package items;

import behaviours.IDefend;

public class Defense extends Item implements IDefend {

    private int defense;
    private int defenseModifier;

    public Defense (DefenseType defenseType, int defenseModifier) {
        super(defenseType.getName(), defenseType.getValue(), defenseType.isConsumable());
        this.defense = defenseType.getDefense();
        this.defenseModifier = defenseModifier;
    }

    public int getDefense() {
        return defense;
    }

    public int getDefenseModifier() {
        return defenseModifier;
    }

    public int getTotalDefense() {
        return defense + defenseModifier;
    }
}
