package player.fighter;

import spells.SpellType;

import java.util.HashMap;

public class Barbarian extends Fighter {

    public Barbarian(String name) {
        super(name);

        //default values for character
        this.carryWeight = 4;
//        this.damageModifier = new HashMap<>();
        setDamageModifier(0.9, 1.3, 0.5);
    }


}
