package rooms;

import enemies.Enemy;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Item> treasureChest;
    private ArrayList<Enemy> enemies;

    public Room () {
        this.treasureChest = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public ArrayList<Item> getTreasureChest() {
        return treasureChest;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addToTreasureChest(Item item) {
        treasureChest.add(item);
    }

    public void removeFromTreasureChest(Item item) {
        treasureChest.remove(item);
    }

    public void addEnemy (Enemy enemy) {enemies.add(enemy);}

}
