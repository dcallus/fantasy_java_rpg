package player.mage;

import spells.Spell;
import spells.SpellType;

public class Wizard extends Mage {
    public Wizard(String name) {
        super(name);

        //default values for character
        setDamageModifier(1, 1, 0);
        setSpell(createDefaultSpell());
    }

    public Spell createDefaultSpell(){
        Spell spell;
        spell = new Spell("Electric Bolt", 10, SpellType.Electricity);
        return spell;
    }

}
