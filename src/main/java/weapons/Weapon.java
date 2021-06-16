package weapons;

public abstract class Weapon {

    private String name;
    private WeaponSize size;
    private int attackPower;
    private int strength;

    public Weapon(String name, WeaponSize size, int attackPower, int strength) {
        this.name = name;
        this.size = size;
        this.attackPower = attackPower;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponSize getSize() {
        return size;
    }

    public void setSize(WeaponSize size) {
        this.size = size;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
