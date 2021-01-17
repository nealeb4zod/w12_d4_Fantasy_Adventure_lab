package items;

public enum DefenseType {

    SHIELD("Shield", 20, false, 20),
    LEATHERARMOUR("Leather Armour", 10, false, 10),
    CHAINMAILARMOUR("Chainmail Armour", 20, false, 20);

    private final String name;
    private final int value;
    private final boolean consumable;
    private final int defense;


    DefenseType(String name, int value, boolean consumable, int defense) {
        this.name = name;
        this.value = value;
        this.consumable = consumable;
        this.defense = defense;
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

    public int getDefense() {
        return defense;
    }
}
