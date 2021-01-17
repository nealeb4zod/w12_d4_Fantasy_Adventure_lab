package player.healer;

import items.HealingTool;
import items.HealingToolType;
import items.Item;
import items.OffenseType;

public enum HealerType {
    CLERIC(OffenseType.FIST, HealingToolType.POTION, 4, 40, -10, 0, 20, 20);

    private final String type;
    private final OffenseType offenseType;
    private final HealingToolType healingToolType;
    private final int healingToolQuantity;
    private final int healthPoints;
    private final int attackBonus;
    private final int defenseBonus;
    private final int spellBonus;
    private final int healBonus;

    HealerType(OffenseType offenseType, HealingToolType healingToolType, int healingToolQuantity, int healthPoints, int attackBonus, int defenseBonus, int spellBonus, int healBonus) {
        this.type = "Healer";
        this.offenseType = offenseType;
        this.healingToolType = healingToolType;
        this.healingToolQuantity = healingToolQuantity;
        this.healthPoints = healthPoints;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.spellBonus = spellBonus;
        this.healBonus = healBonus;
    }

    public HealingToolType getHealingToolType() {
        return healingToolType;
    }

    public int getHealingToolQuantity() {
        return healingToolQuantity;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public int getSpellBonus() {
        return spellBonus;
    }

    public int getHealBonus() {
        return healBonus;
    }

    public OffenseType getOffenseType() {
        return offenseType;
    }

    public String getType() {
        return type;
    }
}
