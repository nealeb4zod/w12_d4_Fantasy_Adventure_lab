package itemstest;

import items.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    private HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("potion", 20, true, 20);
    }

    @Test
    public void canHaveHealthPoints(){
        assertEquals(20, healingTool.getHealingAmount());
    }
}
