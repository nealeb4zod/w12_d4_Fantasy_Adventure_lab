package playersTest.magicUsersTest;

import org.junit.Before;
import org.junit.Test;
import player.magicUser.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard merlin;

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
