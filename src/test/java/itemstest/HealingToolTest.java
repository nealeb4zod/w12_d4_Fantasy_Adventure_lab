package itemstest;

import items.HealingTool;
import items.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    private HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool(HealingToolType.POTION);
    }

    @Test
    public void canGetHealingAmount(){
        assertEquals(10, healingTool.getHealingAmount());
    }
}
