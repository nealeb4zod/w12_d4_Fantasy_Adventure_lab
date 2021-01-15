package player.magicuser;

import enemies.Enemy;
import items.Creature;
import items.Spell;

import java.util.ArrayList;

public abstract class MagicUser extends player.Player {

    private Spell equippedSpell;
    private Creature equippedCreature;
    private ArrayList<Spell> spellBook;

    public MagicUser(String name, int healthPoints) {
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
