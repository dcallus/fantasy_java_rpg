package player.fighter;

public class Knight extends Fighter {
    public Knight(String name) {
        super(name);

        //default values for character
        this.carryWeight = 5;
        setDamageModifier(0.4, 1.8, 0.2);
    }

}
