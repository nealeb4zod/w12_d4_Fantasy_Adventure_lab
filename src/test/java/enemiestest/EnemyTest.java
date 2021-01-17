package enemiestest;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.fighter.Barbarian;
import player.fighter.FighterType;

import static org.junit.Assert.assertEquals;


public class EnemyTest {

    private Enemy orc;
    private Barbarian conan;
    private Enemy troll;

    @Before
    public void before() {
        orc = new Enemy(EnemyType.ORC);
        conan = new Barbarian("Conan", FighterType.BARBARIAN);
        troll =  new Enemy(EnemyType.TROLL);
    }

    @Test
    public void canGetName() {
        assertEquals(EnemyType.TROLL, troll.getType());
    }

    @Test
    public void canGetDamage() {
        assertEquals(15, orc.getDamage());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(45, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(5);
        assertEquals(40, orc.getHealthPoints());
    }

    @Test
    public void canAttackPlayer() {
        orc.attack(conan);
        assertEquals(55, conan.getHealthPoints());
    }

    @Test
    public void noNegativeHealth() {
        troll.attack(conan);
        troll.attack(conan);
        troll.attack(conan);
        assertEquals(0, conan.getHealthPoints());
    }
}
