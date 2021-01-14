package itemsTest;

import items.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CreatureTest {

    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Iglu", 80);
    }

    @Test
    public void canGetCreatureName(){
        assertEquals("Iglu", creature.getName());
    }

    @Test
    public void canGetCreatureDefence(){
        assertEquals(80, creature.getDefence());
    }


}
