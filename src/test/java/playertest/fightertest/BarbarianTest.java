package playertest.fightertest;

import player.fighter.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian conan;

    @Before
    public void before(){
        conan = new Barbarian("Conan", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", conan.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, conan.getHealthPoints());
    }

    @Test
    public void canGetMaxHealth() {
        assertEquals(100, conan.getMaxHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        conan.takeDamage(20);
        assertEquals(80, conan.getHealthPoints());
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
        assertEquals(95, conan.getHealthPoints());
    }

    @Test
    public void noOverHealing() {
        conan.takeDamage(10);
        conan.heal(15);
        assertEquals(100, conan.getHealthPoints());
    }


}
