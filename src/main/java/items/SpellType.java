package items;

public enum SpellType {

    FIREBALL(1, "Fireball", 15, false, 15),
    LIGHTNINGBOLT(2, "Lightning Bolt", 30, false, 30),
    DEATHBYCOCKROACH(3, "Death by Cockroach", 90, true, 90);

    private final int index;
    private final String name;
    private final int value;
    private final boolean consumable;
    private final int damage;

    SpellType(int index, String name, int value, boolean consumable, int damage) {
        this.index = index;
        this.name = name;
        this.value = value;
        this.consumable = consumable;
        this.damage = damage;
    }

    public int getIndex() {
        return index;
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
}
