package spells;

public class Heal {

    String name;
    Integer healPower;


    public Heal(String name, Integer healPower) {
        this.name = name;
        this.healPower = healPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealPower() {
        return healPower;
    }

    public void setHealPower(Integer healPower) {
        this.healPower = healPower;
    }
}
