package player;

import items.Item;
import items.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private final String name;
    private final int maxHealthPoints;
    private int healthPoints;
    private ArrayList<Item> inventory;
    private ArrayList<Treasure> purse;
    private boolean alive;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.maxHealthPoints = healthPoints;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<Item>();
        this.purse = new ArrayList<Treasure>();
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
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

    public void takeDamage(int damageAmount) {
        if (getHealthPoints() > damageAmount) {
            this.healthPoints -= damageAmount;
        } else {
            this.healthPoints = 0;
            this.alive = false;
        }
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
}
