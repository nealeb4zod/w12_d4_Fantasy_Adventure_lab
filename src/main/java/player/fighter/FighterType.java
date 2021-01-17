package player.fighter;

import behaviours.IType;
import items.OffenseType;

public enum FighterType {
    BARBARIAN(OffenseType.SPEAR, 70, 20, 0, -20, -10),
    KNIGHT(OffenseType.SWORD, 60, 10, 10, -20, -10),
    DWARF(OffenseType.AXE, 65, 0, 20 ,-20, -10);

    private  final String type;
    private final OffenseType offenseType;
    private final int healthPoints;
    private final int attackBonus;
    private final int defenseBonus;
    private final int spellBonus;
    private final int healBonus;

    FighterType(OffenseType offenseType, int healthPoints, int attackBonus, int defenseBonus, int spellBonus, int healBonus) {
        this.type = "Fighter";
        this.offenseType = offenseType;
        this.healthPoints = healthPoints;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.spellBonus = spellBonus;
        this.healBonus = healBonus;
    }

    public OffenseType getOffenseType() {
        return offenseType;
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

    public String getType() {
        return type;
    }
}
