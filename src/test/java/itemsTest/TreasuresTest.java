package itemsTest;

import items.Treasures;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TreasuresTest {

    Treasures myPrecious;

    @Before

    public void before(){ myPrecious = new Treasures("My Precious", 1000); }

    @Test
    public void canGetDefence(){
        assertEquals(1000, myPrecious.getDefence());
    }

    @Test
    public void canGetName(){
        assertEquals("My Precious", myPrecious.getName());
    }
}
