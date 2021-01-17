package playertest.fightertest;

import enemies.Enemy;
import enemies.EnemyType;
import player.fighter.Barbarian;
import org.junit.Before;
import org.junit.Test;
import player.fighter.FighterType;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian conan;
    private Enemy troll;

    @Before
    public void before(){
        conan = new Barbarian("Conan", FighterType.BARBARIAN);
        troll = new Enemy(EnemyType.TROLL);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", conan.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(70, conan.getHealthPoints());
    }

    @Test
    public void canGetMaxHealth() {
        assertEquals(70, conan.getMaxHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        conan.takeDamage(20);
        assertEquals(50, conan.getHealthPoints());
    }

    @Test
    public void noNegativeHealth() {
        conan.takeDamage(110);
        assertEquals(0, conan.getHealthPoints());
    }

    @Test
    public void canHeal() {
        conan.takeDamage(10);
        conan.heal(5);
        assertEquals(65, conan.getHealthPoints());
    }

    @Test
    public void noOverHealing() {
        conan.takeDamage(10);
        conan.heal(15);
        assertEquals(70, conan.getHealthPoints());
    }
}
