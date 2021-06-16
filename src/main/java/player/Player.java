package player;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name){
        this.name = name;
        this.healthPoints = 100;
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
}
