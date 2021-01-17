package items;

public enum TreasureType {

    BAGOFGOLD(1,"Gold Coins",25, true),
    BAGOFGEMS(2,"Gemstones", 50, true);

    private final int index;
    private final String name;
    private final int value;
    private final boolean consumable;

    TreasureType(int index, String name, int value, boolean consumable) {
        this.index = index;
        this.name = name;
        this.value = value;
        this.consumable = consumable;
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

    public int getIndex() {
        return index;
    }
}

