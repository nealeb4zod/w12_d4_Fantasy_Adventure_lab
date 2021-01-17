package itemstest;

import items.Offense;
import items.OffenseType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OffenseTest {

    private Offense sword;
    private Offense modifiedSword;

    @Before
    public void before(){
        sword = new Offense(OffenseType.SWORD, 0);
        modifiedSword = new Offense(OffenseType.SWORD, 20);
    }


    @Test
    public void canGetWeaponDamage(){
        assertEquals(20, sword.getTotalDamage());
    }

    @Test
    public void canGetModifiedWeaponDamage(){
        assertEquals(40, modifiedSword.getTotalDamage());
    }

}
