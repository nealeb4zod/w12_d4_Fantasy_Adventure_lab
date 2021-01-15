package items;

public enum CreatureType {
    CAT("Cat", 25, false, 15),
    BAT("Bat", 25, false, 15),
    RAT("Rat", 25, false, 15),
    ;

    private final String name;
    private final int value;
    private final boolean consumable;
    private final int defence;

    CreatureType (String name, int value, boolean consumable, int defence) {
        this.name = name;
        this.value = value;
        this.consumable = consumable;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public int getDefence() {
        return defence;
    }
}
