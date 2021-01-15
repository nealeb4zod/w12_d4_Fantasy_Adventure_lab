package playertest.magicusertest;

import enemies.Enemy;
import enemies.EnemyType;
import items.Spell;
import org.junit.Before;
import org.junit.Test;
import player.magicuser.Warlock;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    private Warlock voldy;
    private Enemy orc;
    private Spell leviosa;

    @Before
    public void before() {
        voldy = new Warlock("Voldemort", 3000);
        orc = new Enemy("Orcy", EnemyType.ORC);
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
        assertEquals(35, orc.getHealthPoints());
    }
}
