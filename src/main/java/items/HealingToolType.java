package items;

public enum HealingToolType {
    POTION(1,"Healing Potion", 10, true, 10),
    BIGPOTION(2,"Large Healing Potion", 30, true, 30),
    BANDAGE(3,"Bandage", 50, true, 50);

    private final int index;
    private final String name;
    private final int value;
    private final boolean consumable;
    private final int healingAmount;

    HealingToolType(int index, String name, int value, boolean consumable, int healingAmount) {
        this.index = index;
        this.name = name;
        this.value = value;
        this.consumable = consumable;
        this.healingAmount = healingAmount;
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

    public int getHealingAmount() {
        return healingAmount;
    }

    public int getIndex() {
        return index;
    }
}
