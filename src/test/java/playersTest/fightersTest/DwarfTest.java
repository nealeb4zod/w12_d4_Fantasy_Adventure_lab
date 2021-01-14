package playersTest.fightersTest;

import enemies.Enemy;
import player.fighter.Dwarves;
import items.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Weapons weapons;
    Dwarves thorin;
    Enemy orc;

    @Before
    public void before(){ thorin = new Dwarves("Thorin", 200);
    orc = new Enemy("Orky", 50, 100);
    weapons = new Weapons("Sword", 60);
    }

    @Test
    public void hasName(){
        assertEquals("Thorin", thorin.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, thorin.getHealthPoints());
    }

    @Test
    public void canUseWeapon(){
        thorin.changeWeapons(weapons);
        thorin.attack(thorin.getEquippedWeapon(), orc);
        assertEquals(40, orc.getHealthPoints());
    }
}
