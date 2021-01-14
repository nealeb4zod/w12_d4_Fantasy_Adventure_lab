package items;

public abstract class ItemType {

    private String name;

    public ItemType(String name) {
        this.name = name;
    }

    protected ItemType() {
    }

    public String getName() {
        return name;
    }
}
