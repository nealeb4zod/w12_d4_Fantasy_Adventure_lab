package enemies;

import player.Player;

public class Enemy {

    private EnemyType type;
    private int damage;
    private int healthPoints;
    private boolean alive;


    public Enemy(EnemyType type){
        this.type = type;
        this.damage = type.getDamage();
        this.healthPoints = type.getHealthPoints();
        this.alive = true;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageAmount) {
        if (getHealthPoints() > damageAmount) {
            this.healthPoints -= damageAmount;
        } else {
            this.healthPoints = 0;
            this.alive = false;
        }
    }

    public void attack(Player player) {
        player.takeDamage(damage);
    }

    public EnemyType getType() {
        return type;
    }
}
