package weapons;

import behaviours.IWeapon;

public class Axe extends Weapon implements IWeapon {


    public Axe(String name, WeaponSize size, int attackPower, int strength) {
        super(name, size, attackPower, strength);
    }

    @Override
    public void attack() {

    }
}
