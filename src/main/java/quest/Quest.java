package quest;

import enemies.Enemy;
import enemies.EnemyType;
import items.*;
import player.Player;
import player.magicuser.MagicUser;
import rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest {

    private ArrayList<Player> party;

    public Quest() {
        this.party = new ArrayList<Player>();
    }

    public ArrayList<Player> getParty() {
        return party;
    }

    public int getPartySize() {
        int aliveMembers = 0;
        for (Player partyMember : party ) {
            if (partyMember.isAlive()) {
                aliveMembers++;
            }
        }
        return aliveMembers;
    }

    public void addPlayerToParty(Player player) {
        party.add(player);
    }

    public HashMap<String, Integer> getPartyMakeUp() {
        HashMap<String, Integer> partyMakeUp = new HashMap<String, Integer>();
        for (Player player: party) {
            String type = player.getType();
            if(partyMakeUp.containsKey(type)){
                int counter = partyMakeUp.get(type);
                counter++;
                partyMakeUp.put(type, counter);
            } else {
                partyMakeUp.put(type, 1);
            }
        }
        return partyMakeUp;
    }

    public Room generateRoom() {
        Room room = new Room();
        for (int i =0; i < getPartySize(); i++) {
            Treasure bagOfGold = new Treasure(TreasureType.BAGOFGOLD);
            Enemy orc = new Enemy(EnemyType.ORC);
            room.addToTreasureChest(bagOfGold);
            room.addEnemy(orc);
        }
        HashMap<String, Integer> partyMakeUp =  getPartyMakeUp();
        if (partyMakeUp.containsKey("Fighter")) {
            for (int i = 0; i < partyMakeUp.get("Fighter"); i++) {
                Offense randomWeapon = new Offense(OffenseType.values()[new Random().nextInt(OffenseType.values().length)], 0);
                room.addToTreasureChest(randomWeapon);
            }
            Enemy troll = new Enemy(EnemyType.TROLL);
            room.addEnemy(troll);
            Treasure bagOfGems = new Treasure(TreasureType.BAGOFGEMS);
            room.addToTreasureChest(bagOfGems);
        }
        if (partyMakeUp.containsKey("MagicUser")) {
            for (int i = 0; i < partyMakeUp.get("MagicUser"); i++) {
                Spell randomSpell = new Spell(SpellType.values()[new Random().nextInt(SpellType.values().length)], 0);
                room.addToTreasureChest(randomSpell);
            }
            Enemy skeleton = new Enemy(EnemyType.SKELETON);
            room.addEnemy(skeleton);
        }
        if (partyMakeUp.containsKey("Healer")) {
            for (int i = 0; i < partyMakeUp.get("Healer"); i++) {
                HealingTool randomHealingTool = new HealingTool(HealingToolType.values()[new Random().nextInt(HealingToolType.values().length)]);
                room.addToTreasureChest(randomHealingTool);
            }
        }

        return room;
    }
}
