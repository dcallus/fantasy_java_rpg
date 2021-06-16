package player.fighter;

import behaviours.IWeapon;
import player.Player;
import weapons.Weapon;


public abstract class Fighter extends Player {

    public int carryWeight;

    public Fighter(String name) {
        super(name);
    }

    public void setWeapon(Weapon weapon) {
        if (weapon.getSize().getValue() <= this.carryWeight) {
            super.setWeapon(weapon);
        }
    }

    public int getCarryWeight() {
        return carryWeight;
    }

    public void setCarryWeight(int carryWeight) {
        this.carryWeight = carryWeight;
    }
}
