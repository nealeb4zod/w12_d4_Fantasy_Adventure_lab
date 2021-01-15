package itemsTest;

import items.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CreatureTest {

    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Iglu", 80, false, 15);
    }

    @Test
    public void canGetCreatureName(){
        assertEquals("Iglu", creature.getName());
    }

    @Test
    public void canGetCreatureDefence(){
        assertEquals(15, creature.getDefence());
    }

    @Test
    public void canGetValue() {
        assertEquals(80, creature.getValue());
    }


}
