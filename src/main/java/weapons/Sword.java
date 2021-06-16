package weapons;

import behaviours.IWeapon;

public class Sword extends Weapon implements IWeapon {

    public Sword(String name, WeaponSize size, int attackPower, int strength) {
        super(name, size, attackPower, strength);
    }

    @Override
    public void attack() {

    }

}
