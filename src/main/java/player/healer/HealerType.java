package player.healer;

import items.HealingTool;
import items.Weapons;

public abstract class HealerType extends player.Player {

    private HealingTool equippedHealingTool;

    public HealerType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedHealingTool = null;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    public void setEquippedHealingTools(HealingTool equippedHealingTool) {
        this.equippedHealingTool = equippedHealingTool;
    }

    @Override
    public void heal(int pointsToHeal) {
        super.heal(pointsToHeal);
    }

    public void changeHealingTool(HealingTool newHealingTool) {
        if (equippedHealingTool != null) {
            addToInventory(equippedHealingTool);

            if (getInventory().contains(newHealingTool)) {
                removeFromInventory(newHealingTool);
                equippedHealingTool = newHealingTool;
            }
        }
    }
}