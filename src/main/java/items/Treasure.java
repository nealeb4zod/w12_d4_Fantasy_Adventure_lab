package items;

public class Treasure extends Item {

    public Treasure(TreasureType treasureType){
        super(treasureType.getName(), treasureType.getValue(), treasureType.isConsumable());
    }

}
