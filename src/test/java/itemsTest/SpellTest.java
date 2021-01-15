package itemsTest;

import items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){ spell = new Spell("Leviosa", 20, false,10); }

    @Test
    public void canGetDamage(){
        assertEquals(10, spell.getDamage());
    }

    @Test
    public void canGetName(){
        assertEquals("Leviosa", spell.getName());
    }
}
