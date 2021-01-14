package playersTest.fightersTest;

import player.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight sirGalahad;

    @Before
    public void before() {sirGalahad = new Knight("Sir Galahad", 150); }

    @Test
    public void hasName(){
        assertEquals("Sir Galahad", sirGalahad.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(150, sirGalahad.getHealthPoints());
    }
}

