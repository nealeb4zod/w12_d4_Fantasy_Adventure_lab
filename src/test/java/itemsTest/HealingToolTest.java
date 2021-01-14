package itemsTest;

import items.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("test", 20);
    }

    @Test
    public void canHaveHealthPoints(){
        assertEquals(20, healingTool.getHealthPoints());
    }
}
