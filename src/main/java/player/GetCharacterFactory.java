package player;

import player.fighter.*;
import player.healer.Cleric;
import player.healer.Healer;
import player.healer.HealerType;
import player.magicuser.MagicUser;
import player.magicuser.MagicUserType;
import player.magicuser.Warlock;
import player.magicuser.Wizard;

public class GetCharacterFactory {

    public Player getCharacter (String name, PlayerType playerType, FighterType fighterType) {
        return  getFighter(name, fighterType);
    }

    public Player getCharacter (String name, PlayerType playerType, HealerType healerType) {
        return getHealer(name, healerType);
    }

    public Player getCharacter (String name, PlayerType playerType, MagicUserType magicUserType) {
        return getMagicUser(name, magicUserType);
    }


    public Fighter getFighter(String name, FighterType fighterType) {
        if (fighterType == null) {
            return null;
        }
        if (fighterType == FighterType.BARBARIAN) {
            return new Barbarian(name, fighterType);
        } else if (fighterType == FighterType.DWARF) {
            return new Dwarf(name, fighterType);
        } else if (fighterType == FighterType.KNIGHT) {
            return new Knight(name, fighterType);
        }
        return null;
    }

    public Healer getHealer(String name, HealerType healerType) {
        if (healerType == null) {
            return null;
        }
        if (healerType == HealerType.CLERIC) {
            return new Cleric(name, healerType);
        }
        return null;
    }

    public MagicUser getMagicUser(String name, MagicUserType magicUserType) {
        if (magicUserType == null) {
            return null;
        }
        if (magicUserType == MagicUserType.WARLOCK) {
            return new Warlock(name, magicUserType);
        } else if (magicUserType == MagicUserType.WIZARD) {
            return new Wizard(name, magicUserType);
        }
        return null;
    }

}
