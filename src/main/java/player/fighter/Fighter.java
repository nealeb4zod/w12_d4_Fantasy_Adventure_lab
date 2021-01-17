package player.fighter;

import enemies.Enemy;
import items.Offense;
import items.OffenseType;

public abstract class Fighter extends player.Player {

    public Fighter(String name, FighterType fighterType) {
        super(name, fighterType.getType(), fighterType.getHealthPoints(), fighterType.getAttackBonus(), fighterType.getDefenseBonus(), fighterType.getSpellBonus(), fighterType.getHealBonus());
        Offense weapon = new Offense(fighterType.getOffenseType(), 0);
        addToInventory(weapon);
        changeOffense(weapon);
    }

}
