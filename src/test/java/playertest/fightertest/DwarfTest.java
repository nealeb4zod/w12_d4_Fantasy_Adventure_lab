package playertest.fightertest;

import enemies.Enemy;
import enemies.EnemyType;
import items.Offense;
import items.OffenseType;
import player.fighter.Dwarf;
import org.junit.Before;
import org.junit.Test;
import player.fighter.FighterType;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    private Offense axe;
    private Dwarf thorin;
    private Enemy orc;

    @Before
    public void before(){
        thorin = new Dwarf("Thorin", FighterType.DWARF);
        orc = new Enemy(EnemyType.ORC);
        axe = new Offense(OffenseType.AXE, 15);
    }


}
