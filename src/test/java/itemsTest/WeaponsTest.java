package itemsTest;

import items.Creatures;
import items.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {

    Weapons weapons;

    @Before
    public void before(){
        weapons = new Weapons("Sword", 60);
    }

    @Test
    public void canWeaponName(){
        assertEquals("Sword", weapons.getName());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(60, weapons.getDamage());
    }
//
//    @Test
//    public void canChangeWeaponName(){
//        weapons = new Weapons("Axe");
//        assertEquals("Axe", weapons.setName());
//    }

}
