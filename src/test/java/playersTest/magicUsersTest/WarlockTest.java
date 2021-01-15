package playersTest.magicUsersTest;

import enemies.Enemy;
import items.Spell;
import org.junit.Before;
import org.junit.Test;
import player.magicUser.Warlock;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    Warlock voldy;
    Enemy orc;
    Spell leviosa;

    @Before
    public void before() {
        voldy = new Warlock("Voldemort", 3000);
        orc = new Enemy("Orky", 50, 100);
        leviosa = new Spell("Leviosa", 20, false,10);
    }

    @Test
    public void canGetName(){
        assertEquals("Voldemort", voldy.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(3000, voldy.getHealthPoints());
    }

    @Test
    public void canCastSpell() {
        voldy.addToInventory(leviosa);
        voldy.changeSpells(leviosa);
        voldy.castSpell(voldy.getEquippedSpell(), orc);
        assertEquals(90, orc.getHealthPoints());
    }
}
