package playertest.healertest;

import player.healer.Cleric;
import org.junit.Before;
import org.junit.Test;
import player.healer.HealerType;

import static org.junit.Assert.assertEquals;

public class ClericTest {

        private Cleric healer;

        @Before
        public void before() {
                healer = new Cleric("Priest", HealerType.CLERIC);

        }

}