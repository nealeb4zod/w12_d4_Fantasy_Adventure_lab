package quest;

import player.Player;
import rooms.Room;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Player> party;
    private ArrayList<Room> dungeon;

    public Quest() {
        this.dungeon = new ArrayList<Room>();
        this.party = new ArrayList<Player>();
    }

    public ArrayList<Player> getParty() {
        return party;
    }

    public ArrayList<Room> getDungeon() {
        return dungeon;
    }

    public void addRoomToDungeon(Room room) {
        dungeon.add(room);
    }

    public void addPlayerToParty(Player player) {
        party.add(player);
    }

    public void generateRoom() {

    }
}
