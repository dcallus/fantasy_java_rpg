package player.fighter;

import behaviours.IWeapon;
import spells.SpellType;
import weapons.Weapon;

public class Dwarf extends Fighter {

    public Dwarf(String name) {
        super(name);

        //default values for character
        this.carryWeight = 3;
        setDamageModifier(1.8, 0.3, 1);
    }



}
