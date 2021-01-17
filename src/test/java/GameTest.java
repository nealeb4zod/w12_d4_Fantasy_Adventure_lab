import enemies.Enemy;
import enemies.EnemyType;
import items.Offense;
import items.OffenseType;
import org.junit.Before;
import org.junit.Test;
import player.Player;
import player.PlayerType;
import player.fighter.Barbarian;
import player.fighter.FighterType;
import player.healer.HealerType;
import player.magicuser.MagicUserType;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private FighterType fighterType;
    private HealerType healerType;
    private MagicUserType magicUserType;

    private PlayerType playerType;

    private Game game;

    private Player barbarian;
    private Player dwarf;
    private Player knight;
    private Player cleric;
    private Player warlock;
    private Player wizard;

    private Enemy troll;


    @Before
    public void before() {
        game = new Game();
        troll = new Enemy(EnemyType.TROLL);
        barbarian = game.createCharacter("Og", PlayerType.FIGHTER,FighterType.BARBARIAN);
        dwarf = game.createCharacter("Jennifer", PlayerType.FIGHTER,FighterType.DWARF);
        knight = game.createCharacter("Sir Prize", PlayerType.FIGHTER,FighterType.KNIGHT);
        cleric = game.createCharacter("Harold", PlayerType.HEALER,HealerType.CLERIC);
        warlock = game.createCharacter("", PlayerType.MAGICUSER,MagicUserType.WARLOCK);
        wizard = game.createCharacter("Og", PlayerType.MAGICUSER,MagicUserType.WIZARD);

    }

    @Test
    public void checkBarbarian() {
        assertEquals(70, barbarian.getHealthPoints());
    }
}
