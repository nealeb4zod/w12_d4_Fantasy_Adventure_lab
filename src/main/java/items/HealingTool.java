package items;

public class HealingTool extends Item {

    private int healingAmount;

    public HealingTool(String name, int value, boolean consumable, int healingAmount) {
        super(name, value, consumable);
        this.consumable = true;
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }
}
