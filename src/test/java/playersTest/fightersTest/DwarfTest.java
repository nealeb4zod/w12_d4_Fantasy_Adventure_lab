package playersTest.fightersTest;

import enemies.Enemy;
import player.fighter.Dwarf;
import items.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Weapons weapons;
    Dwarf thorin;
    Enemy orc;

    @Before
    public void before(){ thorin = new Dwarf("Thorin", 200);
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
        thorin.changeItem(weapons);
        thorin.attack(thorin.getEquippedWeapon(), orc);
        assertEquals(40, orc.getHealthPoints());
    }
}
