package itemstest;

import items.Creature;
import items.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class CreatureTest {

    private Creature creature;

    @Before
    public void before(){
        creature = new Creature(CreatureType.CAT);
    }

    @Test
    public void canGetCreatureName(){
        assertEquals("Cat", creature.getName());
    }

    @Test
    public void canGetCreatureDefence(){
        assertEquals(15, creature.getDefence());
    }

    @Test
    public void canGetValue() {
        assertEquals(25, creature.getValue());
    }

    @Test
    public void canGetConsumable() {
        assertFalse(creature.isConsumable());
    }


}
