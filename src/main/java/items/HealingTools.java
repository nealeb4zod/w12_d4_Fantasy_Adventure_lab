package items;

public class HealingTools extends ItemType {

    private int healthPoints;

    public HealingTools(String name, int healthPoints){
        super(name);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
