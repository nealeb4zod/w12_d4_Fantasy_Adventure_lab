package player.magicuser;

import behaviours.IAttack;
import enemies.Enemy;
import items.*;

import java.util.ArrayList;

public abstract class MagicUser extends player.Player {

    public MagicUser(String name, MagicUserType magicUserType) {
        super(name, magicUserType.getType(), magicUserType.getHealthPoints(), magicUserType.getAttackBonus(), magicUserType.getDefenseBonus(), magicUserType.getSpellBonus(), magicUserType.getHealBonus());
        Offense weapon = new Offense(magicUserType.getOffenseType(), 0);
        addToInventory(weapon);
        changeOffense(weapon);
        Spell spell = new Spell(magicUserType.getSpellType(), 0);
        Creature creature = new Creature(magicUserType.getCreatureType(), 0);
        addToSpellBook(spell);
        addToInventory(creature);
        changeDefense(creature);
    }
}
