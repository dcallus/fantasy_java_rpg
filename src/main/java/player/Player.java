package player;

import behaviours.IWeapon;
import spells.Spell;
import spells.SpellType;
import weapons.Hands;

import java.util.HashMap;

public abstract class Player {

    private String name;
    private int healthPoints;
    private IWeapon weapon;
    private HashMap<SpellType, Double> damageModifier;

    public Player(String name){
        this.name = name;
        this.healthPoints = 100;
        this.weapon = new Hands();
        this.damageModifier = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void healPlayer(int healAmount) {
        this.healthPoints += healAmount;
    }

    public void attack(Player player){
        this.weapon.attack(player);
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void takeSpellDamage(int damage, SpellType spellType){
        this.healthPoints -= damage * damageModifier.get(spellType);
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon){
        this.weapon = weapon;
    };

    public void setDamageModifier(double fireValue, double iceValue, double electricValue) {
        damageModifier.put(SpellType.Fire, fireValue);
        damageModifier.put(SpellType.Ice, iceValue);
        damageModifier.put(SpellType.Electricity, electricValue);
    }

    public double getDamageModifier(SpellType spellType) {
        return damageModifier.get(spellType);
    }


}
