package items;

public enum OffenseType {

    FIST(1, "FIST", 0, false, 0),
    SWORD(2, "Sword", 20, false, 20),
    AXE(3, "Axe", 20, false, 20),
    SPEAR(4, "Spear", 20, false, 20);

    private final int index;
    private final String name;
    private final int value;
    private final boolean consumable;
    private final int damage;

    OffenseType(int index, String name, int value, boolean consumable, int damage) {
        this.index = index;
        this.name = name;
        this.value = value;
        this.consumable = consumable;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public int getIndex() {
        return index;
    }
}
