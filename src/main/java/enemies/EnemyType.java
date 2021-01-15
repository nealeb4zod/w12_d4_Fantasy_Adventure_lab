package enemies;

public enum EnemyType {
    ORC(15, 45),
    TROLL(30, 90),
    SKELETON(20, 60);

    private final int damage;
    private final int healthPoints;

    EnemyType(int damage, int healthPoints) {
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}


