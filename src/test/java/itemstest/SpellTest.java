package itemstest;

import items.Spell;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    private Spell spell;
    private Spell modifiedSpell;

    @Before
    public void before() {
        spell = new Spell(SpellType.DEATHBYCOCKROACH, 0);
        modifiedSpell = new Spell(SpellType.FIREBALL, 10);
    }

    @Test
    public void canGetDamage() {
        assertEquals(90, spell.getDamage());
    }

    @Test
    public void canGetTotalDamage() {
        assertEquals(25, modifiedSpell.getTotalDamage());
    }

}
