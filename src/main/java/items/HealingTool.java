package items;

public class HealingTool extends Item {

    private int healingAmount;

    public HealingTool(HealingToolType healingToolType) {
        super(healingToolType.getName(), healingToolType.getValue(), healingToolType.isConsumable());
        this.healingAmount = healingToolType.getHealingAmount();
    }

    public int getHealingAmount() {
        return healingAmount;
    }
}
