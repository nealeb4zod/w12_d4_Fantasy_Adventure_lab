package items;

import behaviours.IAttack;

public class Spell extends Item implements IAttack {

    private int damage;
    private int damageModifier;

    public Spell(SpellType spell, int damageModifier){
        super(spell.getName(), spell.getValue(), spell.isConsumable());
        this.damage = spell.getDamage();
        this.damageModifier = damageModifier;
    }

    public int getDamage() {
        return damage;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getTotalDamage() {
        return damage + damageModifier;
    }
}
