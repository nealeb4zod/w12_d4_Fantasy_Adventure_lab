package itemsTest;

import items.HealingTools;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolsTest {

    HealingTools healingTools;

    @Before
    public void before(){
        healingTools = new HealingTools("test", 20);
    }

    @Test
    public void canHaveHealthPoints(){
        assertEquals(20, healingTools.getHealthPoints());
    }
}
