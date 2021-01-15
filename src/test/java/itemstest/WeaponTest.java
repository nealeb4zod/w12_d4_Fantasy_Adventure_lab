package itemstest;

import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Sword", 25, false,60);
    }

    @Test
    public void canWeaponName(){
        assertEquals("Sword", weapon.getName());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(60, weapon.getDamage());
    }

}
