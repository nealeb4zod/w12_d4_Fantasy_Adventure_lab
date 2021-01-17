package player.healer;


import items.HealingTool;
import items.Offense;

public abstract class Healer extends player.Player {

    public Healer(String name, HealerType healerType) {
        super(name, healerType.getType(), healerType.getHealthPoints(), healerType.getAttackBonus(), healerType.getDefenseBonus(), healerType.getSpellBonus(), healerType.getHealBonus());
        Offense weapon = new Offense(healerType.getOffenseType(), 0);
        addToInventory(weapon);
        changeOffense(weapon);
        HealingTool healingTool = new HealingTool(healerType.getHealingToolType());
        for (int i = 0; i < healerType.getHealingToolQuantity(); i++){
            addToInventory(healingTool);
        }
    }

}