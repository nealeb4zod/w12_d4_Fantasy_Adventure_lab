package itemsTest;

import items.Creatures;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreaturesTest {

    Creatures creatures;

    @Before
    public void before(){
        creatures = new Creatures("Iglu", 80);
    }

    @Test
    public void canGetCreatureName(){
        assertEquals("Iglu", creatures.getName());
    }

    @Test
    public void canGetCreatureDefence(){
        assertEquals(80, creatures.getDefence());
    }


}
