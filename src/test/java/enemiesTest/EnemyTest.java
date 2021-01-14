package enemiesTest;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import player.fighter.Barbarian;

import static org.junit.Assert.assertEquals;


public class EnemyTest {

    Enemy orc;
    Barbarian conan;

    @Before
    public void before() {
        orc = new Enemy("Orcy", 5, 15);
        conan = new Barbarian("Conan", 25);
    }

    @Test
    public void canGetName() {
        assertEquals("Orcy", orc.getName());
    }

    @Test
    public void canGetDamage() {
        assertEquals(5, orc.getDamage());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(15, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        orc.takeDamage(5);
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void canAttackPlayer() {
        orc.attack(conan);
        assertEquals(20, conan.getHealthPoints());
    }
}
