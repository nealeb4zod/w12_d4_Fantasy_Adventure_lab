package player.magicuser;

import items.CreatureType;
import items.OffenseType;
import items.SpellType;

public enum MagicUserType {
    WIZARD(OffenseType.FIST, SpellType.FIREBALL, CreatureType.CAT, 40, -20, -10, 20, 0),
    WARLOCK(OffenseType.FIST, SpellType.FIREBALL, CreatureType.BAT,40, -20, 0, 20 ,-10);

    private final String type;
    private final OffenseType offenseType;
    private final SpellType spellType;
    private final CreatureType creatureType;
    private final int healthPoints;
    private final int attackBonus;
    private final int defenseBonus;
    private final int spellBonus;
    private final int healBonus;

    MagicUserType (OffenseType offenseType, SpellType spellType, CreatureType creatureType, int healthPoints, int attackBonus, int defenseBonus, int spellBonus, int healBonus) {
        this.type = "MagicUser";
        this.offenseType = offenseType;
        this.spellType = spellType;
        this.creatureType = creatureType;
        this.healthPoints = healthPoints;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.spellBonus = spellBonus;
        this.healBonus = healBonus;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
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
