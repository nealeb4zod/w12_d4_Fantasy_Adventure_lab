import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.Player;
import player.PlayerType;
import player.fighter.FighterType;
import player.healer.HealerType;
import player.magicuser.MagicUserType;
import quest.Quest;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    private Game game;
    private Quest quest;

    private Player barbarian;
    private Player barbarian2;
    private Player dwarf;
    private Player knight;
    private Player cleric;
    private Player warlock;
    private Player wizard;

    @Before
    public void before() {
        game = new Game();
        quest = new Quest();
        barbarian = game.createCharacter("Og", PlayerType.FIGHTER, FighterType.BARBARIAN);
        barbarian2 = game.createCharacter("Ug", PlayerType.FIGHTER, FighterType.BARBARIAN);
        dwarf = game.createCharacter("Jennifer", PlayerType.FIGHTER,FighterType.DWARF);
        knight = game.createCharacter("Sir Prize", PlayerType.FIGHTER,FighterType.KNIGHT);
        cleric = game.createCharacter("Harold", PlayerType.HEALER, HealerType.CLERIC);
        warlock = game.createCharacter("Seamus", PlayerType.MAGICUSER, MagicUserType.WARLOCK);
        wizard = game.createCharacter("Rincewind", PlayerType.MAGICUSER,MagicUserType.WIZARD);

        quest.addPlayerToParty(barbarian);
        quest.addPlayerToParty(barbarian2);
        quest.addPlayerToParty(dwarf);
        quest.addPlayerToParty(knight);
        quest.addPlayerToParty(cleric);
        quest.addPlayerToParty(warlock);
        quest.addPlayerToParty(wizard);
    }

    @Test
    public void canGetPartySize() {
        assertEquals(7, quest.getPartySize());
    }

    @Test
    public void canGetPartyMakeUp() {
        assertEquals(4, (long)quest.getPartyMakeUp().get("Fighter"));
    }

    @Test
    public void canGenerateRoom() {
        Room room = quest.generateRoom();
        assertEquals(9, room.getEnemies().size());
    }
}
