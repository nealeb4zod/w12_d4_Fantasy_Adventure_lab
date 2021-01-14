package rooms;

import enemies.Enemy;
import items.Treasure;

public class Room {

    private Treasure treasure;
    private Enemy enemy;

    public Room (Treasure treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }


}
