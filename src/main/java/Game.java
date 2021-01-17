import player.GetCharacterFactory;
import player.Player;
import player.PlayerType;
import player.fighter.FighterType;
import player.healer.HealerType;
import player.magicuser.MagicUserType;

public class Game {
    GetCharacterFactory characterFactory = new GetCharacterFactory();

    public Player createCharacter(String name, PlayerType playerType, FighterType fighterType){
        return characterFactory.getCharacter(name, playerType, fighterType);
    }

    public Player createCharacter(String name, PlayerType playerType, HealerType healerType){
        return characterFactory.getCharacter(name, playerType, healerType);
    }

    public Player createCharacter(String name, PlayerType playerType, MagicUserType magicUserType){
        return characterFactory.getCharacter(name, playerType, magicUserType);
    }
}
