package playertest.fightertest;

import enemies.Enemy;
import enemies.EnemyType;
import items.Weapon;
import player.fighter.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    private Weapon axe;
    private Dwarf thorin;
    private Enemy orc;

    @Before
    public void before(){
        thorin = new Dwarf("Thorin", 200);
        orc = new Enemy("Orcy", EnemyType.ORC);
        axe = new Weapon("Axe", 25, false,25);
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
    public void canAttack(){
        thorin.addToInventory(axe);
        thorin.changeWeapons(axe);
        thorin.attack(thorin.getEquippedWeapon(), orc);
        assertEquals(20, orc.getHealthPoints());
    }
}
