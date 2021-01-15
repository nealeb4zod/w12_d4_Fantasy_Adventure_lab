package playertest.healertest;

import player.healer.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

        private Cleric healer;

        @Before
        public void before() {
                healer = new Cleric("Priest", 80);

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