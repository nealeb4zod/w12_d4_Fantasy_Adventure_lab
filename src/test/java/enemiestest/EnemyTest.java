package enemiestest;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.fighter.Barbarian;

import static org.junit.Assert.assertEquals;


public class EnemyTest {

    private Enemy orc;
    private Barbarian conan;
    private Enemy troll;

    @Before
    public void before() {
        orc = new Enemy("Orcy", EnemyType.ORC);
        conan = new Barbarian("Conan", 25);
        troll =  new Enemy("Trolly",EnemyType.TROLL);
    }

    @Test
    public void canGetName() {
        assertEquals("Orcy", orc.getName());
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
        assertEquals(10, conan.getHealthPoints());
    }

    @Test
    public void noNegativeHealth() {
        troll.attack(conan);
        assertEquals(0, conan.getHealthPoints());
    }
}
