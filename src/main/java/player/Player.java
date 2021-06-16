package player;

import behaviours.IWeapon;
import weapons.Hands;

public abstract class Player implements IWeapon {

    private String name;
    private int healthPoints;
    private IWeapon weapon;

    public Player(String name){
        this.name = name;
        this.healthPoints = 100;
        this.weapon = new Hands();
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

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }
}
