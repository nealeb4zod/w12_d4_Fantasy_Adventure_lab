package player.healer;

import items.HealingTools;
import items.Weapons;

public abstract class HealerType extends player.Player {

    private HealingTools equippedHealingTools;

    public HealerType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedHealingTools = null;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    public void setEquippedHealingTools(HealingTools equippedHealingTools) {
        this.equippedHealingTools = equippedHealingTools;
    }

    @Override
    public void heal(int pointsToHeal) {
        super.heal(pointsToHeal);
    }

    public void changeHealing(HealingTools equippedHealingTools) {
        if (equippedHealingTools != null) {
            addToInventory(equippedHealingTools);

            if (getInventory().contains(hea)) {
                removeFromInventory(newHealingTool);
                equippedHealingTools = newHealingTool;
            }
        }
    }
}