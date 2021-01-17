package player;

import behaviours.IAttack;
import behaviours.IDefend;
import enemies.Enemy;
import items.*;

import java.util.ArrayList;

public abstract class Player {

    private final String name;
    private String type;
    private final int maxHealthPoints;
    private int healthPoints;
    private ArrayList<Item> inventory;
    private ArrayList<Treasure> purse;
    private ArrayList<Spell> spellBook;
    private boolean alive;
    private IAttack equippedOffense;
    private IDefend equippedDefense;
    private int attackBonus;
    private int defenseBonus;
    private int spellBonus;
    private int healBonus;

    public Player(String name, String type, int healthPoints, int attackBonus, int defenseBonus, int spellBonus, int healBonus) {
        this.name = name;
        this.type = type;
        this.maxHealthPoints = healthPoints;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<Item>();
        this.purse = new ArrayList<Treasure>();
        this.spellBook = new ArrayList<>();
        this.alive = true;
        this.equippedOffense = null;
        this.equippedDefense = null;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.spellBonus = spellBonus;
        this.healBonus = healBonus;

    }

    public String getName() {
        return name;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void heal(int pointsToHeal) {
        if ((healthPoints + pointsToHeal) > getMaxHealthPoints()) {
            healthPoints = getMaxHealthPoints();
        }
        else {
            healthPoints += pointsToHeal;
        }
    }

    public boolean isAlive() {
        return alive;
    }


    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }



    public ArrayList<Treasure> getPurse() {
        return purse;
    }

    public void addToPurse(Treasure treasure) {
        purse.add(treasure);
    }

    public void removeFromPurse(Treasure treasure) {
        purse.remove(treasure);
    }



    public int getDefenseBonus() {
        return defenseBonus;
    }

    public void takeDamage(int damageAmount) {
        int damageTaken;
        if (getEquippedDefense() != null) {
         damageTaken = damageAmount - getEquippedDefense().getTotalDefense() - getDefenseBonus();
        } else {
             damageTaken = damageAmount - getDefenseBonus();
        }
        if (getHealthPoints() > damageTaken) {
            this.healthPoints -= damageTaken;
        } else {
            this.healthPoints = 0;
            this.alive = false;
        }
    }



    public IAttack getEquippedOffense() {
        return equippedOffense;
    }

    public void changeOffense(IAttack newOffense) {
        if (getEquippedOffense() != null){
            addToInventory((Item) getEquippedOffense());
        }
        if (getInventory().contains(newOffense)){
            removeFromInventory((Item)newOffense);
            this.equippedOffense = newOffense;
        }
    }

    public IDefend getEquippedDefense() {
        return equippedDefense;
    }

    public void changeDefense(IDefend newDefense) {
        if (getEquippedDefense() != null){
            addToInventory((Item) getEquippedDefense());
        }
        if (getInventory().contains(newDefense)){
            removeFromInventory((Item) newDefense);
            this.equippedDefense = newDefense;
        }
    }


    public int getAttackBonus() {
        return attackBonus;
    }

    public void attack(Enemy enemy) {
        int totalOffenseDamage = equippedOffense.getTotalDamage() + getAttackBonus();
        if (totalOffenseDamage > 0) {
        enemy.takeDamage(totalOffenseDamage);}
    }





    public int getSpellBonus() {
        return spellBonus;
    }

    public void castSpell(Spell spell, Enemy enemy) {
        if (getSpellBook().contains(spell)) {
            int totalSpellDamage = spell.getTotalDamage() + getSpellBonus();
            if (totalSpellDamage > 0) {
                enemy.takeDamage(totalSpellDamage);
            }
        }
    }

    public ArrayList<Spell> getSpellBook() {
        return spellBook;
    }

    public void addToSpellBook(Spell spell) {
        spellBook.add(spell);
    }


    public int getHealBonus() {
        return healBonus;
    }

    public void healOther(Player player, HealingTool healingTool) {
        if (getInventory().contains(healingTool)) {
            int totalHealing = healingTool.getHealingAmount() + getHealBonus();
            if (totalHealing > 0) {
                player.heal(totalHealing);
            }
        }
    }

    public String getType() {
        return type;
    }
}
