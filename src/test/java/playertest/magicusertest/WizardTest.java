package playertest.magicusertest;

import org.junit.Before;
import org.junit.Test;
import player.magicuser.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard merlin;

    @Before
    public void before(){ merlin = new Wizard("Merlin", 85); }

    @Test
    public void canGetName(){
        assertEquals("Merlin", merlin.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(85, merlin.getHealthPoints());
    }
}
