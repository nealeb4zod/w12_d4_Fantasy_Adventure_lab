package itemstest;

import items.Treasure;
import items.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TreasureTest {

    private Treasure myPrecious;

    @Before
    public void before(){ myPrecious = new Treasure(TreasureType.BAGOFGOLD); }

}
