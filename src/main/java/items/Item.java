package items;

public abstract class Item {

    private String name;
    private int value;
    protected boolean consumable;

    public Item(String name, int value, boolean consumable) {
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
}
