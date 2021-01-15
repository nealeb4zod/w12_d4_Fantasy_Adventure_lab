package items;

public class Spell extends Item {

    private int damage;

    public Spell(SpellType spell){
        super(spell.getName(), spell.getValue(), , spell.isConsumable()););
        this.damage = spell.getDamage();
    }

    public int getDamage() {
        return damage;
    }
}
