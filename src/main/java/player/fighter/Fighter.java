package player.fighter;

import behaviours.IWeapon;
import player.Player;
import weapons.Weapon;


public abstract class Fighter extends Player {

    public int carryWeight;

    public Fighter(String name) {
        super(name);
        this.carryWeight = carryWeight;

    }

    public void setWeapon(Weapon weapon) {
        if (weapon.getSize().getValue() <= this.carryWeight) {
            super.setWeapon((IWeapon) weapon);
        }
    }

    public int getCarryWeight() {
        return carryWeight;
    }

    public void setCarryWeight(int carryWeight) {
        this.carryWeight = carryWeight;
    }
}
