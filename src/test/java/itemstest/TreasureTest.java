package itemstest;

import items.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TreasureTest {

    private Treasure myPrecious;

    @Before
    public void before(){ myPrecious = new Treasure("My Precious", 100,true); }

    @Test
    public void canGetName(){
        assertEquals("My Precious", myPrecious.getName());
    }
}
