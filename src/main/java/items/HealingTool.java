package items;

public class HealingTool extends ItemType {

    private int healthPoints;

    public HealingTool(String name, int healthPoints){
        super(name);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
