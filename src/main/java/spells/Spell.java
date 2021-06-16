package spells;

import behaviours.ISpell;
import player.Player;

public class Spell implements ISpell {

    private String name;
    private int attackPower;
    private SpellType spellType;

    public Spell(String name, int attackPower, SpellType spellType) {
        this.name = name;
        this.attackPower = attackPower;
        this.spellType = spellType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public void castSpell(Player player){
        player.takeSpellDamage(this.attackPower, this.spellType);
    }


}
