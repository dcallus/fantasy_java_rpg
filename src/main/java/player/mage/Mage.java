package player.mage;


import player.Player;
import spells.Spell;
import spells.SpellType;

public abstract class Mage extends Player {

    private Spell spell;

    public Mage(String name) {
        super(name);
        this.spell = null;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public abstract Spell createDefaultSpell();

}
