package player.mage;


import player.Player;
import spells.Heal;
import spells.Spell;
import spells.SpellType;

public abstract class Mage extends Player {

    private Spell spell;

    public Mage(String name) {
        super(name);
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void healPlayer(Player player, Heal heal){
        player.healPlayer(heal.getHealPower());
    }

    public void castSpell(Player player){
        this.spell.castSpell(player);
    }

    public abstract Spell createDefaultSpell();

    @Override
    public void takeDamage(int damage){
        int health = getHealthPoints();
        setHealthPoints(health -= damage * 1.5);
    }

}
