package player.mage;

import spells.Spell;
import spells.SpellType;

public class Warlock extends Mage {

    public Warlock(String name) {
        super(name);

        //default values for character
        setDamageModifier(0, 1, 1);
        setSpell(createDefaultSpell());
    }

    public Spell createDefaultSpell(){
        Spell spell;
        spell = new Spell("Fireball", 10, SpellType.Fire);
        return spell;
    }

}
