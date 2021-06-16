package spells;

public class Spell {

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
}
