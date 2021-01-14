package playersTest.healersTest;

import player.healer.Clerics;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericsTest {

        Clerics healer;

        @Before
        public void before() {
                healer = new Clerics("Priest", 80);

        }

        @Test
        public void hasName(){
                assertEquals("Priest", healer.getName());
        }

        @Test
        public void hasHealthPoints(){
                assertEquals(80, healer.getHealthPoints());
        }
}