package weapons;

import behaviours.IWeapon;

public class Club extends Weapon implements IWeapon {


    public Club(String name, WeaponSize size, int attackPower, int strength) {
        super(name, size, attackPower, strength);
    }

    @Override
    public void attack() {

    }
}
