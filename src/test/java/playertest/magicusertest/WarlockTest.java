package playertest.magicusertest;

import enemies.Enemy;
import enemies.EnemyType;
import items.Spell;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;
import player.magicuser.Warlock;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    private Warlock warlock;
    private Enemy enemy;
    private Spell spell;

    @Before
    public void before() {
        warlock = new Warlock("Voldemort", 3000);
        enemy = new Enemy(EnemyType.TROLL);
        spell = new Spell(SpellType.FIREBALL);
    }

    @Test
    public void canGetName(){
        assertEquals("Voldemort", warlock.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(3000, warlock.getHealthPoints());
    }

    @Test
    public void canCastSpell() {
        warlock.addToInventory(spell);
        warlock.changeSpells(spell);
        warlock.castSpell(warlock.getEquippedSpell(), enemy);
        assertEquals(0, enemy.getHealthPoints());
    }
}
