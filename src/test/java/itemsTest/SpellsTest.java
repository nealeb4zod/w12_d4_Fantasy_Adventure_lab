package itemsTest;

import items.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellsTest {

    Spells spells;

    @Before
    public void before(){ spells = new Spells("Leviosa", 10); }

    @Test
    public void canGetDamage(){
        assertEquals(10, spells.getDamage());
    }

    @Test
    public void canGetName(){
        assertEquals("Leviosa", spells.getName());
    }
}
