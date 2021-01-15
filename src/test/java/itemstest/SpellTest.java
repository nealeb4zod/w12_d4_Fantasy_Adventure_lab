package itemstest;

import items.Spell;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    private Spell spell;

    @Before
    public void before(){ spell = new Spell(SpellType.DEATHBYCOCKROACH; }

    @Test
    public void canGetDamage(){
        assertEquals(90, spell.getDamage());
    }

    @Test
    public void canGetName(){
        assertEquals("Death by Cockroach", spell.getName());
    }
}
