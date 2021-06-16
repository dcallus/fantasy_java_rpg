package enemy;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(){
        this.healthPoints = 100;
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
