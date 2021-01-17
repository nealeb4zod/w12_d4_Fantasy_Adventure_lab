package items;

import behaviours.IAttack;

public class Offense extends Item implements IAttack {

    private int damage;
    private int damageModifier;

    public Offense(OffenseType offenseType, int damageModifier){
        super(offenseType.getName(), offenseType.getValue(), offenseType.isConsumable());
        this.damage = offenseType.getDamage();
        this.damageModifier = damageModifier;
    }

    public int getTotalDamage() {
        return damage + damageModifier;
    }

    public int getDamage() {
        return damage;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

}
