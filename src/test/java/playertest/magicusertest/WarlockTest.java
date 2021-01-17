package playertest.magicusertest;

import enemies.Enemy;
import enemies.EnemyType;
import items.Spell;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;
import player.magicuser.MagicUserType;
import player.magicuser.Warlock;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    private Warlock warlock;
    private Enemy enemy;
    private Spell fireball;

    @Before
    public void before() {
        warlock = new Warlock("Voldemort", MagicUserType.WARLOCK);
        enemy = new Enemy(EnemyType.TROLL);
        fireball = new Spell(SpellType.FIREBALL, 0);
    }


    @Test
    public void canCastSpell() {
        warlock.castSpell(fireball, enemy);
        assertEquals(75, enemy.getHealthPoints());
    }
}
