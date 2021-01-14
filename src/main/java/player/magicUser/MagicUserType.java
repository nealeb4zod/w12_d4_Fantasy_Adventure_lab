package player.magicUser;

import enemies.Enemy;
import items.Creature;
import items.Spell;

public abstract class MagicUserType extends player.Player {

    private Spell equippedSpell;
    private Creature equippedCreature;

    public MagicUserType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedSpell = null;
        this.equippedCreature = null;
    }

    public Spell getEquippedSpell() {
        return equippedSpell;
    }

    public Creature getEquippedCreature() {
        return equippedCreature;
    }

    public void castSpell(Spell spell, Enemy enemy) {
        enemy.takeDamage(spell.getDamage());
    }

    public void changeSpells(Spell newSpell) {
        if (equippedSpell != null) {
            addToInventory(equippedSpell);
        }
        if (getInventory().contains(newSpell)) {
            removeFromInventory(newSpell);
            equippedSpell = newSpell;
        }
    }

    public void changeCreature(Creature newCreature) {
        if (equippedCreature != null) {
            addToInventory(equippedCreature);
        }
        if (getInventory().contains(newCreature)) {
            removeFromInventory(newCreature);
            equippedCreature = newCreature;
        }
    }



}
