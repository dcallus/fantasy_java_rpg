package weapons;

import behaviours.IWeapon;
import player.Player;

public class Hands implements IWeapon {

    private String name;
    private int attackPower;

    public Hands() {
        this.name = "Bare Hands";
        this.attackPower = 1;
    }


    @Override
    public void attack(Player player) {
        player.takeDamage(this.attackPower);
    }
}
