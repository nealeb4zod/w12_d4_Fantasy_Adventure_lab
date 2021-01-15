package player.fighter;

import enemies.Enemy;
import items.Weapon;

public abstract class Fighter extends player.Player {

    private Weapon equippedWeapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedWeapon = null;
    }

    public Weapon getEquippedWeapon(){ return equippedWeapon ; }

    public void attack(Weapon weapon, Enemy enemy) { enemy.takeDamage(weapon.getDamage()); }

    public void changeWeapons( Weapon newWeapon) {
        if (equippedWeapon != null){
            addToInventory(equippedWeapon);
        }
        if (getInventory().contains(newWeapon)){
            removeFromInventory(newWeapon);
            equippedWeapon = newWeapon;
        }
    }


}
